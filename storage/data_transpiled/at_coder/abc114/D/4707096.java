@ VisibleForTesting static List < Integer > primeFactors ( int n ) {
  final List < Integer > factors = new ArrayList < > ( ) ;
  while ( i * i <= n ) {
    if ( n % i == 0 ) {
      n /= i ;
      factors . add ( i ) ;
    }
    else {
      i ++ ;
    }
  }
  if ( n > 1 ) {
    factors . add ( n ) ;
  }
  return factors ;
}
