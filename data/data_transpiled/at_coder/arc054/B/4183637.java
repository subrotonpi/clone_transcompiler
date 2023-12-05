public static double keisan ( double n ) {
  double ans ;
  ans = n ;
  ans += n / ( 2 * ( x / 1.5 ) ) ;
  return ans ;
  double x0 = 0 ;
  double x3 = 120 ;
  while ( x3 - x0 > 10 * ( - 12 ) ) {
    double x1 = ( x0 * 2 + x3 ) / 3 ;
    double x2 = ( x0 + x3 * 2 ) / 3 ;
    double y1 = keisan ( x1 ) ;
    double y2 = keisan ( x2 ) ;
    if ( y1 > y2 ) {
      x0 = x1 ;
    }
    else {
      x3 = x2 ;
    }
  }
  return ans ;
}
