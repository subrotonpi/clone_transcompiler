@ VisibleForTesting static int [ ] [ ] floyd_warshall ( ) {
  int V = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] A = new int [ M ] [ V ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  double INF = Double . POSITIVE_INFINITY ;
  double [ ] [ ] d = new double [ V ] [ V ] ;
  for ( int i = 0 ;
  i < V ;
  i ++ ) d [ i ] [ i ] = INF ;
  for ( int i = 0 ;
  i < V ;
  i ++ ) {
    int j = A [ i ] [ i ] ;
    int k = A [ i ] [ j ] ;
    if ( i != 1 && j != 1 ) {
      d [ i - 1 ] [ j - 1 ] = k ;
      d [ j - 1 ] [ i - 1 ] = k ;
    }
  }
  d = wf ( d ) ;
  int [ ] [ ] A2 = new int [ M ] [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    A2 [ i ] = A [ i ] [ 0 ] ;
  }
  double ans = INF ;
  for ( int i = 0 ;
  i < A2 . length ;
  i ++ ) {
    for ( int j = 0 ;
    j < A2 . length ;
    j ++ ) {
      if ( A2 [ i ] != A2 [ j ] && d [ i ] [ 1 ] - 1 ] [ j - 1 ] != INF ) {
        double tmp = A2 [ i ] [ 2 ] + A2 [ j ] [ 2 ] + d [ i ] [ 1 ] - 1 ] [ j - 1 ] ;
        ans = Math . min ( ans , tmp ) ;
      }
    }
  }
  if ( ans == INF ) System . out . println ( - 1 ) ;
  else System . out . println ( ( int ) ans ) ;
  return A ;
}
