static final void main ( String [ ] args ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  String input = System . getProperty ( "line.separator" ) ;
  int N = Integer . parseInt ( input ) ;
  List < List < Integer >> bal = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    bal . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  }
  int l = 0 ;
  int r = 10 * 15 ;
  /* check mid */
  List < Integer > T = bal ;
  for ( int i = 0 ;
  i < T . size ( ) ;
  i ++ ) {
    T . get ( i ) . add ( ( i + 1 ) ) ;
  }
}
