static final void main ( String input ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  input = System . in ;
  int N = Integer . parseInt ( input ) ;
  int [ ] A = new int [ N ] ;
  for ( int a = 0 ;
  a < N ;
  a ++ ) {
    A [ a ] = A [ a ] ;
  }
  dp = new int [ N + 1 ] ;
}
