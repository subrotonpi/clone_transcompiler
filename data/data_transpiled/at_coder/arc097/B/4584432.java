public static void UnionFind ( int n ) {
  int [ ] par = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) par [ i ] = i ;
  rank = new int [ n + 1 ] ;
  size = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( par [ i ] == par [ i ] ) {
      return ;
    }
    else {
      par [ i ] = find ( par [ i ] ) ;
      return ;
    }
  }
  boolean sameCheck = false ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = par [ i ] ;
    int y = par [ i ] ;
    if ( rank [ x ] < rank [ y ] ) {
      if ( sameCheck && x != rank [ y ] ) {
        size [ y ] += size [ x ] ;
        size [ x ] = 0 ;
      }
      par [ x ] = y ;
    }
    else {
      if ( sameCheck && x != rank [ y ] ) {
        size [ x ] += size [ y ] ;
        size [ y ] = 0 ;
      }
      par [ y ] = x ;
      if ( rank [ x ] == rank [ y ] ) rank [ x ] ++ ;
    }
  }
  int siz = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = par [ i ] ;
    int y = par [ i ] ;
    uf = new UnionFind ( N ) ;
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      int x = par [ i ] ;
      int y = par [ i ] ;
      uf . union ( x , y ) ;
    }
    int c = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( uf . find ( p [ i ] ) == uf . find ( i + 1 ) ) c ++ ;
    }
    System . out . println ( c ) ;
  }
}
