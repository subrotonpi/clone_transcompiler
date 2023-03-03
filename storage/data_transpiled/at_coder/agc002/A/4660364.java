public static void print ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  if ( a <= 0 && b >= 0 ) {
    System . out . println ( "Zero" ) ;
  }
  else if ( a > 0 && b > 0 ) {
    System . out . println ( "Positive" ) ;
  }
  else {
    System . out . println ( ( b - a + 1 ) % 2 == 0 ? "Positive" : "Negative" ) ;
  }
}
