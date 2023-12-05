@ VisibleForTesting static void from ( LinkedHashMap < Integer , Integer > input ) {
  int n = Integer . parseInt ( input . next ( ) ) ;
  int a = Integer . parseInt ( input . next ( ) ) ;
  int b = Integer . parseInt ( input . next ( ) ) ;
  int m = Integer . parseInt ( input . next ( ) ) ;
  int [ ] [ ] edges = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    edges [ i ] = new int [ n ] ;
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      edges [ i - 1 ] [ j ] = j - 1 ;
      edges [ j - 1 ] [ i - 1 ] = i ;
    }
  }
  Queue < Integer > q = new ArrayDeque < Integer > ( ) ;
  final double INF = Double . POSITIVE_INFINITY ;
  double [ ] dist = new double [ n ] ;
  dist [ a ] = INF ;
  int [ ] ptn = new int [ n ] ;
  ptn [ a ] = 1 ;
  while ( q . size ( ) > 0 ) {
    int v = q . poll ( ) ;
    for ( int town : edges [ v ] ) {
      if ( dist [ v ] + 1 < dist [ town ] ) {
        dist [ town ] = dist [ v ] + 1 ;
        ptn [ town ] = ptn [ v ] ;
        q . add ( town ) ;
      }
      else if ( dist [ v ] + 1 == dist [ town ] ) {
        ptn [ town ] += ptn [ v ] ;
      }
    }
  }
  System . out . println ( ptn [ b ] % mod ) ;
}
