public static int ncr ( int n , int r ) {
  N = Integer . parseInt ( input ( ) ) ;
  K = Integer . parseInt ( input ( ) ) ;
  MOD = 10 * 9 + 7 ;
  MAXN = N + K + 10 ;
  int [ ] fac = new int [ MAXN ] ;
  int [ ] finv = new int [ MAXN ] ;
  int [ ] inv = new int [ MAXN ] ;
  inv [ 0 ] = 1 ;
  inv [ 1 ] = 0 ;
  for ( int i = 2 ;
  i <= MAXN ;
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
