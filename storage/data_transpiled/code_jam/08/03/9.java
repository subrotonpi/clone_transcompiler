static final double solve ( double R , double t , double r , double g ) throws IOException {
  final double sq2 = Math . sqrt ( 2 ) ;
  /* Case #*/
  if ( ( x > R ) || ( y > R ) ) return false ;
  /* Case #*/
  double x3 = Math . sqrt ( R * R - y1 * y1 ) ;
  double y3 = Math . sqrt ( R * R - x1 * x1 ) ;
  double a = Math . asin ( y3 / r ) - Math . asin ( y1 / r ) ;
  double s = ( a / 2 * R * R ) - ( R * Math . sin ( a ) / 2 ) ;
  /* Case #*/
  double findPart ( x1 , y1 , x2 , y2 , R ) ;
  /* Case #*/
  double x3 = Math . sqrt ( R * R - y1 * y1 ) ;
  double y3 = Math . sqrt ( R * R - x1 * x1 ) ;
  double s = findPart ( x1 , y1 , x2 , y2 , R ) ;
  if ( ( y3 > y2 ) && ( y3 < y2 ) ) s -= findPart ( x1 , y2 , x2 , R ) ;
  if ( ( x3 > x2 ) && ( y3 < y2 ) ) s -= findPart ( x2 , y1 , x2 , R ) ;
  /* Case #*/
  double R2 = r - t ;
  double S = Math . PI * ( R * R ) / 4 ;
  double y = r ;
  while ( y < R2 ) {
    double x = r ;
    while ( x < R2 ) {
      if ( ( x * x + y * y ) > R2 * R2 ) break ;
      if ( incircle ( x + g , y + g , R2 ) ) S -= g * g ;
      else S -= findPart ( x , y , x + g , y + g , R2 ) ;
      x += g + 2 * r ;
    }
    y += g + 2 * r ;
  }
  return ( S * 4 ) / ( Math . PI * ( R * R ) ) ;
}
