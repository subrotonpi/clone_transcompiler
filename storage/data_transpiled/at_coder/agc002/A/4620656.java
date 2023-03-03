public static void main ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  if ( a > 0 ) {
    System . out . println ( "Positive" ) ;
  }
  else if ( a * b <= 0 ) {
    System . out . println ( "Zero" ) ;
  }
  else if ( ( b - a ) & 1 ) {
    System . out . println ( "Positive" ) ;
  }
  else {
    System . out . println ( "Negative" ) ;
  }
}
