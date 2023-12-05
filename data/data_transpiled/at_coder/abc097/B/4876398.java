public static int X = Integer . parseInt ( input ) {
  int ans = 1 ;
  for ( int b = 1 ;
  b < X ;
  b ++ ) {
    for ( int p = 2 ;
    p < X ;
    p ++ ) {
      int x = b * p ;
      if ( x <= X ) {
        ans = Math . max ( ans , x ) ;
      }
      else {
        break ;
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
