static final int solve ( ) {
  int t = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int casen : xrange ( t ) ) {
    String line = System . console ( ) . readLine ( ) ;
    String [ ] linea = line . split ( "\\s+" ) ;
    int r = Integer . parseInt ( linea [ 0 ] ) ;
    int t = Integer . parseInt ( linea [ 1 ] ) ;
    int lo = 0 ;
    int hi = 10000000000 ;
    while ( hi > lo + 1 ) {
      int mid = ( lo + hi ) / 2 ;
      if ( 2 * r * mid + ( 2 * mid - 1 ) * mid <= t ) {
        lo = mid ;
      }
      else {
        hi = mid ;
      }
    }
    System . out . println ( "Case #" + ( casen + 1 ) + ": " + lo ) ;
  }
  return t ;
}
