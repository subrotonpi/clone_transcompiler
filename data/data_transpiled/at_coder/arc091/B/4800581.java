public static int N ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  if ( K != 0 ) {
    for ( int b = 1 ;
    b <= N ;
    b ++ ) {
      int p = N / b ;
      ans += Math . max ( 0 , ( b - K ) * p ) + Math . max ( ( N % b ) - K + 1 , 0 ) ;
    }
  }
  else {
    ans = N * N ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
