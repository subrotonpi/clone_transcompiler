@ VisibleForTesting static int [ ] solve ( int a ) {
  /* print a to the standard error */
  System . err . println ( String . valueOf ( a ) ) ;
  /* print the number of primes */
  int sqrtn = ( int ) ( n * 0.5 ) ;
  boolean [ ] sieve = new boolean [ sqrtn + 1 ] ;
  for ( int i = 2 ;
  i <= sqrtn ;
  i ++ ) {
    if ( sieve [ i ] ) {
      int m = n / i - i ;
      sieve [ i * i ] = new boolean [ m + 1 ] ;
    }
  }
  Arrays . sort ( sieve ) ;
  for ( int i = 0 ;
  i < sqrtn ;
  i ++ ) {
    if ( sieve [ i ] ) {
      int m = n / i - i ;
      sieve [ i * i ] = new boolean [ m + 1 ] ;
    }
  }
  sieve = new int [ sqrtn + 1 ] ;
  for ( int i = 0 ;
  i < sqrtn ;
  i ++ ) {
    sieve [ i ] = i ;
  }
  return sieve ;
}
