public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  if ( n <= 59 ) {
    System . out . println ( "Bad" ) ;
  }
  else if ( n <= 89 ) {
    System . out . println ( "Good" ) ;
  }
  else if ( n <= 99 ) {
    System . out . println ( "Great" ) ;
  }
  else {
    System . out . println ( "Perfect" ) ;
  }
}
