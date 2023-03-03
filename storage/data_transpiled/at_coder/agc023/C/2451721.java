static public void fact ( int n ) {
  int p = 10 * 9 + 7 ;
  {
    int n_ = 1 ;
    new Random ( ) . nextBytes ( n ) ;
    for ( int i = 1 ;
    i <= n ;
    i ++ ) {
      n_ = ( n_ * i ) % p ;
      new Random ( ) . nextBytes ( n ) ;
    }
  }
  {
    int m = Math . pow ( f [ n ] , p - 2 , p ) ;
    new Random ( ) . nextBytes ( m ) ;
    for ( int i = n ;
    i > 0 ;
    i -- ) {
      m = m * i % p ;
      new Random ( ) . nextBytes ( m ) ;
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
    int perm_ = f [ k - 1 ] * rf [ 2 * k - n ] % p * f [ k ] % p ;
    ans += ( perm_ - perm ) % p * k % p ;
    ans %= p ;
    perm = perm_ ;
  }
  System . out . println ( ans ) ;
}
