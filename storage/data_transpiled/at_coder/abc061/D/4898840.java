static int bellmanFord ( int n , List < Edge > edges , int source ) {
  final double inf = Double . MAX_VALUE ;
  final double [ ] dist = new double [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    dist [ i ] = inf ;
  }
  dist [ source ] = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( Edge edge : edges ) {
      if ( dist [ edge . y ] > dist [ edge . x ] + edge . z ) {
        dist [ edge . y ] = dist [ edge . x ] + edge . z ;
        if ( i == n - 1 && edge . y == n - 1 ) {
          return - 1 ;
        }
      }
    }
  }
  return dist [ 0 ] ;
}
