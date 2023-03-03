public static void print ( int N ) {
  int K = Integer . parseInt ( input ( ) ) ;
  int M = ( 10 * 5 ) * 2 + 1 ;
  int MOD = 10 * 9 + 7 ;
  int [ ] fact = new int [ M ] ;
  int [ ] rfact = new int [ M ] ;
  fact [ 0 ] = 1 ;
  for ( int i = 1 ;
  i < M ;
  i ++ ) {
    fact [ i ] = fact [ i - 1 ] * i % MOD ;
  }
  rfact [ M - 1 ] = Math . pow ( fact [ M - 1 ] , MOD - 2 , MOD ) ;
  for ( int i = M - 2 ;
  i >= 0 ;
  i -- ) {
    rfact [ i ] = ( rfact [ i + 1 ] * ( i + 1 ) ) % MOD ;
  }
  System . out . println ( fact [ N + K - 1 ] * rfact [ K ] * rfact [ N - 1 ] % MOD ) ;
}
