public static long gcd ( long p , long q ) {
  if ( p == 0 ) return q ;
  if ( q < p ) return gcd ( q , p ) ;
  return gcd ( q % p , p ) ;
  /* Is this a multiple of the integers? */
  if ( q == 1 ) return true ;
  if ( q % 2 == 1 ) return false ;
  /* Is this a multiple of the integers? */
  /* Is this multiple of the integers? */
  long lp2 = 1 ;
  long d = 1 ;
  while ( d <= x ) {
    d *= 2 ;
  }
  /* Is this multiple of the integers? */
  long lg2 = 1 ;
  long c = 1 ;
  while ( d <= x ) {
    d *= 2 ;
    c ++ ;
  }
  /* Is this multiple of the integers? */
  int T = Integer . parseInt ( readLine ( ) ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    p = Integer . parseInt ( readLine ( ) ) ;
    q = Integer . parseInt ( readLine ( ) ) ;
    long g = gcd ( p , q ) ;
    p /= g ;
    q /= g ;
    long ans ;
    if ( ! isp2 ( q ) ) ans = "impossible" ;
    else ans = lg2 ( q / lp2 ( p ) ) - 1 ;
    System . out . println ( "Case #" + ( t + 1 ) + ": " + ans ) ;
  }
  return q ;
}
