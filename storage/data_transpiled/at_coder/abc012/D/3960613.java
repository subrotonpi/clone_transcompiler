public static int [ ] [ ] warhsAllFloyd ( int [ ] [ ] graph ) {
  int numV = graph . length ;
  for ( int i = 0 ;
  i < numV ;
  i ++ ) {
    for ( int j = 0 ;
    j < graph [ i ] . length ;
    j ++ ) {
      int c2 = graph [ i ] [ j ] ;
      for ( int row = 0 ;
      row < graph [ i ] . length ;
      row ++ ) {
        for ( int k = 0 ;
        k < graph [ j ] . length ;
        k ++ ) {
          final int c1 = graph [ j ] [ row ] ;
          final int c3 = graph [ i ] [ row ] ;
          if ( c1 > c2 + c3 ) {
            graph [ j ] [ k ] = c2 + c3 ;
          }
        }
      }
    }
  }
  return graph ;
}
