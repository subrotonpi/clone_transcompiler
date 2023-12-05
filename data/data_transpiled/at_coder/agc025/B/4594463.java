public static int N = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . readLine ( ) ) ;
  int B = Integer . parseInt ( input . readLine ( ) ) ;
  int K = Integer . parseInt ( input . readLine ( ) ) ;
  int mod = 998244353 ;
  /* CMB */
  int n = ( n < 0 ) ? 0 : n ;
  if ( ( n < 0 ) || ( n > n ) ) return 0 ;
  r = Math . min ( n , n - r ) ;
  /* g1 */
  g1 = new int [ N + 1 ] ;
  g1 [ 0 ] = 1 ;
  /* g2 */
  g2 = new int [ N + 1 ] ;
  /* inv */
  inv [ 0 ] = 0 ;
  /* inv */
  for ( int i = 2 ;
  i <= N ;
  i ++ ) {
    g1 [ i ] = ( g1 [ i - 1 ] * i ) % mod ;
    inv [ i ] = ( - inv [ mod % i ] * ( mod / i ) ) % mod ;
    g2 [ i ] = ( g2 [ i - 1 ] * inv [ i - 1 ] ) % mod ;
  }
  /* a */
  int ans = 0 ;
  int R = K / A ;
  for ( int i = 0 ;
  i < R + 1 ;
  i ++ ) {
    if ( ( K - A * i ) % B == 0 ) ans += a ( i , ( K - A * i ) / B ) % mod ;
  }
  System . out . println ( ans % mod ) ;
  return ans ;
}
