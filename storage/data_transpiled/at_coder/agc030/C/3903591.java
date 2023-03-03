static final int solve ( int k ) {
  if ( k == 1 ) return 1 ;
  int n = ( k + 3 ) / 4 * 2 ;
  int [ ] [ ] f = new int [ n ] [ n ] ;
  for ( int y = 0 ;
  y < n ;
  y ++ ) {
    for ( int x = 0 ;
    x < n ;
    x ++ ) {
      f [ y ] [ x ] = ( y * n + ( x - y ) % n ) % ( 2 * n ) + 1 ;
      if ( f [ y ] [ x ] > n ) {
        if ( f [ y ] [ x ] - n <= 2 * n - k ) f [ y ] [ x ] -= n ;
        else f [ y ] [ x ] -= 2 * n - k ;
      }
    }
  }
  return n ;
}
