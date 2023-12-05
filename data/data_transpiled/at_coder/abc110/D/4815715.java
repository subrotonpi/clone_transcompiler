@ Function public static List < Integer > inpl ( ) {
  final int MOD = 10 * 9 + 7 ;
  final int N = inpl ( ) ;
  final int M = inpl ( ) ;
  return ( List < Integer > factorize ( N ) ) -> {
    final List < Integer > primeList = new ArrayList < > ( ) ;
    final List < Integer > factorizeList = new ArrayList < > ( ) ;
    int i = 2 ;
    while ( i * i <= n ) {
      for ( int p : primeList ) {
        if ( i % p == 0 ) {
          break ;
        }
      }
      else {
        primeList . add ( i ) ;
        int k = 0 ;
        while ( n % i == 0 ) {
          n /= i ;
          k ++ ;
        }
        factorizeList . add ( k ) ;
      }
      i ++ ;
    }
    if ( n > 1 ) {
      factorizeList . add ( 1 ) ;
    }
    return ( List ) factorizeList ;
  }
  ;
}
