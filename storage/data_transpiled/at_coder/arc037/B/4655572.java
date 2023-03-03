public static int N ( Scanner input ) {
  int M = input . nextInt ( ) ;
  Set < Integer > [ ] edges = new Set [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    edges [ i ] = new HashSet < Integer > ( ) ;
  }
  int [ ] visited = new int [ N ] ;
  int ans = 0 ;
  Stack < Integer > stack = new Stack < Integer > ( ) ;
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
  int ret = 1 ;
  while ( stack . size ( ) > 0 ) {
    int node = stack . pop ( ) ;
    int parent = stack . pop ( ) ;
    visited [ node ] = 1 ;
    for ( int e : edges [ node ] ) {
      if ( e != parent && visited [ e ] == 1 ) {
        ret = 0 ;
      }
      else if ( e != parent && visited [ e ] == 0 ) {
        stack . push ( new Integer ( e ) ) ;
      }
    }
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( visited [ i ] == 0 ) {
      stack . push ( new Integer ( i ) ) ;
      ans += dfs ( i ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
