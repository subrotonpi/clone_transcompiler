public static int N = Integer . parseInt ( input ) {
  int ans = 0 ;
  int s = ( N / 4 + 1 ) ;
  for ( int i = 0 ;
  i < s ;
  i ++ ) {
    for ( int j = 0 ;
    j < s ;
    j ++ ) {
      if ( 4 * i + 7 * j == N ) ans ++ ;
    }
  }
  return ans != 0 ? ans : - 1 ;
}
