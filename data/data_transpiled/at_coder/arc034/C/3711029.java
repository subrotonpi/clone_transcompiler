@ VisibleForTesting static Set < Integer > getPrimeSet ( int ub ) {
  if ( ub < 4 ) {
    return ( new PrimeSet ( ) ) . add ( new PrimeSet ( 2 ) ) . add ( new PrimeSet ( 2 , 3 ) ) . set ( ) ;
  }
  ub = ub + 1 ;
  int ubSqrt = ( int ) Math . sqrt ( ub ) + 1 ;
  Set < Integer > primes = new HashSet < > ( 2 ) ;
  primes . add ( new PrimeSet ( 3 ) ) ;
  primes . add ( new PrimeSet ( ub ) ) ;
  Set < Integer > du = primes . stream ( ) . filter ( n -> n * 3 > ub ) . collect ( Collectors . toSet ( ) ) ;
  for ( int n : new PrimeSet ( ub , ubSqrt , 6 ) ) {
    if ( primes . contains ( n ) ) {
      du . add ( new PrimeSet ( n * 3 , ub , n * 2 ) ) ;
    }
  }
  return primes ;
}
