public static int N = Integer . parseInt ( input ) {
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans += i + 1 ;
  }
  /* Is prime */
  for ( int i = 2 ;
  i <= ( int ) ( n * 0.5 ) ;
  i ++ ) {
    if ( n % i == 0 ) {
      return false ;
    }
  }
  return ans != 1 ;
}
