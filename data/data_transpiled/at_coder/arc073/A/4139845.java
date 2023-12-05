@ VisibleForTesting static int [ ] binarySearch ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  int prev = 0 ;
  int ans = 0 ;
  for ( int t : map . values ( ) ) {
    if ( prev != 0 ) {
      if ( t - prev < T ) {
        ans += t - prev ;
      }
      else {
        ans += T ;
      }
    }
    prev = t ;
  }
  ans += T ;
  return ans ;
}
