static double N ( double N , double Va , double Vb , double L ) {
  double result = L ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    double t = result / Va ;
    result = t * Vb ;
  }
  System . out . println ( "" + result ) ;
  return result ;
}
