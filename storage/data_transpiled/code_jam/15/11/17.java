public static int T = Integer . parseInt ( Scanner in ) {
  for ( int z = 1 ;
  z <= T ;
  z ++ ) {
    int N = in . nextInt ( ) ;
    int [ ] l = map . get ( in . nextInt ( ) ) ;
    int a = 0 ;
    int rate = 0 ;
    for ( int i : xrange ( N - 1 ) ) {
      if ( l [ i + 1 ] < l [ i ] ) {
        a += l [ i ] - l [ i + 1 ] ;
        rate = Math . max ( rate , l [ i ] - l [ i + 1 ] ) ;
      }
    }
    int b = 0 ;
    for ( int i : xrange ( N - 1 ) ) {
      b += Math . min ( rate , l [ i ] ) ;
    }
    System . out . println ( "Case #" + z + ": " + a + " " + b ) ;
  }
  return T ;
}
