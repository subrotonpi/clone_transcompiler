public static int input ( ) {
  n = Integer . parseInt ( input ( ) ) ;
  int [ ] fn = new int [ n ] , fk = new int [ n ] , mod = 10 * 9 + 7 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) fn [ i + 1 ] = ( fn [ i ] * ( i + 2 ) ) % mod ;
  /* power k */
  if ( k == 1 ) return n ;
  else if ( k % 2 == 0 ) return power ( ( n * n ) % mod , k / 2 ) ;
  else return ( n * power ( n , k - 1 ) ) % mod ;
  /* comb n */
  if ( n < k || k < 0 ) return 0 ;
  else if ( k == 0 || n == k ) return 1 ;
  else return ( ( ( fn [ n - 1 ] * fk [ n - k - 1 ] ) % mod ) * fk [ k - 1 ] ) % mod ;
  fk [ fk . length - 1 ] = power ( fn [ fn . length - 1 ] , mod - 2 ) ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) fk [ fk . length - i ] = ( fk [ fk . length - i + 1 ] * ( n + 2 - i ) ) % mod ;
  fn [ 0 ] = 1 ;
  int ans = fn [ n - 2 ] * ( n - 1 ) ;
  for ( int i = n - 2 ;
  i > ( n - 1 ) / 2 ;
  i -- ) {
    ans = ( ans - comb ( i - 1 , n - i - 1 ) * fn [ i - 1 ] * fn [ n - i - 2 ] ) % mod ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
