public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int MOD = ( int ) ( 1e9 + 7 ) ;
  int M = N + K + 10 ;
  int [ ] fac = new int [ M ] , finv = new int [ M ] , inv = new int [ M ] ;
  /* COMinit */
  fac [ 0 ] = 1 ;
  fac [ 1 ] = 1 ;
  finv [ 0 ] = 1 ;
  finv [ 1 ] = 1 ;
  inv [ 1 ] = 1 ;
  for ( int i = 2 ;
  i < MAX ;
  i ++ ) {
    fac [ i ] = fac [ i - 1 ] * i % MOD ;
    inv [ i ] = MOD - inv [ MOD % i ] * ( MOD / i ) % MOD ;
    finv [ i ] = finv [ i - 1 ] * inv [ i ] % MOD ;
  }
  /* COM */
  if ( N > K ) {
    System . out . println ( COM ( N + K - 1 , N - 1 ) ) ;
  }
  else {
    int a = K % N ;
    System . out . println ( COM ( N , a ) ) ;
  }
  return M ;
}
