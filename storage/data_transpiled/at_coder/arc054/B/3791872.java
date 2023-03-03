@ VisibleForTesting static double log ( double x ) {
  double P = input ( ) ;
  double x = max ( [ 0 , 1.5 * log2 ( 2 / 3 * P * log ( 2 ) ) ] ) ;
  return x + pow ( 2 , - x / 1.5 ) * P ;
}
