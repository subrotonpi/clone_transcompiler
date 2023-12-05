private static int Day ( int y , int m , int d ) {
  if ( m == 1 ) {
    y -- ;
    m = 13 ;
  }
  else if ( m == 2 ) {
    y -- ;
    m = 14 ;
  }
  return 365 * y + y / 4 - y / 100 + y / 400 + 306 * ( m + 1 ) / 10 + d - 429 ;
}
