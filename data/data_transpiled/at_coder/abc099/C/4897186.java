public static int N = Integer . parseInt ( input ) {
  int ans = N ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    int cnt = 0 ;
    int t = i ;
    while ( t > 0 ) {
      cnt += t % 6 ;
      t /= 6 ;
    }
    int j = N - i ;
    while ( j > 0 ) {
      cnt += j % 9 ;
      j /= 9 ;
    }
    ans = Math . min ( ans , cnt ) ;
  }
  return ans ;
}
