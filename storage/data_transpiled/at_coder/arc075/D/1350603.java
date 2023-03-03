public static int solve ( int d , int K ) {
  int r = 1 ;
  for ( int k = K ;
  k > 1 ;
  k -= 2 ) {
    if ( d >= 10 * k ) {
      return 0 ;
    }
    int t = ( - d ) % 10 ;
    d = Math . abs ( ( d - t * ( 10 * ( k - 1 ) - 1 ) ) / 10 ) ;
    r *= 10 - t - ( K == k ) ;
  }
  return d == 0 ? r * ( 10 * ( K % 2 ) ) : 0 ;
}
