public static int N ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int ai [ ] = list ( Integer . parseInt ( input ( ) ) ) ;
  int ans = 0 ;
  for ( int a : ai ) {
    ans += a - 1 ;
  }
  return ans ;
}
