public static void UnionFind ( int n ) {
  int [ ] par = new int [ n + 1 ] ;
  int [ ] rank = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) par [ i ] = i ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) rank [ i ] = 0 ;
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
  void union ( int x , int y ) {
    int x = par [ i ] ;
    int y = par [ i ] ;
    if ( rank [ x ] < rank [ y ] ) par [ x ] = y ;
    else par [ y ] = x ;
    if ( rank [ x ] == rank [ y ] ) rank [ x ] ++ ;
  }
  boolean sameCheck = false ;
}
