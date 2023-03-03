public static final double getDistance ( double t ) {
  int t = Integer . parseInt ( readLine ( ) ) ;
  for ( int i = 0 ;
  i < t ;
  i ++ ) {
    double x = 0.0 ;
    double y = 0.0 ;
    double z = 0.0 ;
    double vx = 0.0 ;
    double vy = 0.0 ;
    double vz = 0.0 ;
    int n = Integer . parseInt ( readLine ( ) ) ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      double [ ] tpl = map . get ( readLine ( ) ) . split ( " " ) ;
      x += tpl [ 0 ] ;
      y += tpl [ 1 ] ;
      z += tpl [ 2 ] ;
      vx += tpl [ 3 ] ;
      vy += tpl [ 4 ] ;
      vz += tpl [ 5 ] ;
    }
    double A = vx * vx + vy * vy + vz * vz ;
    double B = 2 * x * vx + 2 * y * vy + 2 * z * vz ;
    double C = x * x + y * y + z * z ;
    double d ;
    if ( Math . abs ( A ) > 0.000001 ) {
      t = ( - 1 ) * B / 2.0 / A ;
      if ( t < 0.0 ) {
        t = 0.0 ;
      }
      d = A * ( t * t ) + B * t + C ;
      d = d / ( n * n ) ;
    }
    else {
      t = 0.0 ;
      d = C / ( n * n ) ;
    }
    System . out . println ( "Case #" + ( i + 1 ) + ": " + Math . sqrt ( Math . abs ( d ) ) + " " + Math . abs ( t ) ) ;
  }
  return t ;
}
