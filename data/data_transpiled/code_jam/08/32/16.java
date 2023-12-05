static final String getCamelCase ( int n ) throws IOException {
  final int [ ] digits = new int [ ] {
    2 , 3 , 5 , 7 }
    ;
    for ( int p : digits ) {
      if ( n % p == 0 ) {
        return true ;
      }
    }
    final StringBuilder output = new StringBuilder ( ) ;
    final BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    try {
      for ( int N = 1 ;
      N <= Integer . MAX_VALUE ;
      N ++ ) {
        final List < String > digits = new LinkedList < > ( ) ;
        for ( int i = 1 ;
        i <= N ;
        i ++ ) {
          digits . add ( br . readLine ( ) . trim ( ) ) ;
        }
        final StringBuilder foo = new StringBuilder ( ) ;
        for ( int i = 1 ;
        i <= N ;
        i ++ ) {
          if ( digits . size ( ) == 1 ) {
            return isCamelCase ( digits . get ( i ) ) ? 1 : 0 ;
          }
          final int [ ] a = new int [ digits . size ( ) ] ;
          for ( int j = 0 ;
          j < digits . size ( ) ;
          j ++ ) {
            a [ j ] = digits . get ( i ) + digits . get ( j ) ;
          }
          final int [ ] b = new int [ digits . size ( ) ] ;
          for ( int j = 0 ;
          j < digits . size ( ) ;
          j ++ ) {
            b [ j ] = digits . get ( j ) - digits . get ( j ) ;
          }
          return foo . append ( a ) . append ( b ) . toString ( ) ;
        }
        final StringBuilder bar = new StringBuilder ( ) ;
        for ( int j = 0 ;
        j < digits . size ( ) ;
        j ++ ) {
          if ( digits . get ( j ) == 1 ) {
            return bar . append ( Integer . parseInt ( digits . get ( j ) ) ) ;
          }
          final int [ ] a = bar . append ( done . toArray ( new String [ digits . size ( ) ] ) , digits . subList ( 0 , digits . size ( ) ) ) ;
          final int [ ] b = bar . append ( new StringBuilder ( ) , digits . subList ( j , digits . size ( ) ) ) ;
          return a . append ( b ) . toString ( ) ;
        }
        output . append ( Integer . parseInt ( digits . get ( j ) ) ) ;
      }
    }
    finally {
      br . close ( ) ;
    }
    final PrintWriter pw = new PrintWriter ( System . out ) ;
    try {
      pw . println