public static int N ( ) {
  int ans = 0 ;
  int k = 10 ;
  while ( k <= N * 10 ) {
    int A = ( N / k ) * ( k / 10 ) ;
    int rest = N % k ;
    int B = 0 ;
    if ( rest >= 2 * k / 10 ) {
      B = k / 10 ;
    }
    else if ( rest >= k / 10 ) {
      B = rest % ( k / 10 ) + 1 ;
    }
    ans += ( A + B ) ;
    k *= 10 ;
  }
  return ans ;
}
