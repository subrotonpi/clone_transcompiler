public static double [ ] [ ] result ( ) {
  final BufferedReader fin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final int T = Integer . parseInt ( fin . readLine ( ) ) ;
  final double DELTA = 0.000000001 ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    final List < Integer > line = ContainerUtil . newArrayList ( ) ;
    Integer N = line . get ( 0 ) ;
    final List < Integer > points = line . subList ( 1 , line . size ( ) ) ;
    final double total = points . size ( ) ;
    final double [ ] pointfs = new double [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      pointfs [ i ] = points . get ( i ) * 1.0 / total ;
    }
    final double [ ] [ ] result = new double [ points . size ( ) ] [ ] ;
    for ( int i = 0 ;
    i < result . length ;
    i ++ ) {
      double a = 0.0 ;
      double b = 1.0 ;
      double guess = 0.5 ;
      while ( b - a > DELTA ) {
        guess = ( b + a ) / 2 ;
        final double target = points . get ( i ) + guess ;
        double remainder = 1.0 - guess ;
        for ( int j = 0 ;
        j < pointfs . length ;
        j ++ ) {
          final double q = pointfs [ j ] ;
          if ( i == j ) continue ;
          final double required = target - q ;
          if ( required > 0 ) remainder -= required ;
        }
        if ( remainder > 0 ) {
          a = guess ;
        }
        else {
          b = guess ;
        }
      }
      result [ i ] = guess ;
    }
    System . out . println ( "Case #" + testCase + ": " + StringUtils . join ( result , " " ) ) ;
  }
  return result ;
}
