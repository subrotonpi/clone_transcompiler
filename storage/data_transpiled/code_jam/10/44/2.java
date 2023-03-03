static final double dist ( double [ ] a , double [ ] b ) {
  return Math . sqrt ( ( a [ 0 ] - b [ 0 ] ) * ( a [ 0 ] - b [ 0 ] ) + ( a [ 1 ] - b [ 1 ] ) * ( a [ 1 ] - b [ 1 ] ) ) ;
  if ( getClass ( ) . isEnum ( ) ) {
    for ( int testCase = 0 ;
    testCase < xrange ( input ) ;
    testCase ++ ) {
      int N = Integer . parseInt ( input . nextLine ( ) ) ;
      int M = Integer . parseInt ( input . nextLine ( ) ) ;
      int [ ] [ ] P = new int [ N ] [ M ] ;
      int [ ] [ ] A = new int [ N ] [ M ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        P [ i ] = new int [ N ] ;
        for ( int j = 0 ;
        j < M ;
        j ++ ) {
          A [ i ] [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
        }
      }
      for ( int i = 0 ;
      i < M ;
      i ++ ) {
        A [ i ] [ i ] = new int [ N ] ;
        for ( int j = 0 ;
        j < M ;
        j ++ ) {
          A [ i ] [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
        }
      }
      List < Double > resl = new ArrayList < Double > ( ) ;
      for ( int i = 0 ;
      i < A . length ;
      i ++ ) {
        double d = dist ( P [ i ] [ 0 ] , P [ i ] [ 1 ] ) ;
        double r0 = dist ( A [ i ] [ 0 ] , P [ i ] [ 1 ] ) ;
        double r1 = dist ( A [ i ] [ 1 ] , P [ i ] [ 2 ] ) ;
        double a0 = 2.0 * Math . acos ( ( r0 * r0 + d * d - r1 * r1 ) / ( 2.0 * r0 * d ) ) ;
        double a1 = 2.0 * Math . acos ( ( r1 * r1 + d * d - r0 * r0 ) / ( 2.0 * r1 * d ) ) ;
        double res = ( 0.5 * a1 * r1 * r1 - 0.5 * r1 * r1 * Math . sin ( a1 ) + 0.5 * a0 * r0 * r0 - 0.5 * r0 * r0 * Math . sin ( a0 ) ) ;
        resl . add ( res ) ;
      }
      System . out . println