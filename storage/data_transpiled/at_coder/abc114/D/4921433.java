static final String solve ( ) {
  final double INF = Double . POSITIVE_INFINITY ;
  final int N = Integer . MAX_VALUE ;
  final int [ ] tokens = new int [ N + 1 ] ;
  for ( int i = 2 ;
  i <= ( int ) Math . sqrt ( n ) ;
  i ++ ) {
    while ( n % i == 0 ) {
      n /= i ;
      primeCount [ i ] ++ ;
    }
  }
  if ( n > 1 ) {
    primeCount [ ( int ) n ] ++ ;
  }
  return primeCount [ 0 ] ;
}
