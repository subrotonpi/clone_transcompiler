@ VisibleForTesting static void print ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] [ ] src = Arrays . stream ( input . nextLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  final double INF = Double . POSITIVE_INFINITY ;
  final double [ ] dist = new double [ N ] ;
  Arrays . fill ( dist , INF ) ;
  Arrays . fill ( dist , INF ) ;
  final PriorityQueue < Integer > hq = new PriorityQueue < > ( ) ;
  hq . add ( new Integer ( 0 ) ) ;
  heapify ( hq ) ;
  final boolean [ ] visited = new boolean [ N ] ;
  int nodes = 0 ;
  while ( hq . size ( ) > 0 ) {
    int d = hq . poll ( ) ;
    int i = hq . poll ( ) ;
    if ( visited [ i ] ) continue ;
    visited [ i ] = true ;
    nodes ++ ;
    if ( nodes == N ) break ;
    final int xi = src [ i ] ;
    final int yi = src [ i ] ;
    final int ti = src [ i + 1 ] ;
    final int ri = src [ i + 2 ] ;
    for ( int j = 0 ;
    j < ri ;
    j ++ ) {
      final int xj = src [ j ] ;
      final int yj = src [ j + 1 ] ;
      final int tj = src [ j + 2 ] ;
      final int rj = src [ j + 3 ] ;
      if ( i == j ) continue ;
      final double dij = hypot ( xi - xj , yi - yj ) / Math . min ( ti , rj ) ;
      if ( d + dij >= dist [ j ] ) continue ;
      dist [ j ] = d + dij ;
      heapify ( hq , dist , j ) ;
    }
  }
  int ans = 0 ;
  Arrays . sort ( dist , Collections . reverseOrder ( ) ) ;
  for ( int i = 0 ;
  i < dist . length - 1 ;
  i ++ ) {
    ans = Math . max ( ans , dist [ i ] + i ) ;
  }
  System . out . println ( ans ) ;
}
