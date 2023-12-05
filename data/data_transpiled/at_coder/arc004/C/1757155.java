@ VisibleForTesting static void main ( String [ ] args ) {
  final int [ ] dx = {
    0 , 0 , 0 , 0 }
    ;
    final double INF = Double . MAX_VALUE ;
    System . arraycopy ( args , 0 , dx , 0 , dx . length ) ;
    final double [ ] dy = {
      0 , - 1 , 0 , 1 }
      ;
      final double [ ] dx = {
        1 , 0 , - 1 , 0 }
        ;
        /* inside the y and x */
        final int X = Integer . parseInt ( input [ 0 ] ) ;
        final int Y = Integer . parseInt ( input [ 1 ] ) ;
        final List < String > ansList = new ArrayList < > ( ) ;
        for ( int n = Math . max ( 0 , 2 * X / Y - 10 ) ;
        n <= 2 * X / Y + 10 ;
        n ++ ) {
          final int a = n * ( Y + n * Y - 2 * X ) ;
          if ( a % ( 2 * Y ) == 0 ) {
            final int m = a / ( 2 * Y ) ;
            if ( 0 < m && m <= n ) {
              ansList . add ( n + " " + m ) ;
            }
          }
        }
        if ( ansList . size ( ) > 0 ) {
          System . out . println ( ansList . toArray ( new String [ ansList . size ( ) ] ) ) ;
        }
        else {
          System . out . println ( "Impossible" ) ;
        }
      }
      