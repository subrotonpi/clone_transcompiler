public static int input ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) , M = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans ;
  if ( N == M ) {
    ans = 1 ;
    for ( int i = 1 ;
    i <= N ;
    i ++ ) {
      ans *= i ;
      ans %= 10 * 9 + 7 ;
    }
    ans *= ans ;
    ans %= 10 * 9 + 7 ;
    ans *= 2 ;
    ans %= 10 * 9 + 7 ;
  }
  else if ( N == M + 1 || N + 1 == M ) {
    ans = 1 ;
    for ( int i = 1 ;
    i <= N ;
    i ++ ) {
      ans *= i ;
      ans %= 10 * 9 + 7 ;
    }
    for ( int i = 1 ;
    i <= M ;
    i ++ ) {
      ans *= i ;
      ans %= 10 * 9 + 7 ;
    }
  }
  else {
    ans = 0 ;
  }
  return ans ;
}
