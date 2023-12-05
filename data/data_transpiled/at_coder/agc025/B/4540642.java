public static int n ( ) {
  int a = Integer . parseInt ( input . readLine ( ) ) ;
  int b = Integer . parseInt ( input . readLine ( ) ) ;
  int k = Integer . parseInt ( input . readLine ( ) ) ;
  int mod = 998244353 ;
  int [ ] factorial = new int [ n + 1 ] ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    factorial [ i ] = factorial [ i - 1 ] * i % mod ;
  }
  int [ ] inverse = new int [ n + 1 ] ;
  inverse [ n ] = 0 ;
  inverse [ n - 1 ] = Math . pow ( factorial [ n - 1 ] , mod - 2 , mod ) ;
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    inverse [ i ] = inverse [ i + 1 ] * ( i + 1 ) % mod ;
  }
  /* comb n */
  if ( n < r ) {
    return 0 ;
  }
  /* comb n */
  int ans = 0 ;
  for ( int i = n + 1 ;
  i <= n ;
  i ++ ) {
    int j = ( k - a * i ) / b ;
    if ( a * i + b * j == k && 0 <= j && j <= n ) {
      ans += comb ( n , i ) * comb ( n , j ) ;
      ans %= mod ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
