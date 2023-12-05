@ VisibleForTesting static double sqrt ( ) {
  int T = input . nextInt ( ) ;
  for ( int i = 0 ;
  i < xrange ;
  i ++ ) {
    int N = input . nextInt ( ) ;
    double x = 0.0 , y = 0.0 , z = 0.0 , vx = 0.0 , vy = 0.0 , vz = 0.0 ;
    double [ ] v ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      v = new double [ N ] ;
      for ( String s : readLine ( ) . split ( " " ) ) v [ 0 ] = Double . parseDouble ( s ) ;
      x += v [ 0 ] ;
      y += v [ 1 ] ;
      z += v [ 2 ] ;
      vx += v [ 3 ] ;
      vy += v [ 4 ] ;
      vz += v [ 5 ] ;
    }
    double V = vx * vx + vy * vy + vz * vz ;
    double t = V == 0.0 ? 0 : - ( x * vx + y * vy + z * vz ) / V ;
    if ( t < 0.0 ) t = 0.0 ;
    double d = sqrt ( ( x + t * vx ) * ( x + t * vx ) + ( y + t * vy ) * ( y + t * vy ) + ( z + t * vz ) * ( z + t * vz ) ) / N ;
    System . out . println ( "Case #" + ( i + 1 ) + ": " + d + " " + t ) ;
  }
  return x ;
}
