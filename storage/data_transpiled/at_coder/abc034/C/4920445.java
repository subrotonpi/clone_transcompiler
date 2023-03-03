public static int modInv ( @ Nonnegative int n , int mod ) {
  int b = mod , u = 1 , v = 0 ;
  while ( b > 0 ) {
    int t = n / b ;
    n -= t * b ;
    u -= t * v ;
    n = b ;
    b = n ;
    u = v ;
    v = u ;
  }
  return ( u + mod ) % mod ;
  /* combMod */
}
