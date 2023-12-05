public static double [ ] [ ] readAllPoints ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> A = new ArrayList < > ( ) ;
  List < List < Integer >> B = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  List < Integer > Ag = new ArrayList < > ( ) ;
  List < Integer > Bg = new ArrayList < > ( ) ;
  Ag . add ( 0 ) ;
  Ag . add ( 0 ) ;
  Bg . add ( 0 ) ;
  Bg . add ( 0 ) ;
  Bg . add ( 1 ) ;
  Ag . add ( 0 ) ;
  Ag . add ( 1 ) ;
  Bg . add ( 0 ) ;
  Bg . add ( 1 ) ;
  double [ ] dA = new double [ N ] ;
  double [ ] dB = new double [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    dA [ i ] = ( ( Ag . get ( 0 ) - A [ i ] ) * ( Ag . get ( 0 ) - A [ i ] ) + ( Ag . get ( 1 ) - A [ i ] ) * ( Bg . get ( 1 ) - B [ i ] ) ) * 0.5 ;
    dB [ i ] = ( ( Bg . get ( 0 ) - B [ i ] ) * ( Bg . get ( 0 ) - B [ i ] ) + ( Bg . get ( 1 ) - B [ i ] ) ) * 0.5 ;
  }
  Arrays . sort ( dA ) ;
  Arrays . sort ( dB ) ;
  System . out . println ( dB [ dB . length - 1 ] / dA [ dB . length - 1 ] ) ;
  return dA ;
}
