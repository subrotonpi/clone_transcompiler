public static int N = Integer . parseInt ( input ) {
  int ans = 0 ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    if ( i % 2 == 1 ) {
      int tmp = 0 ;
      for ( int j = 1 ;
      j <= i ;
      j ++ ) {
        if ( i % j == 0 ) tmp ++ ;
        if ( tmp > 8 ) break ;
      }
      if ( tmp == 8 ) ans ++ ;
    }
  }
  return ans ;
}
