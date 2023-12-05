) ) public static String __author__ ( ) {
  "Tianren Liu" ;
  final Scanner scanner = new Scanner ( System . in ) ;
  if ( scanner . hasNextLine ( ) ) {
    final int T = scanner . nextInt ( ) ;
    for ( int t : xrange ( T ) ) {
      final int N = scanner . nextInt ( ) ;
      if ( N == 0 ) {
        System . out . println ( "Case #" + ( t + 1 ) + ": INSOMNIA" ) ;
        continue ;
      }
      final boolean [ ] seen = new boolean [ 10 ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        seen [ i ] = false ;
      }
      int remain = 10 ;
      int M = 0 ;
      while ( remain > 0 ) {
        M = M + N ;
        int m = M ;
        while ( m > 0 ) {
          final int r = m % 10 ;
          m = m / 10 ;
          if ( seen [ r ] == false ) {
            seen [ r ] = true ;
            remain -- ;
          }
        }
      }
      System . out . println ( "Case #" + ( t + 1 ) + ": " + M ) ;
    }
  }
  return null ;
}
