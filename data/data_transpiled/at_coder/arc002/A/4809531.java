public static int y ( ) {
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( y % 400 == 0 ) {
    System . out . println ( "YES" ) ;
    exit ( ) ;
  }
  return y ;
}
