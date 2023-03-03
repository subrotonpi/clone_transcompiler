static final void main ( int n ) {
  System . setSecurityManager ( new SecurityManager ( ) {
    @ Override public void checkPermission ( Permission permission ) {
      int [ ] a = new int [ n ] ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) a [ i ] = i ;
    }
  }
  ) ;
}
