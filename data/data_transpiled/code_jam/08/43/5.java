static final String solve ( ) throws IOException {
  final Scanner fin = new Scanner ( System . in ) ;
  final PrintWriter fout = new PrintWriter ( new FileWriter ( new File ( args [ 0 ] + ".out" ) ) ) ;
  final int n = fin . nextInt ( ) ;
  final long start = System . nanoTime ( ) ;
  for ( int q1 = - 1 ;
  q1 <= 2 ;
  q1 += 2 ) {
    for ( int q2 = - 1 ;
    q2 <= 2 ;
    q2 += 2 ) {
      final int [ ] res = new int [ 2 ] ;
      for ( int q3 = - 1 ;
      q3 <= 2 ;
      q3 += 2 ) {
        final double sx = q1 * q3 ;
        final double sy = q2 * q3 ;
        final double sz = q3 ;
        double bound = 1000000 ;
        for ( int i = 0 ;
        i < ships . length ;
        i ++ ) {
          final int x = ships [ i ] ;
          final int y = ships [ i ] ;
          final int z = ships [ i ] ;
          final double p = ships [ i ] ;
          bound = Math . min ( bound , x * sx + y * sy + z * sz + power * p ) ;
        }
        res [ i ] = bound ;
      }
      if ( res [ 0 ] + res [ 1 ] < 0 ) {
        return false ;
      }
    }
  }
  return true ;
}
