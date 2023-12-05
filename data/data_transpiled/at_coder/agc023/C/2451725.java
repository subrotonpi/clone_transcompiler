static void fact ( int n ) {
  int p = 10 * 9 + 7 ;
  {
    int n_ = 1 ;
    yield ( ) ;
    for ( int i = 1 ;
    i <= n ;
    i ++ ) {
      n_ = ( n_ * i ) % p ;
      yield ( ) ;
    }
  }
  {
    int m = pow ( f [ n ] , p - 2 , p ) ;
    yield ( ) ;
    for ( int i = n ;
    i > 0 ;
    i -- ) {
      m = m * i % p ;
      yield ( ) ;
    }
  }
  int ans = 0 ;
  int m = n - 1 ;
  int [ ] f = new int [ n ] ;
  int [ ] rf = new int [ n ] ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    f [ i ] = fact ( m , p ) ;
  }
  int [ ] rf = new int [ n ] ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    rf [ i ] = invfact ( m , f , p ) ;
  }
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
}
