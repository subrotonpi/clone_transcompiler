static final double best3 ( double [ ] a , double [ ] b , double [ ] c ) {
  final double ax = a [ 0 ] ;
  final double ay = a [ 1 ] ;
  final double ar = a [ 2 ] ;
  final double bx = b [ 0 ] ;
  final double by = b [ 1 ] ;
  final double br = b [ 2 ] ;
  final double cx = c [ 0 ] ;
  final double cy = c [ 1 ] ;
  final double cr = c [ 2 ] ;
  return ( Math . max ( ar , ( Math . sqrt ( ( bx - cx ) * ( bx - cx ) + ( by - cy ) * ( by - cy ) ) + ( double ) br + ( double ) cr ) ) / 2.0 ) ;
}
