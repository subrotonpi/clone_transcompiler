public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int MOD = 1777777777 ;
  N %= MOD ;
  int r = 1 ;
  for ( int i = 1 ;
  i <= K ;
  i ++ ) {
    r = ( r * i ) % MOD ;
  }
  int ans = Math . pow ( r , MOD - 2 , MOD ) ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    ans *= ( N - i ) ;
    ans %= MOD ;
  }
  int a = 0 ;
  int b = 1 ;
  for ( int i = 2 ;
  i <= K ;
  i ++ ) {
    a = b ;
    b = i * ( a + b ) % MOD ;
  }
  ans *= b ;
  ans %= MOD ;
  System . out . println ( ans ) ;
  return ans ;
}
