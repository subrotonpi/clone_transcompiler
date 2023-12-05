public static int N ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans += N - i ;
  }
  return ans ;
}
