public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  if ( n == 100 ) {
    System . out . println ( "Perfect" ) ;
  }
  if ( n >= 60 && n <= 89 ) {
    System . out . println ( "Good" ) ;
  }
  if ( n >= 90 && n <= 99 ) {
    System . out . println ( "Great" ) ;
  }
  if ( n <= 59 ) {
    System . out . println ( "Bad" ) ;
  }
}
