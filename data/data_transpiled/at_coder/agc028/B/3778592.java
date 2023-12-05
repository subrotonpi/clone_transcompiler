@ VisibleForTesting static int factorial ( ) {
  final int MOD = 10 * 9 + 7 ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  ++ i ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  final int [ ] invsum = new int [ N + 1 ] ;
  invsum [ 0 ] = 0 ;
  for ( int i = 1 ;
  i <= N ;
  ++ i ) {
    invsum [ i ] = ( invsum [ i - 1 ] + Math . pow ( i , MOD - 2 , MOD ) ) % MOD ;
  }
  int ans = 0 ;
  for ( int i = 1 ;
  i <= N ;
  ++ i ) {
    ans += ( A [ i - 1 ] * ( invsum [ i ] + invsum [ N - i + 1 ] - 1 ) ) % MOD ;
  }
  ans *= factorial ( N ) ;
  System . out . println ( ans % MOD ) ;
  return ans ;
}
