@ VisibleForTesting static int [ ] [ ] bfs ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] [ ] G = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input ( ) ) ;
    int b = Integer . parseInt ( input ( ) ) ;
    a = a - 1 ;
    b = b - 1 ;
    G [ a ] [ b ] = b ;
    G [ b ] [ a ] = a ;
  }
  final double INF = Double . POSITIVE_INFINITY ;
  {
    int [ ] d = new int [ N ] ;
    Arrays . fill ( d , INF ) ;
    d [ s ] = 0 ;
    int [ ] rec = {
      0 , 0 }
      ;
      Queue < Integer > que = new LinkedList < Integer > ( ) ;
      que . add ( s ) ;
      while ( que . size ( ) > 0 ) {
        int v = que . poll ( ) ;
        for ( int w : G [ v ] ) {
          if ( d [ w ] != INF ) continue ;
          d [ w ] = d [ v ] + 1 ;
          que . add ( w ) ;
          if ( rec [ 0 ] < d [ w ] ) {
            rec [ 0 ] = d [ w ] ;
            rec [ 1 ] = w ;
          }
        }
      }
    }
    return rec ;
  }
  