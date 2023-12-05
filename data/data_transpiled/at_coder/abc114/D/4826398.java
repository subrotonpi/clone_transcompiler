public static int [ ] getPrimes ( int n ) {
  boolean [ ] isPrime = new boolean [ n + 1 ] ;
  isPrime [ 0 ] = false ;
  isPrime [ 1 ] = false ;
  for ( int i = 2 ;
  i <= ( int ) ( n * 0.5 ) ;
  i ++ ) {
    if ( ! isPrime [ i ] ) continue ;
    for ( int j = i * 2 ;
    j <= n ;
    j += i ) {
      isPrime [ j ] = false ;
    }
  }
  return getPrimes ( n + 1 ) ;
  /* get division */
  int counter = 0 ;
  int _prime = n ;
  while ( _prime < N ) {
    counter += N / _prime ;
    _prime *= _prime ;
  }
  /* get division */
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] primes = getPrimes ( N ) ;
  int counter = 0 ;
  int counter1 = 0 ;
  int counter2 = 0 ;
  int counter3 = 0 ;
  int counter4 = 0 ;
  for ( int prime : primes ) {
    if ( getDivision ( N , prime ) >= 74 ) counter ++ ;
    if ( getDivision ( N , prime ) >= 24 ) counter1 ++ ;
    if ( getDivision ( N , prime ) >= 14 ) counter2 ++ ;
    if ( getDivision ( N , prime ) >= 4 ) counter3 ++ ;
  }
  long total = counter + ( counter4 - 1 ) * counter1 + ( counter3 - 1 ) * counter2 + ( counter4 - 2 ) * counter3 * ( counter3 - 1 ) / 2 ;
  System . out . println ( ( int ) total ) ;
  return primes ;
}
