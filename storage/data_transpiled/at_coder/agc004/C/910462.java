static private int [ ] [ ] genRandom ( int h , int w ) {
  final int [ ] [ ] g = new int [ h ] [ w ] ;
  for ( int i = 1 ;
  i < h - 1 ;
  i ++ ) {
    for ( int j = 1 ;
    j < w - 1 ;
    j ++ ) {
      if ( random . nextInt ( ) == 1 ) {
        g [ i ] [ j ] = 1 ;
      }
    }
  }
  return g ;
}
