public static int ncr ( int W , int H ) {
  int MOD = 10 * 9 + 7 ;
  int N = W + H + 10 ;
  int [ ] fac = new int [ N + 1 ] ;
  int [ ] finv = new int [ N + 1 ] ;
  int [ ] inv = new int [ N + 1 ] ;
  for ( int i = 2 ;
  i <= N ;
  i ++ ) {
    fac [ i ] = fac [ i - 1 ] * i % MOD ;
    inv [ i ] = - inv [ MOD % i ] * ( MOD / i ) % MOD ;
    finv [ i ] = finv [ i - 1 ] * inv [ i ] % MOD ;
  }
  /* ncr */
  if ( n < r ) return 0 ;
  if ( n < 0 || r < 0 ) return 0 ;
  return fac [ n ] * ( finv [ r ] * finv [ n - r ] % MOD ) % MOD ;
  /* nhr */
}
