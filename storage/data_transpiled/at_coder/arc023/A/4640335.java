public static int y = Integer . parseInt ( input ) {
  int m = Integer . parseInt ( input ) ;
  int d = Integer . parseInt ( input ) ;
  /* f = x / 1 - y / 2 */
  /* F = y - m + d - 12 */
  if ( m == 1 || m == 2 ) {
    y -- ;
    m += 12 ;
  }
  return 365 * y + f ( y / 4 ) - f ( y / 100 ) + f ( y , m , d ) ;
}
