@ VisibleForTesting static int ceil ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = 2 * 10 * 12 ;
  int ans ;
  if ( k == 0 ) {
    ans = m - a ;
  }
  else {
    double x = ( m + 1 / k ) / ( a + 1 / k ) ;
    ans = ceil ( Math . log ( x ) / Math . log ( 1 + k ) ) ;
  }
  return ans ;
}
