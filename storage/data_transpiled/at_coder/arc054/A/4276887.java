public static double l ( double x , double y , double s , double d ) {
  double clockwise = d - s ;
  if ( clockwise < 0 ) {
    clockwise += l ;
  }
  double anticlockwise = l - clockwise ;
  double res = clockwise / ( x + y ) ;
  if ( y - x > 0 ) {
    res = Math . min ( res , anticlockwise / ( y - x ) ) ;
  }
  System . out . println ( res ) ;
  return res ;
}
