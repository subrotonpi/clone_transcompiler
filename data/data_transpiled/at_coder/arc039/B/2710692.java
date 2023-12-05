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
  /* If the factorial is not in the range of the specified integer */
  if ( N < K ) {
    factorial [ N ] = factorial [ N - 1 ] * i % mod ;
    inverse [ N ] = Math . pow ( factorial [ N - 1 ] , mod - 2 , mod ) ;
  }
  /* If the factorial is not in the range of the specified integer */
  if ( N < K ) {
    factorial [ N ] = factorial [ N - 1 ] * inverse [ N - 1 ] ;
  }
  /* If the factorial is not in the range of the specified integer */
  if ( N < K ) {
    System . out . println ( nCr ( N + K % N - 1 , K % N ) % mod ) ;
  }
  else {
    System . out . println ( nCr ( N , K % N ) % mod ) ;
  }
  return factorial [ N ] ;
}
