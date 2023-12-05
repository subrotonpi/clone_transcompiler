static private double evalP ( List < Double > pSet ) {
  int k = pSet . size ( ) ;
  double [ ] dp = ( k + 1 ) * new double [ k ] ;
  dp [ 0 ] = 1.0 ;
  for ( double p : pSet ) {
    double [ ] dp_new = ( k + 1 ) * new double [ k ] ;
    dp_new [ 0 ] = ( 1 - p ) * dp [ 0 ] ;
    for ( int j = 1 ;
    j <= k ;
    ++ j ) {
      dp_new [ j ] = p * dp [ j - 1 ] + ( 1 - p ) * dp [ j ] ;
    }
    dp = dp_new ;
  }
  return dp [ k / 2 ] ;
}
