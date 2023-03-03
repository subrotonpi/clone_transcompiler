static final int [ ] range ( int N ) {
  int [ ] a = new int [ N + 1 ] ;
  a [ 0 ] = 0 ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    int [ ] k = new int [ N + 1 ] ;
    k [ 0 ] = a [ i - 1 ] ;
    for ( int j = 1 ;
    j <= 10 ;
    j ++ ) {
      int x = i - 6 * j ;
      if ( x < 0 ) break ;
      k [ j ] = a [ x ] ;
    }
    a [ i ] = Math . min ( k ) + 1 ;
  }
  return a ;
}
