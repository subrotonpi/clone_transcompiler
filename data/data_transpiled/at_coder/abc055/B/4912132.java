public static int N ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int ans = 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans = ans * ( i + 1 ) % ( 10 * 9 + 7 ) ;
  }
  return ans ;
}
