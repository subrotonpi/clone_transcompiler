static final void main ( String [ ] args ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  String input = args [ 0 ] ;
  int N = Integer . parseInt ( input ) ;
  int K = Integer . parseInt ( input ) ;
  int [ ] t = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    t [ i ] = Integer . parseInt ( input ) ;
  }
  int s = Integer . parseInt ( t [ 3 ] ) ;
  if ( s < K ) {
    System . out . println ( i + 1 ) ;
    exit ( ) ;
  }
  else {
  }
}
