static final double solve ( double D , double [ ] [ ] Pdt , double acc ) {
  double min_t = Math . sqrt ( 2 * D / acc ) ;
  double add_t = 0.0 ;
  int i = 0 ;
  while ( Pdt [ i ] [ 0 ] < D ) {
    double d = Pdt [ i ] [ 0 ] ;
    double my_t = Math . sqrt ( 2 * d / acc ) ;
    double his_t = Pdt [ i ] [ 1 ] ;
    add_t = Math . max ( add_t , his_t - my_t ) ;
    i ++ ;
  }
  double my_t = min_t + add_t ;
  double his_t ;
  if ( Pdt [ i ] [ 0 ] - Pdt [ i - 1 ] [ 0 ] == 0 ) his_t = my_t ;
  else his_t = Pdt [ i - 1 ] [ 1 ] + ( D - Pdt [ i - 1 ] [ 0 ] ) * ( Pdt [ i ] [ 1 ] - Pdt [ i - 1 ] [ 1 ] ) / ( Pdt [ i ] [ 0 ] - Pdt [ i - 1 ] [ 0 ] ) ;
  return Math . max ( my_t , his_t ) ;
}
