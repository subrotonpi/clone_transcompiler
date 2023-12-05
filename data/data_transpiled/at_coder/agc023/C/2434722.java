public static void input ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int MOD = 10 * 9 + 7 ;
  int [ ] fact = new int [ N + 1 ] ;
  int r ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    fact [ i ] = r = i * fact [ i - 1 ] % MOD ;
  }
  int [ ] cnts = new int [ N + 1 ] ;
  int rev = 1 ;
  for ( int K = N - 1 ;
  K > ( N + 1 ) / 2 - 1 ;
  K -- ) {
    cnts [ K ] = fact [ K ] * fact [ K - 1 ] * rev % MOD ;
    rev = rev * ( 2 * K - N ) * ( 2 * K - N - 1 ) % MOD ;
  }
  int ans = 0 ;
  for ( int K = ( N + 1 ) / 2 ;
  K < N ;
  K ++ ) {
    ans += ( cnts [ K ] - cnts [ K - 1 ] ) * K % MOD ;
    ans %= MOD ;
  }
  ans = ( ans * Math . pow ( fact [ N - 2 ] , MOD - 2 , MOD ) ) % MOD ;
  System . out . println ( ans ) ;
}
