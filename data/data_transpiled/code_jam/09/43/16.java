@ VisibleForTesting static int [ ] [ ] table ( int height , int width ) {
  final int [ ] [ ] t = new int [ height ] [ width ] ;
  for ( int i = 0 ;
  i < height ;
  i ++ ) {
    t [ i ] = new int [ width ] ;
    for ( int j = 0 ;
    j < width ;
    j ++ ) {
      t [ i ] [ j ] = 0 ;
    }
  }
  return t ;
}
