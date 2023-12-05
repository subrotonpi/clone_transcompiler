public static int r ( ) {
  int r = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( r < 1200 ) {
    System . out . println ( "ABC" ) ;
  }
  else if ( r < 2800 ) {
    System . out . println ( "ARC" ) ;
  }
  else {
    System . out . println ( "AGC" ) ;
  }
  return r ;
}
