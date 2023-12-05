public static int candidatesOfNoShortestPaths ( @ Nonnegative int N , int M , @ Nonnull int [ ] [ ] edges ) {
  final double INF = Double . POSITIVE_INFINITY ;
  int [ ] [ ] d = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      d [ i ] [ j ] = i == j ? INF : INF ;
    }
  }
  for ( int k = 0 ;
  k < N ;
  k ++ ) {
    for ( int u = 0 ;
    u < N ;
    u ++ ) {
      for ( int v = 0 ;
      v < N ;
      v ++ ) {
        if ( d [ u ] [ v - 1 ] > d [ u ] [ k ] + d [ k ] [ v ] ) {
          d [ u ] [ v ] = d [ u ] [ k ] + d [ k ] [ v ] ;
        }
      }
    }
  }
  return Arrays . stream ( edges ) . filter ( edge -> ! used ( edge ) ) . count ( ) ;
}
