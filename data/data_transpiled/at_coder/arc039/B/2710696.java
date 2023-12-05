public static int nCr ( int N , int K ) {
  int mod = 10 * 9 + 7 ;
  int [ ] factorial = new int [ N + K + 2 ] ;
  int [ ] inverse = new int [ N + K + 2 ] ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    factorial [ i ] = 1 ;
    inverse [ i ] = 1 ;
  }
  /* If the factorial is not in the range of the input */
  if ( N < K ) {
    factorial [ N ] = factorial [ N - 1 ] * factorial [ N ] % mod ;
  }
  else if ( N == 0 ) {
    return 1 ;
  }
  /* If the factorial is not in the range of the input */
  if ( N < K ) {
    factorial [ N ] = factorial [ N - 1 ] * factorial [ N ] % mod ;
  }
  /* If the factorial is not in the range of the input */
  if ( N < K ) {
    System . out . println ( nCr ( N + K - 1 , K ) % mod ) ;
  }
  else {
    System . out . println ( nCr ( N , K % N ) % mod ) ;
  }
  return N ;
}
