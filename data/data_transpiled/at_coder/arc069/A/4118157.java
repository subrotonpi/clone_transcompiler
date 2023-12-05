public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  if ( N == M / 2 ) {
    ans = N ;
  }
  else if ( N > M / 2 ) {
    ans = M / 2 ;
  }
  else {
    int diff = M - 2 * N ;
    ans = N ;
    ans += diff / 4 ;
  }
  return ans ;
}
