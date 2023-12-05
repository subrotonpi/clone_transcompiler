public static int bKindergarten ( int N , int K ) {
  final int remain = K % N ;
  final int ans ;
  if ( K < N ) {
    ans = Math . factorial ( N + K - 1 ) / ( Math . factorial ( K ) * Math . factorial ( N - 1 ) ) ;
  }
  else {
    ans = Math . factorial ( N ) / ( Math . factorial ( remain ) * Math . factorial ( N - remain ) ) ;
  }
  return ans % ( 10 * 9 + 7 ) ;
}
