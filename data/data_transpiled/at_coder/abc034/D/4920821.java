public static double saltSolution ( @ Nonnegative int N , int K , @ Nonnull List < ? extends Number > solutions ) {
  double l = 0.0 , r = 100.0 ;
  double e = 10 * ( - 10 ) ;
  /* Check goal */
  List < Double > A = new ArrayList < > ( ) ;
  for ( int w = 0 ;
  w < N ;
  w ++ ) {
    A . add ( new Double ( - w * ( p - goal ) ) ) ;
  }
  for ( int p = 0 ;
  p < N ;
  p ++ ) {
    A . add ( new Double ( - w * ( p - goal ) ) ) ;
  }
  double cw = 0 , cp = 0 ;
  for ( final double w = 0 ;
  w < K ;
  w ++ ) {
    cp = ( cw * cp + w * p ) / ( cw + w ) ;
    cw = w + cw ;
  }
  /* Loop through the loop */
  while ( r - l > e ) {
    final double m = ( r + l ) / 2 ;
    if ( check ( m ) ) {
      l = m ;
    }
    else {
      r = m ;
    }
  }
  /* Loop through the loop */
  if ( getClass ( ) . isClassPresent ( String . class ) ) {
    int i = 0 ;
    N = Integer . parseInt ( input ( ) ) ;
    K = Integer . parseInt ( input ( ) ) ;
    solutions = new ArrayList < > ( ) ;
    for ( int s = 0 ;
    s < N ;
    s ++ ) {
      solutions . add ( new Integer ( s ) ) ;
    }
    double ans = saltSolution ( N , K , solutions ) ;
    System . out . println ( ans ) ;
  }
  return 0 ;
}
