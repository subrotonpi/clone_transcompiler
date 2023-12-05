public static int T = Integer . parseInt ( readLine ( ) ) {
  int T = Integer . parseInt ( readLine ( ) ) ;
  int r , ncircle ;
  for ( int testCase : xrange ( T ) ) {
    System . out . printf ( "Case #%d:" , testCase + 1 ) ;
    r = Integer . parseInt ( readLine ( ) ) ;
    t = Integer . parseInt ( readLine ( ) ) ;
    int low = 1 ;
    int high = 10000000000000000 ;
    while ( high - low > 1 ) {
      int mid = ( low + high ) / 2 ;
      if ( area ( r , mid ) <= t ) low = mid ;
      else high = mid ;
    }
    System . out . println ( low ) ;
  }
  return T ;
}
