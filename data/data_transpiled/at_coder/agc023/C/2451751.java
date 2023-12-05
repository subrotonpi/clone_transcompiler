public static int n = Integer . parseInt ( input ) {
  int p = 10 * 9 + 7 ;
  /* fact n */
  int [ ] n_ = new int [ n + 1 ] ;
  n_ [ 0 ] = 1 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    n_ [ i ] = ( n_ [ n_ . length - 1 ] * i ) % p ;
  }
  /* invfact n */
  int [ ] m = new int [ n ] ;
  m [ 0 ] = Math . pow ( f [ n ] , p - 2 , p ) ;
  for ( int i = n ;
  i > 0 ;
  i -- ) {
    m [ i ] = m [ m . length - 1 ] * i % p ;
  }
  /* return m */
  int ans = 0 ;
  int m = n - 1 ;
  int [ ] f = fact ( m , p ) ;
  int [ ] rf = invfact ( m , f , p ) ;
  Collections . reverse ( rf ) ;
  int perm = 0 ;
  for ( int k = ( n + 1 ) / 2 ;
  k < n ;
  k ++ ) {
    int perm_ = f [ k - 1 ] * rf [ 2 * k - n ] % p * f [ k ] % p ;
    ans += ( perm_ - perm ) % p * k % p ;
    ans %= p ;
    perm = perm_ ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
