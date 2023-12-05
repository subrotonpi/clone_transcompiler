static final int [ ] S ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] s = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) s [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  if ( 0 == s [ n ] ) {
    ans = n ;
    System . exit ( 0 ) ;
  }
  int left = 0 ;
  int right = 0 ;
  int prod_s = 1 ;
  while ( right < n ) {
    if ( prod_s * s [ right ] <= k ) {
      prod_s *= s [ right ] ;
      right ++ ;
      ans = Math . max ( ans , right - left ) ;
    }
    else {
      prod_s /= s [ left ] ;
      left ++ ;
    }
  }
  return s ;
}
