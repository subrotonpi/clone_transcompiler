public static int X = Integer . parseInt ( input ) {
  int ans = 1 ;
  for ( int i = 1 ;
  i <= X ;
  i ++ ) {
    for ( int j = 2 ;
    j <= X ;
    j ++ ) {
      int bp = i * j ;
      if ( bp <= X && bp > ans ) {
        ans = bp ;
      }
      if ( X < bp ) {
        break ;
      }
    }
  }
  return ans ;
}
