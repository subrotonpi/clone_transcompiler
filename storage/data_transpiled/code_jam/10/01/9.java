public static int T = Integer . parseInt ( readLine ( ) ) {
  int N , K ;
  int N , K ;
  /* Is it a number of times to be on the first case? */
  for ( int n = 0 ;
  n < T ;
  n ++ ) {
    N = Integer . parseInt ( readLine ( ) . split ( " " ) [ 0 ] ) ;
    K = Integer . parseInt ( readLine ( ) . split ( " " ) [ 1 ] ) ;
  }
  for ( int testCase : xrange ( 1 , T + 1 ) ) {
    N = Integer . parseInt ( readLine ( ) . split ( " " ) [ 0 ] ) ;
    K = Integer . parseInt ( readLine ( ) . split ( " " ) [ 1 ] ) ;
    System . out . println ( "Case #" + testCase + ":" + ( isLightOn ( N , K ) ? "ON" : "OFF" ) ) ;
  }
  return N ;
}
