static final void main ( String [ ] args ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  Scanner input = new Scanner ( System . in ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( M >= 2 ) {
    System . out . println ( 1 ) ;
  }
  else {
    System . out . println ( 2 ) ;
  }
}
