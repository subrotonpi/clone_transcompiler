@ VisibleForTesting static void from ( LinkedHashMap < Integer , Integer > input ) {
  int n = Integer . parseInt ( input . next ( ) ) ;
  int a = input . next ( ) - 1 ;
  int b = input . next ( ) ;
  int m = input . nextInt ( ) ;
  int [ ] [ ] edges = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) edges [ i ] = new int [ n ] ;
  int mod = 10 * 9 + 7 ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int i = input . nextInt ( ) ;
    int j = input . nextInt ( ) ;
    edges [ i - 1 ] [ j - 1 ] = i ;
    edges [ j - 1 ] [ i - 1 ] = i ;
  }
  Queue < Integer > q = new ArrayDeque < > ( ) ;
  final double INF = Double . POSITIVE_INFINITY ;
  double [ ] dist = new double [ n ] ;
  dist [ a ] = INF ;
  int [ ] ptn = new int [ n ] ;
  ptn [ a ] = 1 ;
  int [ ] added = new int [ n ] ;
  added [ a ] = 1 ;
  while ( q . size ( ) > 0 ) {
    int v = q . poll ( ) ;
    for ( int town : edges [ v ] ) {
      if ( dist [ v ] + 1 <= dist [ town ] ) {
        dist [ town ] = dist [ v ] + 1 ;
        ptn [ town ] += ptn [ v ] ;
        if ( ! added [ town ] ) {
          q . add ( town ) ;
          added [ town ] = 1 ;
        }
      }
    }
  }
  System . out . println ( ptn [ b ] % mod ) ;
}
