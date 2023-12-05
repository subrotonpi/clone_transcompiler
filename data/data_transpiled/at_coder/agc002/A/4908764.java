public static void main ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  if ( a <= 0 && 0 <= b ) {
    System . out . println ( "Zero" ) ;
  }
  else if ( 0 < a || ( b - a ) % 2 != 0 ) {
    System . out . println ( "Positive" ) ;
  }
  else {
    System . out . println ( "Negative" ) ;
  }
}
