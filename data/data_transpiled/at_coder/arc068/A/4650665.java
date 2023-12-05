public static int x ( ) {
  int x = input . nextInt ( ) ;
  int res = x / 11 * 2 ;
  if ( 0 < x % 11 <= 6 ) {
    System . out . println ( res + 1 ) ;
  }
  else if ( x % 11 > 6 ) {
    System . out . println ( res + 2 ) ;
  }
  else {
    System . out . println ( res ) ;
  }
  return res ;
}
