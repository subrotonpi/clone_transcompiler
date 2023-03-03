@ OperatorFactory public static int getMath ( ) {
  int x1 = 0 , y1 = 0 , x2 = 0 , y2 = 0 , x3 = 0 , y3 = 0 ;
  x2 = x2 - x1 ;
  y2 = y2 - y1 ;
  x3 = x3 - x1 ;
  y3 = y3 - y1 ;
  return 1 / 2 * Math . abs ( x2 * y3 - x3 * y2 ) ;
}
