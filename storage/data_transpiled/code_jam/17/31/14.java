@ VisibleForTesting static double solve ( int N , int K , double [ ] R , double [ ] H ) {
  double S_max = 0 ;
  for ( int i : xrange ( N ) ) {
    double [ ] C = new double [ N ] ;
    for ( int j : xrange ( N ) ) {
      if ( j != i && R [ j ] <= R [ i ] ) {
        C [ j ] = - 2 * PI * R [ j ] * H [ j ] ;
      }
    }
    double S = PI * R [ i ] * R [ i ] + 2 * PI * R [ i ] * H [ i ] - Math . pow ( new Double ( C ) , 0 ) ;
    S_max = Math . max ( S_max , S ) ;
  }
  return S_max ;
}
