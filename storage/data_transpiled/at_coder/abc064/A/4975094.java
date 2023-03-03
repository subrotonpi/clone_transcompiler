public static int getInt ( ) {
  int r = Integer . parseInt ( input . nextLine ( ) ) ;
  int g = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  r *= 100 ;
  g *= 10 ;
  if ( ( r + g + b ) % 4 == 0 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return r ;
}
