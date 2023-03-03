@ VisibleForTesting static double solve ( int c , int n ) throws IOException {
  /* Factor of the coefficients in the file */
  double factln = factorial ( n + 1 ) ;
  /* Factor of the coefficients in the file */
  double pi = k - j ;
  double po = c - pi ;
  double lnp = factln ( n - c ) + factln ( j ) + factln ( n - j ) ;
  lnp -= factln ( n ) + factln ( j - po ) + factln ( n - j - pi ) ;
  double p = exp ( lnp ) ;
  /* Factor of the coefficients in the file */
  double [ ] p0 = new double [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    p0 [ i ] = 0 ;
  }
  p0 [ 0 ] = 1.0 ;
  double [ ] p1 = new double [ n + 1 ] ;
  double sum = 0.0 ;
  int nstep = 0 ;
  double prob_prev = 0.0 ;
  while ( p0 [ n ] < 0.999999 ) {
    for ( int j = 0 ;
    j < n + 1 ;
    j ++ ) p1 [ j ] = 0.0 ;
    for ( int j = 0 ;
    j < n + 1 ;
    j ++ ) for ( int k = j ;
    k <= n ;
    k ++ ) {
      if ( k - j > c ) break ;
      double p = prob ( c , n , j , k ) ;
      p1 [ k ] += p0 [ j ] * p ;
    }
    for ( int j = 0 ;
    j < n + 1 ;
    j ++ ) p0 [ j ] = p1 [ j ] ;
    nstep ++ ;
    sum += ( p0 [ n ] - prob_prev ) * ( nstep ) ;
    prob_prev = p0 [ n ] ;
  }
  return sum ;
}
