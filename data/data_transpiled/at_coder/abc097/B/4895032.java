public static int X = Integer . parseInt ( input ) {
  int r = ( int ) ( X * 0.5 ) ;
  int ans = 0 ;
  for ( int i = 1 ;
  i <= r ;
  i ++ ) {
    int a = 0 ;
    for ( int j = 1 ;
    j < 11 ;
    j ++ ) {
      if ( i * j <= X ) {
        a = i * j ;
      }
      else {
        break ;
      }
    }
    ans = Math . max ( ans , a ) ;
  }
  return ans ;
}
