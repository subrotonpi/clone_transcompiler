@ VisibleForTesting static double test ( int [ ] k ) {
  assert ( k . length == K ) ;
  double [ ] F = new double [ K / 2 + 1 ] ;
  F [ 0 ] = 1.0 ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    double p = k [ i ] ;
    double [ ] G = new double [ K / 2 + 1 ] ;
    for ( int j = 0 ;
    j < K / 2 ;
    j ++ ) {
      G [ j ] += F [ j ] * p ;
      G [ j + 1 ] += F [ j ] * ( 1 - p ) ;
    }
    G [ K / 2 ] += F [ K / 2 ] * p ;
    F = G ;
  }
  return F [ K / 2 ] ;
}
