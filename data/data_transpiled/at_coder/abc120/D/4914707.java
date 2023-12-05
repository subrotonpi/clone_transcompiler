public static void UnionFind ( int n ) {
  int [ ] par = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) par [ i ] = i ;
  rank = new int [ n + 1 ] ;
  nsize = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    par [ i ] = i ;
  }
  int x ;
  int y ;
  int t ;
  UnionFind uf ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    x = par [ i ] ;
    y = par [ i ] ;
    if ( rank [ x ] < rank [ y ] ) {
      par [ x ] = y ;
      nsize [ y ] += nsize [ x ] ;
    }
    else {
      if ( x != y ) nsize [ x ] += nsize [ y ] ;
      par [ y ] = x ;
      if ( rank [ x ] == rank [ y ] ) rank [ x ] ++ ;
    }
  }
  /* length */
  t = par [ n ] ;
  return nsize [ t ] ;
  /* same check */
}
