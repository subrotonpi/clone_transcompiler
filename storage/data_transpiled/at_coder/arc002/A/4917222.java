public static void main ( String [ ] args ) {
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( y % 400 == 0 ) {
    System . out . println ( "YES" ) ;
  }
  else if ( y % 100 == 0 ) {
    System . out . println ( "NO" ) ;
  }
  else if ( y % 4 == 0 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
