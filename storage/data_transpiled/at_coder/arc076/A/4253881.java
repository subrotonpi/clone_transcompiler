public static int parseInt ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int ans = ( Math . abs ( N - M ) < 2 ) ? 1 : 0 ;
  int n = Math . max ( N , M ) ;
  int fa = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    fa = ans ;
    ans = ans * i % ( 10 * 9 + 7 ) ;
  }
  return ans ;
}
