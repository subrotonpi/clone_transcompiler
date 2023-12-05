public static int X = Integer . parseInt ( input ) {
  int ans = 1 ;
  for ( int i = 2 ;
  i <= ( int ) ( X * 0.5 ) ;
  i ++ ) {
    for ( int p = 2 ;
    p < 11 ;
    p ++ ) {
      if ( i * p > X ) {
        ans = Math . max ( ans , i * ( p - 1 ) ) ;
        break ;
      }
    }
  }
  return ans ;
}
