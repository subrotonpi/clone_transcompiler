public static int x = Integer . parseInt ( input ) {
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( k <= y ) {
    System . out . println ( x + k ) ;
  }
  else {
    System . out . println ( x + 2 * y - k ) ;
  }
  return x ;
}
