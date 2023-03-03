public static int remov ( int n , int [ ] a ) {
  int mod = 10 * 9 + 7 ;
  int [ ] k = new int [ n + 1 ] ;
  int [ ] gk = k . clone ( ) ;
  int [ ] kb1 = k . clone ( ) ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    k [ i ] = k [ i - 1 ] * i % mod ;
  }
  gk [ n ] = Math . pow ( k [ n ] , mod - 2 , mod ) ;
  for ( int i = n ;
  i > 0 ;
  i -- ) {
    gk [ i - 1 ] = gk [ i ] * i % mod ;
  }
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    kb1 [ i ] = gk [ i ] * k [ i - 1 ] % mod ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ans += a [ i ] * ( kerui [ i + 1 ] + kerui [ n - i ] - 1 ) % mod ;
    ans %= mod ;
  }
  ans *= k [ n ] ;
  return ans % mod ;
}
