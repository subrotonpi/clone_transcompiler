public static int getGreen ( ) {
  int r = Integer . parseInt ( input . nextLine ( ) ) ;
  int g = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( ( 100 * r + 10 * g + b ) % 4 == 0 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return r ;
}
