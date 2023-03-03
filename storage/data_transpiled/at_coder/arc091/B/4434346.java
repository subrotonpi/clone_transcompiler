public static int N ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( K == 0 ) System . out . println ( N * N ) ;
  exit ( 0 ) ;
  int ans = ( N - K ) * ( N - K + 1 ) / 2 ;
  for ( int b = K + 1 ;
  b < N ;
  b ++ ) {
    int n = ( N - b + 1 ) / b ;
    ans += ( n ) * ( b - K ) ;
    if ( n * b + b - 1 != N ) {
      if ( N % b >= K ) ans += N % b - K + 1 ;
    }
  }
  return ans ;
}
