@ Soap public static int [ ] findPrimes ( int to ) {
  boolean bad [ ] = new boolean [ to + 1 ] ;
  for ( int x = 2 ;
  x <= to ;
  x ++ ) {
    bad [ x ] = false ;
  }
  int primes [ ] = new int [ to + 1 ] ;
  for ( int x = 2 ;
  x <= to ;
  x ++ ) {
    if ( ! bad [ x ] ) {
      primes [ x ] = x ;
      int act = x ;
      while ( act <= to ) {
        bad [ act ] = true ;
        act += x ;
      }
    }
  }
  return primes ;
}
