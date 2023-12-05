public static int input ( ) {
  int N = A . length ( ) ;
  int cnt = 0 ;
  for ( int i = 0 ;
  i < N / 2 ;
  i ++ ) {
    if ( A [ i ] != A [ N - 1 - i ] ) {
      cnt ++ ;
    }
  }
  int ans = N / 2 * 2 * 25 ;
  ans -= 2 * ( cnt == 1 ? 1 : 0 ) ;
  ans += N % 2 * 25 * ( cnt > 0 ? 1 : 0 ) ;
  return ans ;
}
