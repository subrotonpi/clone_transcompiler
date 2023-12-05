@ VisibleForTesting static double atan2 ( double [ ] xy ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  xy = Arrays . stream ( xy ) . map ( Integer :: parseInt ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  double C = 0 ;
  double D = 0 ;
  double P = PI / 2 - 1e-9 ;
  double Q = PI / 2 + 1e-9 ;
  double Z = PI * 2 ;
  double [ ] hq = new double [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    final double x0 = xy [ i ] ;
    final double y0 = xy [ i ] ;
    final double [ ] b = new double [ n ] ;
    for ( int j = 0 ;
    j < b . length ;
    j ++ ) {
      b [ j ] = Math . atan2 ( y - y0 , b [ j ] - x0 ) ;
    }
    Arrays . sort ( b ) ;
    int s = b [ s ] + P ;
    int t = b [ t ] + PI ;
    b [ s ] = 10 ;
    for ( int j = t ;
    j < b . length ;
    j ++ ) {
      b [ s ] += Z ;
    }
  }
  return C ;
}
