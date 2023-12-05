public static void testSum ( ) {
  int testSum = input . nextInt ( ) ;
  for ( int test : xrange ( testSum ) ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    int w = Integer . parseInt ( input . nextLine ( ) ) ;
    int ans = x * ( ( y - 1 ) / w + 1 ) + w - 1 ;
    System . out . println ( "Case #" + ( test + 1 ) + ":" + ans ) ;
  }
}
