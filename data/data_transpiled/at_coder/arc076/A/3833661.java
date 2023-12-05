public static int parseInt ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int MOD = 10 * 9 + 7 ;
  if ( Math . abs ( N - M ) > 1 ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  int ans = 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans = ans * ( i + 1 ) % MOD ;
  }
  return ans ;
}
