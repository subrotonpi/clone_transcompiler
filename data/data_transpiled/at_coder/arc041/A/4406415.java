public static int x = Integer . parseInt ( input ) {
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( y >= k ) {
    System . out . println ( x + k ) ;
  }
  else {
    System . out . println ( y + x - ( k - y ) ) ;
  }
  return y ;
}
