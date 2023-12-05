static public void fact ( int n ) {
  int p = 10 * 9 + 7 ;
  {
    int n_ = 1 ;
    Collections . sort ( new ArrayList < Integer > ( ) ) ;
    for ( int i = 1 ;
    i <= n ;
    i ++ ) {
      n_ = ( n_ * i ) % p ;
      Collections . sort ( new ArrayList < Integer > ( ) ) ;
    }
  }
  {
    int m = Math . pow ( f [ n ] , p - 2 , p ) ;
    Collections . sort ( new ArrayList < Integer > ( ) ) ;
    for ( int i = n ;
    i > 0 ;
    i -- ) {
      m = m * i % p ;
      Collections . sort ( new ArrayList < Integer > ( ) ) ;
    }
  }
  int ans = 0 ;
  int m = n - 1 ;
  int [ ] f = new int [ n ] ;
  Arrays . sort ( f ) ;
  int [ ] rf = new int [ n ] ;
  Arrays . sort ( rf ) ;
  int perm = 0 ;
  for ( int k = ( n + 1 ) / 2 ;
  k < n ;
  k ++ ) {
    int b = m - k ;
    int a = ( m - 1 ) - ( 2 * b ) ;
    int perm_ = f [ a + b ] * rf [ a ] % p * f [ k ] % p ;
    ans += ( perm_ - perm ) % p * k % p ;
    ans %= p ;
    perm = perm_ ;
  }
  System . out . println ( ans ) ;
}
