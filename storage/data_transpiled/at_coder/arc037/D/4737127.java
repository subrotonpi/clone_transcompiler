public static int solve ( int l ) {
  int a = 1 ;
  int b = 2 ;
  int c = 1 ;
  while ( 0 < l ) {
    a = ( 3 * a + b * b ) % M ;
    int nb = b * b * ( 2 * c + 1 ) % M ;
    int r = b * c * c ;
    nb += M - r ;
    nb %= M ;
    int nc = ( b * b + 2 * b * c * c ) % M ;
    r = c * c * 3 ;
    nc += M - r ;
    nc %= M ;
    b = nb ;
    c = nc ;
    l -- ;
  }
  return a ;
}
