@ VisibleForTesting static double arcArea ( double x1 , double y1 , double x2 , double y2 , double r ) {
  assert y2 > y1 : y2 + " is not greater than " + y1 ;
  assert x1 > x2 : x2 + " is not greater than " + x1 ;
  final double f = Double . parseDouble ( l ) ;
  final double R = Double . parseDouble ( r ) ;
  final double t = Double . parseDouble ( r ) ;
  final double g = Double . parseDouble ( r ) ;
  double area = 0.5 * Math . abs ( x2 - x1 ) * Math . abs ( y2 - y1 ) ;
  final double theta2 = atan ( y2 / x2 ) ;
  final double theta1 = atan ( y1 / x1 ) ;
  assert theta2 > theta1 ;
  final double theta = theta2 - theta1 ;
  final double areaTheta = 0.5 * theta * r * r ;
  final double a = r ;
  final double b = r ;
  final double c = Math . sqrt ( ( y2 - y1 ) * ( y2 - y1 ) + ( x2 - x1 ) * ( y2 - x1 ) ) ;
  final double s = 0.5 * ( a + b + c ) ;
  final double areaTriangle = Math . sqrt ( s * ( s - a ) * ( s - b ) * ( s - c ) ) ;
  area += ( areaTheta - areaTriangle ) ;
  return area ;
}
