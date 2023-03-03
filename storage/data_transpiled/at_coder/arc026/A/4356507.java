static final void main ( String input ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  input = input . trim ( ) ;
  N = Integer . parseInt ( input ) ;
  A = Integer . parseInt ( input ) ;
  B = Integer . parseInt ( input ) ;
  System . out . println ( max ( 0 , ( N - 5 ) ) * A + B * min ( 5 , N ) ) ;
}
