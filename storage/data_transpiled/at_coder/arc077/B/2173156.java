public static int nCr ( int N ) {
  int [ ] A = Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int [ ] se = new int [ N + 1 ] ;
  int c = Integer . parseInt ( A [ 0 ] ) - N * ( N + 1 ) / 2 ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    if ( A [ i ] == c ) se [ i ] = i ;
  }
  int mod = 10 * 9 + 7 ;
  int [ ] factorial = new int [ N + 2 ] ;
  factorial [ 0 ] = 1 ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    factorial [ i ] = factorial [ i - 1 ] * i % mod ;
  }
  int [ ] inverse = new int [ N + 2 ] ;
  inverse [ N + 2 - 1 ] = Math . pow ( factorial [ N + 2 - 1 ] , mod - 2 , mod ) ;
  for ( int i = N + 2 - 2 ;
  i >= 0 ;
  i -- ) {
    inverse [ i ] = inverse [ i + 1 ] * ( i + 1 ) % mod ;
  }
  /* if (n < r || n == r || r == 0) {
  return 0;
  }*/
  System . out . println ( N ) ;
  if ( N == 1 ) {
    System . out . println ( N ) ;
  }
  else {
    for ( int i = 1 ;
    i <= N ;
    i ++ ) {
      System . out . println ( ( int ) ( nCr ( N + 1 , i + 1 ) - nCr ( se [ 0 ] + N - se [ 1 ] , i ) ) % mod ) ;
    }
  }
  return se [ 0 ] ;
}
