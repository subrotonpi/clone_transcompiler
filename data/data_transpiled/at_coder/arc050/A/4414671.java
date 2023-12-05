static final void printInput ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  Scanner input = new Scanner ( System . in ) ;
  int C , c ;
  C = input . nextInt ( ) ;
  c = input . nextInt ( ) ;
  if ( ( C - 'A' ) == ( c - 'a' ) ) System . out . println ( "Yes" ) ;
  else System . out . println ( "No" ) ;
}
