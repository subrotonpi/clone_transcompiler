@ VisibleForTesting static int [ ] getPrimeNumbers ( int n ) {
  if ( n == 1 ) return 0 ;
  for ( int k = 2 ;
  k <= ( int ) Math . sqrt ( n ) ;
  k ++ ) {
    if ( n % k == 0 ) return 0 ;
  }
  return 1 ;
}
