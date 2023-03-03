static final double gain ( double [ ] pgain , double s_t , double s_d , double f_t , double addm , double g ) {
  double lgain = pgain [ Math . min ( addm + f_t , 1000 ) ] ;
  if ( s_d <= addm + s_t ) {
    double sgain = pgain [ Math . min ( addm + s_t - s_d , 1000 ) ] + g ;
    return Math . max ( lgain , sgain ) ;
  }
  return lgain ;
}
