static final int [ ] getAdjacentList ( int iNow ) {
  System . setSecurityManager ( new SecurityManager ( ) {
    @ Override public void checkPermission ( Permission permission ) {
    }
  }
  ) ;
  int ans = 0 ;
  for ( int i = iNow ;
  i < adjL . length ;
  i ++ ) {
    if ( adjL [ i ] . size ( ) == 0 ) {
      return ;
    }
  }
  List < Integer > Bs = new ArrayList < > ( ) ;
  for ( int i2 : adjL [ iNow ] ) {
    Bs . add ( i2 ) ;
  }
  Collections . sort ( Bs ) ;
  ans = Math . max ( ans , Bs . size ( ) ) ;
  return ans ;
}
