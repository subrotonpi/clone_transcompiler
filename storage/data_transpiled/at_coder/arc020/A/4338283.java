static final String getStdOut ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  Scanner input = new Scanner ( System . in ) ;
  int A = Math . abs ( Integer . parseInt ( input . nextLine ( ) ) ) , B = Math . abs ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  if ( A == B ) {
    System . out . println ( "Draw" ) ;
  }
  else if ( A > B ) {
    System . out . println ( "Bug" ) ;
  }
  else {
    System . out . println ( "Ant" ) ;
  }
  return "" ;
}
