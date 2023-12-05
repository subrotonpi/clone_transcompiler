@ VisibleForTesting static String getStdoutFileName ( ) throws IOException {
  final boolean DEBUG = true ;
  final int [ ] dx = {
    0 , 0 , - 1 , 1 }
    ;
    final int [ ] dy = {
      - 1 , 1 , 0 , 0 }
      ;
      final Scanner scanner = new Scanner ( System . in ) ;
      final int H = scanner . nextInt ( ) ;
      final int N = scanner . nextInt ( ) ;
      final int M = scanner . nextInt ( ) ;
      final int [ ] [ ] ceilings = new int [ N ] [ M ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        ceilings [ i ] = Integer . parseInt ( scanner . nextLine ( ) ) ;
      }
      final int [ ] [ ] ids = new int [ N ] [ M ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        ids [ i ] [ 0 ] = 0 ;
      }
      final Queue < Integer > q = new LinkedList < Integer > ( ) ;
      q . add ( start ) ;
      while ( q . size ( ) > 0 ) {
        final int x = q . poll ( ) ;
        final int y = q . poll ( ) ;
        ids [ x ] [ y ] = 1 ;
        for ( int k = 0 ;
        k < 4 ;
        k ++ ) {
          if ( x + dx [ k ] < 0 || x + dx [ k ] >= N ) continue ;
          if ( y + dy [ k ] < 0 || y + dy [ k ] >= M ) continue ;
          final int nx = x + dx [ k ] , ny = y + dy [ k ] ;
          if ( c [ nx ] [ ny ] - f [ x ] [ y ] < 50 || c [ nx ] [ ny ] - f [ nx ] [ ny ] < 50 || c [ x ] [ y ] - f [ nx ] [ ny ] < 50 ) continue ;
          final int curtime = times [ x ] [ y ] ;
          final int curlvl = Math . max ( f [ x ] [ y ] , H - 10 * curtime ) ;
          final int waitingTime = Math . max ( 0 , ( curlvl - ( c [ nx ] [ ny ] - 50 ) ) / 10.0 ) ;
          int dt = 1 ;
          if ( curtime == 0 && waitingTime == 0 ) dt = 0 ;
          else if ( f [ x ] [ y ] + 20 > H - 10.0 * ( curtime + waitingTime ) ) dt = 10 ;
          if ( curtime + dt +