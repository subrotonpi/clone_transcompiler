public static int x = Integer . parseInt ( input ) {
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( k >= x + y ) {
    System . out . println ( y ) ;
  }
  else if ( k >= y ) {
    System . out . println ( 2 * y + x - k ) ;
  }
  else {
    System . out . println ( x + k ) ;
  }
  return x ;
}
