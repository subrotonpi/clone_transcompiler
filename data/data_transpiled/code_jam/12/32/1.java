@ Sys public static void main ( String [ ] args ) {
  for ( int cn = 0 ;
  cn < xrange ( 1 , 1 + Integer . parseInt ( args [ 0 ] ) ) ;
  ++ cn ) {
    Arrays . fill ( args , Double . NaN ) ;
    int D = Integer . parseInt ( args [ 1 ] ) ;
    Arrays . fill ( args , Double . NaN ) ;
    Arrays . fill ( args , Double . NaN ) ;
    Arrays . fill ( args , Double . NaN ) ;
    int [ ] [ ] dists = new int [ N ] [ N ] ;
    for ( int i = 0 ;
    i < N ;
    ++ i ) {
      dists [ i ] = Integer . parseInt ( args [ 1 ] ) ;
    }
    Arrays . fill ( args , Double . NaN ) ;
    accs = new int [ N ] [ N ] ;
    for ( int i = 0 ;
    i < N ;
    ++ i ) {
      accs [ i ] = Integer . parseInt ( args [ 2 ] ) ;
    }
    System . out . println ( "Case #" + cn + ":" ) ;
    for ( int i = 0 ;
    i < xrange ( 1 , N ) ;
    ++ i ) {
      if ( dists [ i ] [ 1 ] >= D ) {
        Arrays . fill ( dists [ i - 1 ] [ 1 ] , Double . NaN ) ;
        double t0 = dists [ i - 1 ] [ 0 ] ;
        double d0 = dists [ i - 1 ] [ 0 ] ;
        double t1 = dists [ i ] [ 1 ] ;
        double d1 = dists [ i ] [ 1 ] ;
        double T = t0 + ( ( D - d0 ) * ( t1 - t0 ) ) / ( d1 - d0 ) ;
      }
    }
    for ( double acc : accs ) {
      double mustWait = 0.0 ;
      for ( int i = 0 ;
      i < xrange ( N - 1 ) ;
      ++ i ) {
        Arrays . fill ( dists [ i ] [ 0 ] , Double . NaN ) ;
        double t0 = dists [ i ] [ 1 ] ;
        double d0 = dists [ i ] [ 0 ] ;
        double t1 = dists [ i ] [ 1 ] ;
        double d1 = dists [ i ] [ 1 ] ;
        double dt = t1 - t0 ;
        double dd = d1 - d0 ;
        if ( d0 > D ) {
          break ;
        }
        mustWait = Math . max ( mustWait , t0 - Math . sqrt ( 2 * d0 / acc ) ) ;
        if ( d1 < D ) {
          mustWait = Math . max ( mustWait , t1