public static double bMooreLaw ( double P ) {
  final double t_extremum = 1.5 * Math . log2 ( P * Math . log ( 2 ) / 1.5 ) ;
  double ans = t_extremum > 0.0 ? t_extremum + P * ( 2 * ( - t_extremum / 1.5 ) ) : P ;
  ans = Math . round ( ans ) ;
  return ans ;
}
