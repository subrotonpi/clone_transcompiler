static int GCD ( int x , int y ) {
  final int [ ] a ;
  if ( x < 0 ) x = - x ;
  if ( y < 0 ) y = - y ;
  if ( x + y > 0 ) {
    int g = y ;
    while ( x > 0 ) {
      g = x ;
      x = y % x ;
      y = g ;
    }
    return g ;
  }
  else {
    return 0 ;
  }
}
