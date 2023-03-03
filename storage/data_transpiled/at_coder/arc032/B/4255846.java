public static void UnionFind ( int N ) {
  int [ ] parent = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) parent [ i ] = i ;
  rank = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) rank [ i ] = 0 ;
  /* Find the first element */
  if ( parent [ i ] == parent [ i ] ) {
    /* Find the first element */
  }
  else {
    parent [ i ] = find ( parent [ i ] ) ;
    /* Unite the first element */
  }
  /* Find the second element */
  int x = parent [ i ] ;
  int y = parent [ i ] ;
  if ( x == y ) return ;
  if ( rank [ x ] < rank [ y ] ) parent [ i ] = y ;
  else {
    parent [ i ] = x ;
    if ( parent [ i ] == parent [ y ] ) rank [ x ] ++ ;
  }
  /* Same */
}
