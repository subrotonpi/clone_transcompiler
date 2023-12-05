public static int N ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( K == 0 ) {
    System . out . println ( N * N ) ;
    exit ( ) ;
  }
  int ans = 0 ;
  for ( int b = 1 ;
  b <= N ;
  b ++ ) {
    int p = N / b ;
    int r = N % b ;
    ans += p * Math . max ( 0 , b - K ) + Math . max ( 0 , r - K + 1 ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
