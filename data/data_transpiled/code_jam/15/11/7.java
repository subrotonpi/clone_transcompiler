public static int T = Integer . parseInt ( readLine ( ) ) {
  for ( int test : xrange ( T ) ) {
    int N = Integer . parseInt ( readLine ( ) ) ;
    int [ ] m = map . get ( readLine ( ) ) ;
    int [ ] delta = new int [ N ] ;
    for ( int i : xrange ( m . length - 1 ) ) {
      delta [ i ] = Math . max ( 0 , m [ i ] - m [ i + 1 ] ) ;
    }
    int y = 0 ;
    int z = 0 ;
    int minrate = Math . max ( delta [ 0 ] , minrate ) ;
    for ( int i : xrange ( m . length - 1 ) ) {
      y += delta [ i ] ;
      z += Math . min ( m [ i ] , minrate ) ;
    }
    System . out . println ( "Case #" + ( test + 1 ) + ": " + y + " " + z ) ;
  }
  return T ;
}
