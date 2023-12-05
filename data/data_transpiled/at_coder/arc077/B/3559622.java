@ VisibleForTesting static int [ ] ncr ( int n , int r ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int MOD = 10 * 9 + 7 ;
  Counter < Integer > ctr = new Counter < > ( A ) ;
  Integer doub = ctr . getCounter ( ) . getValue ( ) ;
  int i1 = A . indexOf ( doub ) ;
  int i2 = N - A . subList ( 0 , A . size ( ) - 1 ) . indexOf ( doub ) ;
  int l = N - ( i2 - i1 ) ;
  int [ ] fac = new int [ N + 1 ] ;
  fac [ 0 ] = 1 ;
  fac [ 1 ] = 1 ;
  int [ ] finv = new int [ N + 1 ] ;
  int [ ] inv = new int [ N + 1 ] ;
  inv [ 0 ] = 0 ;
  for ( int i = 2 ;
  i <= N ;
  i ++ ) {
    fac [ i ] = fac [ i - 1 ] * i % MOD ;
    inv [ i ] = - inv [ MOD % i ] * ( MOD / i ) % MOD ;
    finv [ i ] = finv [ i - 1 ] * inv [ i ] % MOD ;
  }
  int [ ] ans = new int [ N + 1 ] ;
  for ( int n = 1 ;
  n <= N ;
  n ++ ) {
    ans [ n ] = ncr ( N + 1 , n ) ;
  }
  for ( int i = 0 ;
  i <= l ;
  i ++ ) {
    ans [ i ] -= ncr ( l , i ) ;
    ans [ i ] %= MOD ;
  }
  System . out . println ( ( ans ) ) ;
  return ans ;
}
