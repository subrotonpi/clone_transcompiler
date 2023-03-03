public static void print ( int testCase , Range range ) {
  int C = Integer . parseInt ( readLine ( ) ) ;
  int D = Integer . parseInt ( readLine ( ) ) ;
  Point [ ] points = new Point [ range . length ] ;
  for ( int i = 0 ;
  i < points . length ;
  i ++ ) points [ i ] = map . get ( ) ;
  double l = 0.0 , r = 2e6 * D ;
  for ( int i = 0 ;
  i < range . length ;
  i ++ ) {
    double m = ( l + r ) / 2 ;
    double p = points [ 0 ] . x - m ;
    boolean possible = true ;
    for ( Point point : points ) {
      p = Math . max ( p , point . x - m ) ;
      double lastP = p + D * ( point . y - 1 ) ;
      double limitP = point . x + m ;
      if ( lastP > limitP ) {
        possible = false ;
        break ;
      }
      p = lastP + D ;
    }
    if ( possible ) r = m ;
    else l = m ;
  }
  System . out . println ( "Case #" + testCase + ": " + l ) ;
}
