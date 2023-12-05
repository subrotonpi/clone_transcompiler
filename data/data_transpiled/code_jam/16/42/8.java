static double compute ( List < List < Double >> P ) {
  int K = P . size ( ) ;
  assert K % 2 == 0 ;
  double [ ] [ ] DP = new double [ K + 1 ] [ K + 1 ] ;
  for ( int i = 0 ;
  i < K + 1 ;
  ++ i ) {
    DP [ i ] [ 0 ] = 1.0 ;
  }
  for ( int i = 1 ;
  i <= K ;
  ++ i ) {
    for ( int k = i + 1 ;
    k < P . length ;
    ++ k ) {
      DP [ i ] [ k ] = 0.0 ;
      DP [ i ] [ k ] += DP [ i - 1 ] [ k - 1 ] * PP [ i - 1 ] ;
      DP [ i ] [ k ] += DP [ i - 1 ] [ k ] * ( 1 - PP [ i - 1 ] ) ;
    }
  }
  return DP [ K ] [ K / 2 ] ;
}
