static final double distance2 ( Point p ) {
  return p . x * p . x + p . y * p . y ;
  /* Compute the distance of the point */
  double g = MathUtils . gcd ( Math . abs ( p . x ) , Math . abs ( p . y ) ) ;
  /* Compute the distance of the point */
  Point place = new Point ( p . x / g , p . y / g ) ;
  /* Solve the answer */
  int H = Integer . parseInt ( readLine ( ) ) ;
  int W = Integer . parseInt ( readLine ( ) ) ;
  int D = Integer . parseInt ( readLine ( ) ) ;
  for ( int j : xrange ( H ) ) {
    String raw = readLine ( ) ;
    for ( int i : xrange ( W ) ) {
      if ( raw . charAt ( i ) == 'X' ) {
        place = new Point ( i , j ) ;
      }
    }
  }
  int dx = ( W - place . x - 1 ) * 2 - 1 ;
  int dy = ( H - place . y - 1 ) * 2 - 1 ;
  int H2 = ( H - 2 ) * 2 ;
  int W2 = ( W - 2 ) * 2 ;
  double D2 = D * D ;
  Set < Point > points = new HashSet < Point > ( ) ;
  for ( int j : xrange ( - ( D / H2 + 1 ) , D / H2 + 1 ) ) {
    for ( int i : xrange ( - ( D / W2 + 1 ) , D / W2 + 1 ) ) {
      Point p0 = new Point ( i * W2 , j * H2 ) ;
      if ( p0 . length ( ) != 0 && distance2 ( p0 ) <= D2 ) {
        points . add ( normalize ( p0 ) ) ;
      }
      Point p1 = new Point ( i * W2 + dx , j * H2 ) ;
      if ( distance2 ( p1 ) <= D2 ) {
        points . add ( normalize ( p1 ) ) ;
      }
      Point p2 = new Point ( i * W2 , j * H2 + dy ) ;
      if ( distance2 ( p2 ) <= D2 ) {
        points . add ( normalize ( p2 ) ) ;
      }
      Point p3 = new Point ( i * W2 + dx , j * H2 + dy ) ;
      if ( distance2 ( p3 ) <= D2 ) {
        points . add ( normalize ( p3 ) ) ;
      }
    }
  }
  int T = Integer . parseInt ( readLine (