public static void testSum ( ) {
  for ( int test : xrange ( testSum ) ) {
    int c = Integer . parseInt ( readLine ( ) ) ;
    int d = Integer . parseInt ( readLine ( ) ) ;
    int v = Integer . parseInt ( readLine ( ) ) ;
    int [ ] coins = new int [ d ] ;
    for ( int i = 0 ;
    i < coins . length ;
    i ++ ) {
      coins [ i ] = readLine ( ) ;
    }
    int [ ] ansCoins = new int [ coins . length ] ;
    int now = 0 ;
    int ans = 0 ;
    int i = 0 ;
    while ( now < v ) {
      if ( i < coins . length && ( coins [ i ] <= now + 1 ) ) {
        ansCoins [ i ] = coins [ i ] ;
        now = now + coins [ i ] * c ;
        i = i + 1 ;
      }
      else {
        ansCoins [ i ] = now + 1 ;
        ans = ans + 1 ;
        now = now + ( now + 1 ) * c ;
      }
    }
    System . out . println ( "Case #" + ( test + 1 ) + ":" + ans ) ;
  }
}
