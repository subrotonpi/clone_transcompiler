@ GwtIncompatible ( "gcjt" ) public static void main ( String ... args ) {
  for ( Test t : tests ( ) ) {
    int p = t . ri ( ) ;
    int q = t . ri ( ) ;
    int [ ] x = new int [ ] {
      0 }
      ;
      x [ 0 ] = t . ri ( ) ;
      x [ 1 ] = t . ri ( ) ;
      int [ ] [ ] f = new int [ q + 2 ] [ q + 2 ] ;
      for ( int i = 0 ;
      i <= q ;
      i ++ ) f [ i ] [ i + 1 ] = 0 ;
      for ( int l = 2 ;
      l <= q ;
      l ++ ) {
        for ( int i = 0 ;
        i < q + 2 - l ;
        i ++ ) f [ i ] [ i + l ] = x [ i + l ] - x [ i ] - 2 + Math . min ( f [ i ] [ j ] + f [ j ] [ i + l ] , x [ i + l ] ) ;
      }
      t . answer ( f [ 0 ] [ q + 1 ] ) ;
    }
  }
  