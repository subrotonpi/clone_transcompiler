static int mod = 10 * 9 + 7 ;
{
  int ret = 1 ;
  while ( n > 0 ) {
    if ( ( n & 1 ) != 0 ) {
      ret *= x ;
      ret %= mod ;
      n -- ;
    }
    else {
      x *= x ;
      x %= mod ;
      n >>>= 1 ;
    }
  }
  int [ ] fact = new int [ 1000 ] ;
  int [ ] revfact = new int [ 1000 ] ;
  for ( int i = 0 ;
  i < fact . length ;
  i ++ ) {
    fact [ i ] = 1 ;
    revfact [ i ] = 1 ;
  }
  /* set fact to 0 */
  for ( int i = 0 ;
  i < fact . length ;
  i ++ ) {
    fact [ i + 1 ] = fact [ i ] * ( i + 1 ) ;
    fact [ i + 1 ] %= mod ;
  }
  revfact [ n ] = powMod ( fact [ n ] , mod - 2 ) ;
  for ( int i = 0 ;
  i < fact . length ;
  i ++ ) {
    revfact [ n - i - 1 ] = revfact [ n - i ] * ( n - i ) ;
    revfact [ i ] %= mod ;
  }
  /* get C */
  int r = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  int d = Integer . parseInt ( input . nextLine ( ) ) ;
  int l = Integer . parseInt ( input . nextLine ( ) ) ;
  /* set fact to 0 */
  if ( n < r ) return 0 ;
  /* get C */
  if ( n < r ) return 0 ;
  /* get C */
  int r = fact [ n ] * revfact [ r ] % mod * revfact [ n - r ] % mod ;
  r = r + 1 ;
  c = r + 1 ;
  x = r + 1 ;
  y = y + 1 ;
  d = r + 1 ;
  l = r + 1 ;
  /* get C */
  if ( n < r ) return 0 ;
  /* get C */
  if ( n < r ) return 0 ;
  /* get C */
  return x * y ;
}
