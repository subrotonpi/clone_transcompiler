@ VisibleForTesting static double logp ( ) {
  double p = input . nextDouble ( ) ;
  double a = 2 * p * log ( 0.5 ) / 3 ;
  double x = max ( 0 , ( 3 * log ( - 1.0 / a , 0.5 ) ) / 2 ) ;
  return x + p / ( 2 * ( 2 * x / 3 ) ) ;
}
