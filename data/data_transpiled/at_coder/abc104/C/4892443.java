static final int calc ( int [ ] [ ] wk , int [ ] kouho , int G ) {
  int ans = 0 ;
  for ( int i = 0 ;
  i < D ;
  i ++ ) {
    if ( kouho [ i ] == 1 ) {
      G -= wk [ i ] [ 1 ] + 100 * ( i + 1 ) * wk [ i ] [ 0 ] ;
      ans += wk [ i ] [ 0 ] ;
      wk [ i ] [ 0 ] = 0 ;
    }
  }
  if ( G <= 0 ) {
    return ans ;
  }
  int solve = D - 1 ;
  while ( G > 0 && solve >= 0 ) {
    if ( wk [ solve ] [ 0 ] >= 2 ) {
      wk [ solve ] [ 0 ] -- ;
      G -= 100 * ( solve + 1 ) ;
      ans ++ ;
    }
    if ( wk [ solve ] [ 0 ] <= 1 ) {
      solve -- ;
    }
  }
  return G <= 0 ? ans : 10000 ;
}
