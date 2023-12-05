static void print ( int n , int m , int s ) {
  Scanner input = new Scanner ( System . in ) ;
  int x [ ] [ ] = new int [ n + 1 ] [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int u = input . nextInt ( ) ;
    int v = input . nextInt ( ) ;
    x [ u ] [ v ] = i ;
    x [ v ] [ u ] = i ;
  }
  @ SuppressWarnings ( "unused" ) int cost [ ] = new int [ n + 1 ] , vis [ s ] = new int [ n + 1 ] , q [ s ] = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    cost [ i ] = i ;
  }
  while ( cost [ s ] > 0 ) {
    int c , p = x [ s ] [ p ] ;
    c = - c ;
    for ( int i = 0 ;
    i < x [ p ] . length ;
    i ++ ) if ( vis [ i ] ) {
      if ( cost [ i ] > c ) cost [ i ] = c ;
      vis [ i ] = false ;
      heappush ( cost , - cost [ i ] , i ) ;
    }
  }
  for ( int i = 1 ;
  i <= n ;
  i ++ ) if ( cost [ i ] == i ) System . out . println ( i ) ;
}
