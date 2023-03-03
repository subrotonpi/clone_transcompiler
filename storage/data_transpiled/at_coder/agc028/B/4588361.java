@ VisibleForTesting static int factorial ( ) {
  int MOD = 10 * 9 + 7 ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > As = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) As . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int [ ] invs = new int [ N + 1 ] ;
  for ( int x = 2 ;
  x <= N ;
  x ++ ) invs [ x ] = ( - ( MOD / x ) * invs [ MOD % x ] ) % MOD ;
  int [ ] accInvs = new int [ N + 1 ] ;
  for ( int i = 1 ;
  i < invs . length ;
  i ++ ) {
    int inv = invs [ i ] ;
    accInvs [ i ] = ( accInvs [ i - 1 ] + inv ) % MOD ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < As . size ( ) ;
  i ++ ) {
    int A = As . get ( i ) ;
    int coef = ( accInvs [ i + 1 ] + accInvs [ N - i ] - 1 ) % MOD ;
    ans += coef * A ;
    ans %= MOD ;
  }
  int factN = factorial ( N ) % MOD ;
  System . out . println ( ans * factN % MOD ) ;
  return ans ;
}
