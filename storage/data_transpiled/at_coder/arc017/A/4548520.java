public static int [ ] sieve ( int x ) {
  if ( x < 2 ) return new int [ ] {
  }
  ;
  int [ ] primes = new int [ x ] ;
  for ( int i = 0 ;
  i < x ;
  i ++ ) primes [ i ] = i ;
  primes [ 1 ] = 0 ;
  for ( int p : primes ) {
    if ( p > x * ( 1 / 2 ) ) break ;
    if ( p == 0 ) continue ;
    for ( int np = 2 * p ;
    np < x ;
    np += p ) primes [ np ] = 0 ;
  }
  return primes ;
}
