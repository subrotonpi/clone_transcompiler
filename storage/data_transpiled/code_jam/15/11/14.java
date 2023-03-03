public static void input ( ) {
  T = input . nextInt ( ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    int n = input . nextInt ( ) ;
    int [ ] v = map . get ( ) ;
    int x = 0 ;
    int y = 0 ;
    int z = 0 ;
    for ( int i = 0 ;
    i < n - 1 ;
    i ++ ) {
      if ( v [ i ] > v [ i + 1 ] ) {
        x += v [ i ] - v [ i + 1 ] ;
        y = Math . max ( y , v [ i ] - v [ i + 1 ] ) ;
      }
    }
    for ( int i = 0 ;
    i < n - 1 ;
    i ++ ) {
      z += Math . min ( v [ i ] , y ) ;
    }
    System . out . println ( "Case #" + ( t + 1 ) + ": " + x + " " + z ) ;
  }
}
