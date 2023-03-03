static final int [ ] getHeight ( int i ) {
  System . setSecurityManager ( new SecurityManager ( ) {
    @ Override public void checkPermission ( Permission permission ) {
    }
  }
  ) ;
  int N = Integer . parseInt ( input ( ) ) ;
  won = new ArrayList < > ( N ) ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    won . add ( new ArrayList < > ( ) ) ;
  }
  for ( int j = 1 ;
  j < N ;
  j ++ ) {
    won . get ( j ) . add ( j ) ;
  }
  return won . get ( j ) ;
}
