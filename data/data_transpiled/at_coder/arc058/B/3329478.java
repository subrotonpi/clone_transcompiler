@ Function public static List < Integer > ai ( ) {
  int mod = 10 * 9 + 7 ;
  /* n = 10 */
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  /* n = 10 */
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  /* n = 10 */
  if ( b > n - b ) {
    b = n - b ;
  }
  int r = 1 ;
  for ( int k = n ;
  k > n - b ;
  k -- ) {
    r = r * k % mod ;
  }
  int d = 1 ;
  for ( int k = 1 ;
  k <= b ;
  k ++ ) {
    d = d * k % mod ;
  }
  /* inv = pow(x, mod-2, mod) */
  int h = ai ( ) ;
  int w = ai ( ) ;
  int a = ai ( ) ;
  int b = ai ( ) ;
  int aa = h - a - 1 ;
  int bb = w - b - 1 ;
  int c1 = nCb ( aa + b , b ) ;
  int c2 = nCb ( a + bb - 1 , bb ) ;
  int ans = c1 * c2 ;
  ans %= mod ;
  for ( int i = 1 ;
  i <= bb ;
  i ++ ) {
    c1 = c1 * ( aa + b + i ) * inv ( b + i ) % mod ;
    c2 = c2 * ( bb - i + 1 ) * inv ( a + bb - i ) % mod ;
    ans += c1 * c2 ;
    ans %= mod ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
