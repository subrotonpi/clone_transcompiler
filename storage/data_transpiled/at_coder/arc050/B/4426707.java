static final void solve ( ) {
  System . setSecurityManager ( new SecurityManager ( ) {
    @ Override public void checkExit ( ) {
    }
  }
  ) ;
  String input = System . getProperty ( "line.separator" ) ;
  int R = Integer . parseInt ( input ) ;
  int B = Integer . parseInt ( input ) ;
  int x = Integer . parseInt ( input ) ;
  int y = Integer . parseInt ( input ) ;
  {
    int rR = R - n ;
    int rB = B - n ;
    if ( rR < 0 || rB < 0 ) {
      return false ;
    }
    return rR / ( x - 1 ) + rB / ( y - 1 ) >= n ;
  }
}
