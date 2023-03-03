static final double p ( ) {
  double p = input ( ) ;
  double x = max ( - 3 / 2 * Math . log2 ( 3 / ( 2 * p * Math . log ( 2 ) ) ) , 0 ) ;
  return x + p * 2 * ( - x / 1.5 ) ;
}
