@ GwtIncompatible ( "collections.collections.deque" ) public static int [ ] [ ] flow ( int number ) {
  class Dinic {
    int [ ] [ ] table = new int [ number ] [ number ] ;
    int n = number ;
    int [ ] [ ] visit = new int [ n ] [ n ] ;
    int [ ] [ ] h = new int [ n ] [ n ] ;
    int i = 0 ;
    for ( int p : P ) {
      if ( p > 0 ) {
        visit [ i ] = 0 ;
      }
    }
    System . out . println ( num - ans ) ;
  }
  int [ ] [ ] ans = new int [ n ] [ n + 1 ] ;
  int num = 0 ;
  for ( int p : range ( 0 , n ) ) {
    for ( int p : range ( 0 , n ) ) {
      if ( visit [ p ] == - 1 && table [ p ] [ p ] > 0 ) {
        visit [ p ] = visit [ p ] + 1 ;
        h [ p ] ++ ;
      }
    }
  }
  int [ ] [ ] h = new int [ n ] [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    h [ i ] = i ;
  }
  int [ ] [ ] h = new int [ n ] [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    h [ i ] = i ;
  }
  int [ ] [ ] dfs = new int [ n ] [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    dfs [ i ] = dfs [ i ] [ i ] ;
    if ( visit [ i ] > 0 && table [ i ] [ i ] > 0 ) {
      dfs [ i ] = dfs [ i ] + 1 ;
      if ( dfs [ i ] > 0 ) {
        dfs [ i ] -= dfs [ i ] ;
        table [ i ] [ i ] += dfs [ i ] ;
        return dfs ;
      }
    }
  }
  return ans ;
}
