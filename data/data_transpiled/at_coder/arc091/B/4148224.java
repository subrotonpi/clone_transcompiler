public static int N ( int K ) {
  int ans = 0 ;
  if ( K == 0 ) {
    ans = N * N ;
  }
  else {
    for ( int b = 1 ;
    b <= N ;
    b ++ ) {
      int p = N / b ;
      int r = N % b ;
      ans += Math . max ( 0 , b - K ) * p + Math . max ( 0 , r - K + 1 ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
