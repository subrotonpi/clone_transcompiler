public static int y = Integer . parseInt ( input ) {
  int m = Integer . parseInt ( input ) ;
  int d = Integer . parseInt ( input ) ;
  /* f = x / 1 - y / 2 */
  /* F = y - m + d - 12 */
  if ( m == 1 || m == 2 ) {
    y -- ;
    m += 12 ;
  }
  return ( int ) ( 365 * y + f ( y / 4 ) - f ( y / 100 ) + f ( y / 400 ) + f ( 306 * ( m + 1 ) / 10 ) + d - 429 ) ;
}
