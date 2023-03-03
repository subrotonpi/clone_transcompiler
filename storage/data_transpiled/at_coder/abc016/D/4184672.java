public static void intersect ( final List < Point > a , final List < Point > b ) {
  /* lr p q */
  final double ox = a . get ( 2 ) - a . get ( 0 ) ;
  final double oy = a . get ( 3 ) - a . get ( 1 ) ;
  final double ax = q . get ( 0 ) - a . get ( 0 ) ;
  final double ay = a . get ( 1 ) - a . get ( 1 ) ;
  final double bx = q . get ( 2 ) - a . get ( 0 ) ;
  final double by = q . get ( 3 ) - a . get ( 1 ) ;
  final double s = ox * ay - oy * ax ;
  final double t = ox * by - oy * bx ;
  assert s * t != 0 ;
  assert s * t < 0 ;
}
