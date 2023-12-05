private static boolean doMatch ( @ Nonnull char [ ] [ ] A , @ Nonnull char [ ] [ ] B , @ Nonnull int [ ] offsets , int sizeB ) {
  int oh = offsets [ 0 ] ;
  int ow = offsets [ 1 ] ;
  for ( int h = 0 ;
  h < sizeB ;
  h ++ ) {
    for ( int w = 0 ;
    w < sizeB ;
    w ++ ) {
      if ( A [ oh + h ] [ ow + w ] != B [ h ] [ w ] ) {
        return false ;
      }
    }
  }
  /* template matching */
  for ( int offsetH = 0 ;
  offsetH < N - M + 1 ;
  offsetH ++ ) {
    for ( int offsetW = 0 ;
    offsetW < N - M + 1 ;
    offsetW ++ ) {
      if ( doMatch ( A , B , new int [ ] {
        offsetH , offsetW }
        , M ) ) {
          return true ;
        }
      }
    }
    / * ▁ if ▁ ( getClass ( ) . isRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRawRaw @ @