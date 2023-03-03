public static int nCr ( int N , int K ) {
  int mod = 10 * 9 + 7 ;
  int [ ] factorial = new int [ N + K + 2 ] ;
  int [ ] inverse = new int [ N + K + 2 ] ;
  for ( int i = 1 ;
  i <= N + K ;
  i ++ ) {
    factorial [ i ] = factorial [ i - 1 ] * i % mod ;
    inverse [ i ] = Math . pow ( factorial [ i - 1 ] , mod - 2 , mod ) ;
  }
  /* nCr(n,r) */
  if ( n < r || r < 0 ) {
    return 0 ;
  }
  else if ( r == 0 ) {
    return 1 ;
  }
  /* nCr(n,r) */
  if ( N <= K ) {
    System . out . println ( nCr ( N , K % N ) % mod ) ;
  }
  else {
    System . out . println ( nCr ( N + K - 1 , K ) % mod ) ;
  }
  return N ;
}
