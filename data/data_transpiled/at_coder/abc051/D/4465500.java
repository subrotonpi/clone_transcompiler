public static int warshallFloyd ( int [ ] [ ] d , int V , int M ) {
  for ( int k = 0 ;
  k < V ;
  k ++ ) {
    for ( int i = 0 ;
    i < V ;
    i ++ ) {
      for ( int j = 0 ;
      j < V ;
      j ++ ) {
        d [ i ] [ j ] = Math . min ( d [ i ] [ j ] , d [ i ] [ k ] + d [ k ] [ j ] ) ;
      }
    }
  }
  return d [ V ] [ M ] ;
}
