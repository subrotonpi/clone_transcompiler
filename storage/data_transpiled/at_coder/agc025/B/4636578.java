public static int N = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . readLine ( ) ) ;
  int B = Integer . parseInt ( input . readLine ( ) ) ;
  int K = Integer . parseInt ( input . readLine ( ) ) ;
  int MOD = 998244353 ;
  if ( ( A + B ) * N < K ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  int M = N + 5 ;
  int [ ] fac = new int [ M + 1 ] ;
  int [ ] finv = new int [ M + 1 ] ;
  int [ ] inv = new int [ M + 1 ] ;
  for ( int i = 2 ;
  i <= M ;
  i ++ ) {
    fac [ i ] = fac [ i - 1 ] * i % MOD ;
    inv [ i ] = - inv [ MOD % i ] * ( MOD / i ) % MOD ;
    finv [ i ] = finv [ i - 1 ] * inv [ i ] % MOD ;
  }
  int ans = 0 ;
  for ( int a = 0 ;
  a < N + 1 ;
  a ++ ) {
    int rem = K - a * A ;
    if ( rem < 0 ) break ;
    int b = rem / B ;
    int m = m >> 1 ;
    if ( m > 0 ) continue ;
    ans += ncr ( N , a ) * ncr ( N , b ) ;
    ans %= MOD ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
