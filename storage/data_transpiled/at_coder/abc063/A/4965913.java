public static int print ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  if ( a + b >= 10 ) {
    System . out . println ( "error" ) ;
  }
  else {
    System . out . println ( a + b ) ;
  }
  return a ;
}
