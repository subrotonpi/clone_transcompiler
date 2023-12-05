public static int x ( ) {
  int x = input . nextInt ( ) ;
  int ans = x / 11 * 2 ;
  x %= 11 ;
  if ( x == 0 ) {
    System . out . println ( ans ) ;
  }
  else if ( x <= 6 ) {
    System . out . println ( ans + 1 ) ;
  }
  else {
    System . out . println ( ans + 2 ) ;
  }
  return ans ;
}
