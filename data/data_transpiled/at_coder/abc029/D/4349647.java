public static int N ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int ans = 0 ;
  for ( int k = 0 ;
  k < 9 ;
  k ++ ) {
    ans += 10 * k * ( N / ( 10 * ( k + 1 ) ) ) ;
    if ( N % ( 10 * ( k + 1 ) ) >= 10 * k ) {
      ans += Math . min ( 2 * 10 * k , N % ( 10 * ( k + 1 ) ) + 1 ) - 10 * k ;
    }
  }
  return ans ;
}
