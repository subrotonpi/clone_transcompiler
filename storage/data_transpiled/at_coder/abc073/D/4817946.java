@ VisibleForTesting static int [ ] [ ] warshallFloyd ( int V , List < List < Integer >> E ) {
  final int INF = 10 * 9 ;
  int [ ] [ ] d = new int [ V ] [ V ] ;
  for ( int j = 0 ;
  j < V ;
  j ++ ) {
    d [ j ] [ i ] = INF ;
  }
  for ( int i = 0 ;
  i < V ;
  i ++ ) {
    d [ i ] [ j ] = E . get ( i ) . get ( j ) ;
  }
  for ( int k = 0 ;
  k < V ;
  k ++ ) {
    for ( int i = 0 ;
    i < V - 1 ;
    i ++ ) {
      for ( int j = i ;
      j < V ;
      j ++ ) {
        int dk = d [ i ] [ k ] + d [ k ] [ j ] ;
        if ( d [ i ] [ j ] > dk ) {
          d [ i ] [ j ] = dk ;
          d [ j ] [ i ] = dk ;
        }
      }
    }
  }
  return d ;
}
