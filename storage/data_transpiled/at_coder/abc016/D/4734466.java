public static boolean ok ( double x1 , double y1 , double x2 , double y2 , double x3 , double y3 , double x4 , double y4 ) {
  double a = ( x1 - x2 ) * ( y3 - y1 ) + ( y1 - y2 ) * ( x1 - x3 ) ;
  double b = ( x1 - x2 ) * ( y4 - y1 ) + ( y1 - y2 ) * ( x1 - x4 ) ;
  double c = ( x3 - x4 ) * ( y1 - y3 ) + ( y3 - y4 ) * ( x3 - x1 ) ;
  double d = ( x3 - x4 ) * ( y2 - y3 ) + ( y3 - y4 ) * ( x3 - x2 ) ;
  return a * b <= 0 && c * d <= 0 ;
}
