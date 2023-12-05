public static int parseInt ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int K = Integer . parseInt ( input ) ;
  int ans = 0 ;
  for ( int b = K + 1 ;
  b <= N ;
  b ++ ) {
    ans += N / b * ( b - K ) + Math . max ( 0 , ( N % b ) - K + 1 ) ;
  }
  if ( K == 0 ) {
    ans = N * N ;
  }
  return ans ;
}
