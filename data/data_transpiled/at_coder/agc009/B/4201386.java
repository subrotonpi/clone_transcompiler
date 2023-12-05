static final int [ ] getDepths ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  int n = Integer . parseInt ( input ) ;
  int [ ] ps = new int [ n ] ;
  int [ ] cs = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    ps [ i ] = a - 1 ;
    cs [ a - 1 ] [ i ] = i ;
  }
  int [ ] depths = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    depths [ i ] = 10 * 10 ;
  }
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( cs [ i ] == null ) depths [ i ] = 0 ;
  }
  /*for(int i = 0; i < n; i++) {
  depths[i] = 10*9;
  }*/
  List < Integer > dList = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    dList . add ( ps [ i ] ) ;
  }
  int Ma = 0 ;
  for ( int d = 0 ;
  d < n ;
  d ++ ) {
    Ma = Math . max ( Ma , d + i + 1 ) ;
  }
  depths [ d ] = Ma ;
  return dList . toArray ( new Integer [ 0 ] ) ;
}
