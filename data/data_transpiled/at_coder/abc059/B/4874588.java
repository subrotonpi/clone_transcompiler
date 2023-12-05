static final int input ( ) {
  int A = Integer . parseInt ( input ( ) ) ;
  int B = Integer . parseInt ( input ( ) ) ;
  A = Math . log10 ( A ) ;
  B = Math . log10 ( B ) ;
  if ( A > B ) {
    System . out . println ( "GREATER" ) ;
  }
  else if ( A < B ) {
    System . out . println ( "LESS" ) ;
  }
  else {
    System . out . println ( "EQUAL" ) ;
  }
  return A ;
}
