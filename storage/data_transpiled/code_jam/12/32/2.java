public static double bestTime ( double D , List < Integer > positions ) throws IOException {
  final Scanner fi = new Scanner ( new File ( "B.in" ) ) ;
  final PrintWriter fo = new PrintWriter ( new File ( "B.out" ) ) ;
  int T = Integer . parseInt ( fi . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    final double t = positions . get ( i ) ;
    final double x = positions . get ( i ) ;
    if ( t > startT && x < D && 0.5 * a * ( t - startT ) * x > x ) {
      startT = t - ( 2. * x / a ) * 0.5 ;
    }
    else if ( x >= D ) {
      final int t1 = positions . get ( i - 1 ) ;
      final double x1 = positions . get ( i ) ;
      if ( x1 < D ) {
        tD = t1 + ( D - x1 ) * ( t - t1 ) / ( x - x1 ) ;
      }
    }
  }
  return Math . max ( tD , startT + ( 2. * D / a ) * 0.5 ) ;
}
