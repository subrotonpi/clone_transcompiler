static final void solve ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  Scanner input = new Scanner ( System . in ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N >= 2 * K ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
