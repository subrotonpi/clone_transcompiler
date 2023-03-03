public static int gcd ( int n , int d ) {
  while ( d != 0 ) {
    int t = d ;
    d = n % d ;
    n = t ;
  }
  /* reduce fraction by zero */
  assert d != 0 : "integer division by zero" ;
  assert d > 0 : "must be positive" ;
  assert n > 0 : "must be positive" ;
  int greatest = gcd ( n , d ) ;
  n /= greatest ;
  d /= greatest ;
  return n ;
  /* solve case */
}
