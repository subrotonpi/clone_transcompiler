public static int X = Integer . parseInt ( input ) {
  int ans = 0 ;
  for ( int b = 1 ;
  b <= 32 ;
  b ++ ) {
    for ( int p = 2 ;
    p <= 10 ;
    p ++ ) {
      if ( b * * p <= X ) {
        ans = Math . max ( ans , b * * p ) ;
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
