static int N ( Scanner input , int M ) {
  int [ ] edges = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    edges [ i ] = new HashSet < > ( ) ;
  }
  int [ ] visited = new int [ N ] ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int u = input . nextInt ( ) ;
    int v = input . nextInt ( ) ;
    u = u - 1 ;
    v = v - 1 ;
    edges [ u ] . add ( v ) ;
    edges [ v ] . add ( u ) ;
  }
  /* dfs */
  visited [ N ] = 1 ;
  for ( int e : edges [ N ] ) {
    if ( e != parent && visited [ e ] == 1 ) {
      return 0 ;
    }
    else if ( e != parent && dfs ( e , node ) == 0 ) {
      return 0 ;
    }
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( visited [ i ] == 0 ) {
      ans += dfs ( i , - 1 ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
