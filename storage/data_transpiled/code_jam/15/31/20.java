public static void print ( int tc ) {
  for ( tc = 1 ;
  tc <= Integer . parseInt ( readLine ( ) ) ;
  tc ++ ) {
    int r = Integer . parseInt ( readLine ( ) ) ;
    int c = Integer . parseInt ( readLine ( ) ) ;
    int w = Integer . parseInt ( readLine ( ) ) ;
    int t = r * ( c / w ) - 1 ;
    t += Math . min ( w + 1 , ( c % w ) + w ) ;
    System . out . println ( "Case #" + tc + ": " + t ) ;
  }
}
