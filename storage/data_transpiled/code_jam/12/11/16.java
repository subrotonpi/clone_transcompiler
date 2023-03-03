public static int work ( int K , int N , float [ ] P ) {
  return Math . min ( workBackspace ( K , N , P ) , workGiveup ( K , N , P ) ) ;
  /* Work back space */
  int Pc = 1 ;
  int res = N * N ;
  for ( int k = 0 ;
  k < K + 1 ;
  k ++ ) {
    int r = ( K - k ) ;
    r += ( N + 1 - k ) ;
    r += ( 1 - Pc ) * ( N + 1 ) ;
    if ( k < K ) Pc *= P [ k ] ;
    res = Math . min ( res , r ) ;
  }
  /* Work giveup */
  int T = Integer . parseInt ( readLine ( ) ) ;
  for ( int i = 1 ;
  i <= T ;
  i ++ ) {
    K = Integer . parseInt ( readLine ( ) ) ;
    N = Integer . parseInt ( readLine ( ) ) ;
    P = Float . parseFloat ( readLine ( ) ) ;
    System . out . println ( "Case #" + i + ": " + work ( K , N , P ) ) ;
  }
  return 0 ;
}
