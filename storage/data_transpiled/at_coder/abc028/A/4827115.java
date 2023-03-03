public static int N ( ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N == 100 ) {
    System . out . println ( "Perfect" ) ;
  }
  else if ( N >= 90 ) {
    System . out . println ( "Great" ) ;
  }
  else if ( N >= 60 ) {
    System . out . println ( "Good" ) ;
  }
  else {
    System . out . println ( "Bad" ) ;
  }
  return N ;
}
