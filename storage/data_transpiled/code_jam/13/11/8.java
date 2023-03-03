private static int tn = Integer . parseInt ( input ) {
  for ( int t = 1 ;
  t <= tn ;
  t ++ ) {
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    int v = Integer . parseInt ( input . nextLine ( ) ) ;
    int mn = 0 , mx = v ;
    while ( mn < mx ) {
      int av = ( mn + mx + 1 ) / 2 ;
      int tt = 2 * av * ( r + av ) - av ;
      if ( tt > v ) {
        mx = av - 1 ;
      }
      else {
        mn = av ;
      }
    }
    System . out . println ( "Case #" + t + ": " + mn ) ;
  }
  return tn ;
}
