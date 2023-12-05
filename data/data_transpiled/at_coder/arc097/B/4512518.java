public static void UnionFind ( int N ) {
  {
    int [ ] table = new int [ N ] ;
    int [ ] rank = new int [ N ] ;
    int [ ] size = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      table [ i ] = i ;
      rank [ i ] = 0 ;
      size [ i ] = 1 ;
    }
    int x , y ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      x = i ;
      y = i ;
      if ( x == y ) return ;
      if ( rank [ x ] < rank [ y ] ) {
        table [ x ] = y ;
        size [ y ] += size [ x ] ;
      }
      else {
        table [ y ] = x ;
        size [ x ] += size [ y ] ;
        if ( rank [ x ] == rank [ y ] ) rank [ x ] ++ ;
      }
    }
  }
  boolean same ( int x , int y ) {
    return find ( x ) == find ( y ) ;
  }
  int count = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    count ++ ;
  }
  N = Integer . parseInt ( input ( ) ) ;
  M = Integer . parseInt ( input ( ) ) ;
  P = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    P [ i ] = i ;
  }
  UnionFind uf = new UnionFind ( N ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    x = Integer . parseInt ( input ( ) ) ;
    y = Integer . parseInt ( input ( ) ) ;
    uf . unite ( x - 1 , y - 1 ) ;
  }
  count = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( uf . same ( P [ i ] - 1 , i ) ) count ++ ;
  }
  System . out . println ( count ) ;
}
