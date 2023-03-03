public static int cmb ( int N , int K , int MOD ) {
  int [ ] factorial = new int [ N + K ] ;
  int k ;
  int i = 0 ;
  int k ;
  int k ;
  int k ;
  int i = 0 ;
  {
    factorial [ k ] = 1 ;
    for ( k = 1 ;
    k < N + K - 1 ;
    k ++ ) {
      factorial [ k + 1 ] = ( factorial [ k ] * ( k + 1 ) ) % MOD ;
    }
    int [ ] factInv = new int [ N + K ] ;
    factInv [ N + K - 1 ] = Math . pow ( factorial [ N + K - 1 ] , MOD - 2 , MOD ) ;
    for ( k = N + K - 1 ;
    k > 0 ;
    k -- ) {
      factInv [ k - 1 ] = ( factInv [ k ] * k ) % MOD ;
    }
    if ( N < 0 || K < 0 || N < K ) {
      return 0 ;
    }
    else {
      return ( factorial [ N ] * factInv [ K ] * factInv [ N - K ] ) % MOD ;
    }
  }
}
