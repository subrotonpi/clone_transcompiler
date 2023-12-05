@ VisibleForTesting static double updateMinA ( double minA , double t ) {
  if ( minA > t ) {
    return t ;
  }
  return minA ;
  /* check range */
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < T ;
  ++ i ) {
    A [ i ] = i ;
  }
  minA = Double . MAX_VALUE ;
  double [ ] P = new double [ N ] ;
  for ( int i = 0 ;
  i < P . length ;
  ++ i ) {
    P [ i ] = minA ;
  }
  return P [ N ] ;
}
