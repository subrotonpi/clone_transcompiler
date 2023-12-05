public static int T = Integer . parseInt ( Scanner in ) {
  for ( int z : xrange ( 1 , T + 1 ) ) {
    int r = in . nextInt ( ) ;
    int t = in . nextInt ( ) ;
    int lo = 0 ;
    int hi = 2000000000000000000 ;
    int best = 0 ;
    while ( lo <= hi ) {
      int mid = ( lo + hi ) / 2 ;
      if ( ( 2 * r * mid + 2 * mid * ( mid - 1 ) + mid ) <= t ) {
        best = mid ;
        lo = mid + 1 ;
      }
      else {
        hi = mid - 1 ;
      }
    }
    System . out . println ( "Case #" + z + ": " + best ) ;
  }
  return T ;
}
