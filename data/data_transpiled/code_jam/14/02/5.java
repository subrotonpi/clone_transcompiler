public static double solve ( double c , double f , double x ) {
  double t = 0.0 , speed = 2.0 ;
  while ( ( x - c ) / speed > x / ( speed + f ) ) {
    t += c / speed ;
    speed += f ;
  }
  return t + x / speed ;
}
