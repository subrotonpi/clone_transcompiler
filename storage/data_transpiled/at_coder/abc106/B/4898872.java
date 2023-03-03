public static int N = Integer . parseInt ( input ) {
  int ans = 0 ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    int cnt = 0 ;
    for ( int j = 1 ;
    j <= i ;
    j ++ ) {
      if ( i % j == 0 ) {
        cnt ++ ;
      }
    }
    if ( cnt == 8 && i % 2 != 0 ) {
      ans ++ ;
    }
  }
  return ans ;
}
