public static int x = Integer . parseInt ( input ) {
  int [ ] y = new int [ 33 ] ;
  for ( int i = 1 ;
  i <= 33 ;
  i ++ ) {
    for ( int j = 2 ;
    j <= 11 ;
    j ++ ) {
      y [ j ] = i * j ;
    }
  }
  int ans = 1 ;
  for ( int i : y ) {
    if ( i <= x ) {
      ans = Math . max ( ans , i ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
