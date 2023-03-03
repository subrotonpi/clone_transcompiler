private static void warshallFloyd ( int vCount , @ Nonnull int [ ] [ ] matrix ) {
  for ( int i = 0 ;
  i < vCount ;
  i ++ ) {
    for ( int j = 0 ;
    j < matrix [ i ] . length ;
    j ++ ) {
      int c2 = matrix [ i ] [ j ] [ 0 ] ;
      for ( int k = 0 ;
      k < matrix [ j ] . length ;
      k ++ ) {
        final int c1 = matrix [ j ] [ k ] ;
        final int c3 = matrix [ i ] [ k ] ;
        if ( c1 > c2 + c3 ) {
          matrix [ j ] [ k ] = c2 + c3 ;
        }
      }
    }
  }
  {
    final double [ ] [ ] matrix = new double [ 51 ] [ 51 ] ;
    for ( int s = 0 ;
    s < 51 ;
    s ++ ) {
      matrix [ s ] [ s ] = Double . POSITIVE_INFINITY ;
    }
    for ( int i = 1 ;
    i < 51 ;
    i ++ ) {
      matrix [ s ] [ i ] = 0 ;
      for ( int d = 0 ;
      d < divisors ;
      d ++ ) {
        matrix [ i ] [ i % divisors ] [ d ] = 1 ;
      }
    }
  }
  {
    final double inf = Double . POSITIVE_INFINITY ;
    return Arrays . stream ( matrix ) . filter ( s -> s != inf ) . findFirst ( ) . filter ( t -> t != inf ) . findFirst ( ) . filter ( t -> t != inf ) . findFirst ( ) . filter ( t -> t != inf ) . findFirst ( ) . filter ( t -> t != inf ) . findFirst ( ) . filter ( t -> t != null ) . findFirst ( ) . filter ( t -> t != null ) . findFirst ( ) . filter ( t -> t != null ) . findFirst ( ) . filter ( t -> t != null ) . findFirst ( ) . filter ( t -> t != null ) . findFirst ( ) . filter ( t -> t != null ) . findFirst ( ) . filter ( t -> t != null ) . filter ( t -> t != null ) . findFirst ( ) . filter ( t -> t != null ) . filter ( t -> t != null ) . findFirst ( ) . filter ( t -> t != null ) . filter ( t -> t != null ) . findFirst ( ) . filter ( t -> t != null ) . findFirst ( ) . filter ( t -> t != null )