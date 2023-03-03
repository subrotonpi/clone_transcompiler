public static int N ( ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N <= 59 ) {
    System . out . println ( "Bad" ) ;
  }
  else if ( N <= 89 ) {
    System . out . println ( "Good" ) ;
  }
  else if ( N <= 99 ) {
    System . out . println ( "Great" ) ;
  }
  else if ( N == 100 ) {
    System . out . println ( "Perfect" ) ;
  }
  return N ;
}
