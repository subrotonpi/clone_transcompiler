static public String solve ( double vol , double temp , List < Numberjack . Variable > sources ) throws IOException {
  final Numberjack . Model model = new Numberjack . Model ( ) ;
  final Numberjack . VarArray times = new Numberjack . VarArray ( sources . size ( ) , 0.0 , 1e100 ) ;
  final Numberjack . Variable worst = new Numberjack . Variable ( 0.0 , 1e100 ) ;
  final Numberjack . Variable [ ] rates = new Numberjack . Variable [ sources . size ( ) ] ;
  for ( int i = 0 ;
  i < rates . length ;
  i ++ ) {
    rates [ i ] = sources . get ( i ) . doubleValue ( ) ;
  }
  model . add ( new Numberjack . Sum ( times , rates ) . equals ( vol ) ) ;
  final Numberjack . Variable [ ] tmp = new Numberjack . Variable [ sources . size ( ) ] ;
  for ( int i = 0 ;
  i < tmp . length ;
  i ++ ) {
    tmp [ i ] = sources . get ( i ) . doubleValue ( ) * sources . get ( i ) . doubleValue ( ) ;
  }
  model . add ( new Numberjack . Sum ( times , tmp ) . equals ( vol * temp ) ) ;
  for ( int i = 0 ;
  i < sources . size ( ) ;
  i ++ ) {
    model . add ( worst . compareTo ( times [ i ] ) >= 0 ) ;
  }
  model . add ( new Numberjack . Minimize ( worst ) ) ;
  final Numberjack . Solver solver = model . load ( "SCIP" ) ;
  solver . solve ( ) ;
  if ( ! solver . isOpt ( ) ) {
    return "IMPOSSIBLE" ;
  }
  return worst . getValue ( ) + "f" ;
}
