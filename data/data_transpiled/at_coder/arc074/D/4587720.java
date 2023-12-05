static final String getInput ( ) {
  final Scanner input = new Scanner ( System . in ) ;
  System . setIn ( input ) ;
  @ SuppressWarnings ( "resource" ) final int n = input . nextInt ( ) ;
  final List < Edge > [ ] edges = new List [ n ] ;
  for ( int x = 0 ;
  x < n ;
  x ++ ) {
    final int [ ] s = input . nextInt ( ) . split ( " " ) ;
    for ( int y = 0 ;
    y < s . length ;
    y ++ ) {
      if ( s [ y ] == 'S' ) {
        edges [ x ] = new Edge ( 0 , x + 1 , inf ) ;
        edges [ y ] = new Edge ( 0 , y + 1 , inf ) ;
      }
      else if ( s [ y ] == 'T' ) {
        edges [ x ] = new Edge ( x + 1 , y + 1 , inf ) ;
        edges [ y ] . add ( new Edge ( y + 1 , x + 1 , inf ) ) ;
      }
    }
    final Dinic dinic = new Dinic ( h + 2 , Edges ) ;
    final double mf = dinic . maxflow ( 0 , h + w + 1 ) ;
    System . out . println ( mf == inf ? - 1 : mf ) ;
    edges [ to ] . add ( new Edge ( 0 , h + 1 , inf ) ) ;
    edges [ to ] . add ( new Edge ( 0 , h + 1 , inf ) ) ;
  }
  return "" ;
}
