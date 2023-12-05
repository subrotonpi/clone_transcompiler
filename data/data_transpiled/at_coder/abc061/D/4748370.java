public static double INF = Double . POSITIVE_INFINITY ;
{
  double [ ] lp = new double [ n ] ;
  Arrays . fill ( lp , - INF ) ;
  lp [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int a = 0 ;
    a < es . length ;
    a ++ ) {
      for ( int b = 0 ;
      b < es . length ;
      b ++ ) {
        if ( lp [ a ] != - INF && lp [ b ] < lp [ a ] + es [ b ] ) {
          lp [ b ] = lp [ a ] + es [ b ] ;
          if ( i == n - 1 && b == n - 1 ) {
            return Double . POSITIVE_INFINITY ;
          }
        }
      }
    }
  }
  return lp [ n - 1 ] ;
}
