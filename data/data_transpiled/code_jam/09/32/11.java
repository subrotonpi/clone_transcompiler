static final double [ ] [ ] solve ( Scanner in ) {
  int cases = in . nextInt ( ) ;
  for ( int caseNo = xrange ( 1 , cases + 1 ) ;
  caseNo <= cases ;
  caseNo ++ ) {
    double min_d = 0.0 ;
    double min_t = 0.0 ;
    int nflies = in . nextInt ( ) ;
    float [ ] [ ] flies = new float [ nflies ] [ ] ;
    for ( int i = xrange ( nflies ) ;
    i < nflies ;
    i ++ ) {
      float [ ] vals = new float [ 6 ] ;
      for ( int num : in . next ( ) . split ( " " ) ) vals [ i ] = Float . parseFloat ( in . next ( ) ) ;
      flies [ i ] = new float [ vals . length ] ;
    }
    double x = 0.0 ;
    double vx = 0.0 ;
    double y = 0.0 ;
    double vy = 0.0 ;
    double z = 0.0 ;
    double vz = 0.0 ;
    for ( float [ ] fly : flies ) {
      x += fly [ 0 ] ;
      y += fly [ 1 ] ;
      z += fly [ 2 ] ;
      vx += fly [ 3 ] ;
      vy += fly [ 4 ] ;
      vz += fly [ 5 ] ;
    }
    double alpha = x * x + y * y + z * z ;
    double beta = 2 * x * vx + 2 * y * vy + 2 * z * vz ;
    double gamma = vx * vx + vy * vy + vz * vz ;
    double init = Math . pow ( alpha , 0.5 ) ;
    try {
      min_t = - beta / ( 2 * gamma ) ;
      if ( min_t < 0.0 ) min_t = 0.0 ;
      if ( ( alpha + min_t * beta + min_t * min_t * gamma ) < 0 ) min_d = 0.0 ;
      else min_d = Math . pow ( ( alpha + min_t * beta + min_t * min_t * gamma ) , 0.5 ) ;
    }
    catch ( ArithmeticException e ) {
      min_t = 0.0 ;
      min_d = init ;
    }
    if ( init < min_d ) min_d = init ;
    if ( min_t < 1e-30 ) min_t = 0.0 ;
    if ( min_d < 1e-30 ) min_d = 0.0 ;
    System . out . println ( "Case #" + caseNo + ": " + min_d / flies . length + " " + min_t ) ;
  }
  return flies ;
}
