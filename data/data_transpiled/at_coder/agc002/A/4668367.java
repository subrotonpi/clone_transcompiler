public static void main ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  if ( 0 < a && a <= b ) {
    System . out . println ( "Positive" ) ;
  }
  else if ( a <= b && b < 0 ) {
    if ( ( b - a + 1 ) % 2 == 0 ) {
      System . out . println ( "Positive" ) ;
    }
    else {
      System . out . println ( "Negative" ) ;
    }
  }
  else {
    System . out . println ( "Zero" ) ;
  }
}
