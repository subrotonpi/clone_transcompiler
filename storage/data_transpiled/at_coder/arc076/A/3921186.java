public static int MOD ( int n , int m ) {
  int ans ;
  ans = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( Math . abs ( m - n ) >= 2 ) {
    ans = 0 ;
  }
  else {
    ans = 1 ;
    for ( int i = 1 ;
    i <= m ;
    i ++ ) {
      ans *= i ;
      ans %= MOD ;
    }
    for ( int i = 1 ;
    i <= n ;
    i ++ ) {
      ans *= i ;
      ans %= MOD ;
    }
    if ( n == m ) {
      ans = ( ans * 2 ) % MOD ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
