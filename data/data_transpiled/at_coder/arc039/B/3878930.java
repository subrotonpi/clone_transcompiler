static final int factorial ( ) {
  int N , K ;
  N = ( int ) input . nextInt ( ) ;
  int ans ;
  if ( K < N ) {
    ans = Math . factorial ( N + K - 1 ) / ( Math . factorial ( N + K - 1 - K ) * Math . factorial ( K ) ) % ( 10 * * 9 + 7 ) ;
  }
  return ans ;
}
