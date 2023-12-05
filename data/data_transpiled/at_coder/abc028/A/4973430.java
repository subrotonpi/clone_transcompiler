public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  if ( n == 100 ) {
    System . out . println ( "Perfect" ) ;
  }
  else if ( 90 <= n && n <= 99 ) {
    System . out . println ( "Great" ) ;
  }
  else if ( 60 <= n && n <= 89 ) {
    System . out . println ( "Good" ) ;
  }
  else {
    System . out . println ( "Bad" ) ;
  }
}
