public static void print ( String s ) {
  int a = Integer . parseInt ( s ) ;
  int b = Integer . parseInt ( s ) ;
  if ( a + b >= 10 ) {
    System . out . println ( "error" ) ;
  }
  else {
    System . out . println ( String . valueOf ( a + b ) ) ;
  }
}
