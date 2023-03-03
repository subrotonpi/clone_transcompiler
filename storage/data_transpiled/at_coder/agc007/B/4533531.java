static final void main ( String [ ] args ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  String input = args [ 0 ] ;
  int N = Integer . parseInt ( input ) ;
  List < Integer > P = Lists . newArrayList ( ) ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    P . add ( i ) ;
  }
}
