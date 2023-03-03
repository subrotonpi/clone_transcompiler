public static double [ ] bellmanFord ( int vertexNum , @ Nonnull int [ ] edges , int source , int sink ) {
  double [ ] distances = new double [ vertexNum ] ;
  Arrays . fill ( distances , Double . POSITIVE_INFINITY ) ;
  distances [ source ] = 0 ;
  for ( int i = 0 ;
  i < vertexNum ;
  i ++ ) {
    for ( int j = 0 ;
    j < edges . length ;
    j ++ ) {
      distances [ v ] = Math . min ( distances [ v ] , distances [ u ] + edges [ j ] ) ;
    }
  }
  for ( int i = 0 ;
  i < edges . length ;
  i ++ ) {
    if ( distances [ u ] + edges [ i ] < distances [ v ] ) {
      distances [ v ] = distances [ u ] + edges [ i ] ;
      if ( distances [ v ] > distances [ u ] && distances [ v ] < distances [ v ] ) {
        distances [ v ] = distances [ u ] + edges [ i ] ;
        if ( distances [ v ] == sink ) {
          return new double [ 0 ] ;
        }
      }
    }
  }
  return distances ;
}
