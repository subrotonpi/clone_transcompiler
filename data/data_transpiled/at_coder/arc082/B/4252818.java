static final void main ( String [ ] args ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  Scanner input = new Scanner ( System . in ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  int seq = 0 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] -= A [ i ] ;
  }
}
