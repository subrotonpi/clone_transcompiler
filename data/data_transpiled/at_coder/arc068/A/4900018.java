public static int x ( ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int mod = x % 11 ;
  if ( mod == 0 ) {
    System . out . println ( x / 11 * 2 ) ;
  }
  else if ( mod <= 6 ) {
    System . out . println ( x / 11 * 2 + 1 ) ;
  }
  else {
    System . out . println ( x / 11 * 2 + 2 ) ;
  }
  return x ;
}
