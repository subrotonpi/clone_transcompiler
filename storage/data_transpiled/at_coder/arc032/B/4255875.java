public static void UnionFind ( int N ) {
  int [ ] parent = new int [ N ] ;
  int [ ] rank = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    parent [ i ] = i ;
    rank [ i ] = 0 ;
  }
  int x = 0 ;
  int y = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    parent [ i ] = i ;
    rank [ i ] = 0 ;
  }
  int x = 0 ;
  int y = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    x = parent [ i ] ;
    y = parent [ i ] ;
    if ( x == y ) return ;
    if ( rank [ x ] < rank [ y ] ) parent [ x ] = y ;
    else {
      parent [ y ] = x ;
      if ( parent [ x ] == parent [ y ] ) rank [ x ] ++ ;
    }
  }
  int same = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    N = N + 1 ;
  }
  UnionFind unionFind = new UnionFind ( N ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans = unionFind . find ( i ) ;
  }
  System . out . println ( ans - 1 ) ;
}
