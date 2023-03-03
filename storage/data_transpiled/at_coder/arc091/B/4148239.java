public static int N ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  for ( int b = 1 ;
  b <= N ;
  b ++ ) {
    int p = N / b ;
    int r = N % b ;
    ans += Math . max ( 0 , b - K ) * p + Math . max ( 0 , r - K + 1 ) ;
    if ( K == 0 ) ans -- ;
  }
  return ans ;
}
