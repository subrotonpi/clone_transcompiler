public static int N ( ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N < 60 ) {
    System . out . println ( "Bad" ) ;
  }
  else if ( N < 90 ) {
    System . out . println ( "Good" ) ;
  }
  else if ( N < 100 ) {
    System . out . println ( "Great" ) ;
  }
  else {
    System . out . println ( "Perfect" ) ;
  }
  return N ;
}
