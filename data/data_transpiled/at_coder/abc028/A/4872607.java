public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  if ( n < 60 ) {
    System . out . println ( "Bad" ) ;
  }
  else if ( n < 90 ) {
    System . out . println ( "Good" ) ;
  }
  else if ( n < 100 ) {
    System . out . println ( "Great" ) ;
  }
  else {
    System . out . println ( "Perfect" ) ;
  }
}
