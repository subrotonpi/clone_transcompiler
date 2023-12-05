public static int N ( ) {
  int N , K ;
  if ( K == 0 ) {
    ans = N * N ;
  }
  else {
    ans = 0 ;
    for ( int b = K + 1 ;
    b <= N ;
    b ++ ) {
      ans += ( b - K ) * ( N / b ) + Math . max ( 0 , N % b - K + 1 ) ;
    }
  }
  return ans ;
}
