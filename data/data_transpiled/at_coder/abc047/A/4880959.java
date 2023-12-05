public static void main ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int c = Integer . parseInt ( input ) ;
  if ( a + b == c || a + c == b || b + c == a ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
