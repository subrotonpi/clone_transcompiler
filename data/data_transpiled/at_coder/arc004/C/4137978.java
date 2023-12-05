public static final String getDistance ( ) {
  if ( __name__ == "__main__" ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    int mi = ( int ) Math . max ( 1. , ( x + Math . sqrt ( x * x + 2 * y * y ) ) / y - 100 ) ;
    int ma = ( int ) ( 2 * x / y + 100 ) ;
    List < int [ ] > p = new ArrayList < > ( ) ;
    for ( int n = mi ;
    n < ma ;
    n ++ ) {
      if ( ( n * ( n + 1 ) * y - 2 * n * x ) > 0 && ( n * ( n + 1 ) * y - 2 * n * x ) % ( 2 * y ) == 0 ) {
        int m = ( n * ( n + 1 ) * y - 2 * n * x ) / ( 2 * y ) ;
        if ( 1 <= m && m <= n ) {
          p . add ( new int [ ] {
            n , m }
            ) ;
          }
        }
      }
      if ( p . size ( ) == 0 ) {
        System . out . println ( "Impossible" ) ;
      }
      else {
        for ( int [ ] nm : p ) {
          System . out . println ( nm [ 0 ] + " " + nm [ 1 ] ) ;
        }
      }
    }
    return "" ;
  }
  