public static double computeCdf ( int N_MAX , int N , int N , int N , int N , int N ) {
  double [ ] p_n_2n = new double [ N_MAX ] ;
  double [ ] p_n_2n_1 = new double [ N_MAX ] ;
  for ( int i : xrange ( 1 , N_MAX ) ) {
    double last = p_n_2n [ N - 1 ] ;
    last *= ( 2 * i - 1 ) / ( double ) 2 * i ;
    p_n_2n [ N - 1 ] = last ;
  }
  for ( int i : xrange ( 1 , N_MAX ) ) {
    double answer = solveCase ( i + 1 ) ;
    System . out . printf ( "Case #%d: %.10f%n" , i + 1 , answer ) ;
  }
  double answer ;
  for ( int i : xrange ( 1 , N_MAX ) ) {
    answer = computeCdf ( i + 1 ) ;
    System . out . printf ( "Case #%d: %.10f%n" , i + 1 , answer ) ;
  }
  double p = p_n_2n [ N ] ;
  double ret = 0.5 + p / 2 ;
  while ( k < N ) {
    p *= ( N - k ) / ( double ) ( k + 1 ) ;
    ret += p ;
    k ++ ;
  }
  return ret ;
}
