public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  if ( n <= 59 ) {
    System . out . println ( "Bad" ) ;
  }
  else if ( n <= 89 ) {
    System . out . println ( "Good" ) ;
  }
  else if ( n == 100 ) {
    System . out . println ( "Perfect" ) ;
  }
  else {
    System . out . println ( "Great" ) ;
  }
}
