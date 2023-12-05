private static int paintNeeded ( int r , int n ) {
  return ( 2 * r + 1 + 2 * ( n - 1 ) ) * n ;
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int test = 1 ;
  test <= T ;
  test ++ ) {
    r = Integer . parseInt ( input . nextLine ( ) ) ;
    int t = Integer . parseInt ( input . nextLine ( ) ) ;
    int lo = 1 , hi = t + 1 ;
    while ( hi - lo > 1 ) {
      int med = ( hi + lo ) / 2 ;
      if ( paintNeeded ( r , med ) <= t ) lo = med ;
      else hi = med ;
    }
    System . out . println ( "Case #" + test + ": " + lo ) ;
  }
  return 0 ;
}
