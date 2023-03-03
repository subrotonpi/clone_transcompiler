public static void test ( ) {
  int x = input . nextInt ( ) ;
  int r = x % 11 ;
  int ans ;
  if ( r == 0 ) {
    ans = x / 11 * 2 ;
  }
  else if ( r > 6 ) {
    ans = x / 11 * 2 + 2 ;
  }
  else {
    ans = x / 11 * 2 + 1 ;
  }
  System . out . println ( ans ) ;
}
