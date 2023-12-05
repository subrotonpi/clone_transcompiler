@ Function public static void reduce ( ) {
  int MOD = ( int ) ( 10 * * 9 + 7 ) ;
  int N = Integer . parseInt ( input ( ) ) ;
  int K = Integer . parseInt ( input ( ) ) ;
  int [ ] fact = new int [ N + 1 ] ;
  fact [ 0 ] = 1 ;
  fact [ 1 ] = accumulate ( range ( 1 , N + K ) , range ( 2 , N ) ) ;
  int [ ] finv = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    finv [ i ] = Math . pow ( fact [ i ] , MOD - 2 , MOD ) ;
  }
  int ans ;
  if ( N > K ) {
    ans = fact [ N + K - 1 ] * finv [ K ] * finv [ N - 1 ] % MOD ;
  }
  else {
    int R = K % N ;
    ans = fact [ N ] * finv [ R ] * finv [ N - R ] % MOD ;
  }
  System . out . println ( ans ) ;
}
