public static int N = Integer . parseInt ( input ) {
  int ans = 1 ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    int a = i % ( 10 * 9 + 7 ) ;
    ans *= a ;
    ans = ans % ( 10 * 9 + 7 ) ;
  }
  return ans ;
}
