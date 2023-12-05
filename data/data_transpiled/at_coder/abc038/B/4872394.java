public static void print ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int c = Integer . parseInt ( input ) ;
  int d = Integer . parseInt ( input ) ;
  if ( ( a == c ) || ( a == d ) || ( b == c ) || ( b == d ) ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
