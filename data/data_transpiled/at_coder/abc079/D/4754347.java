public static int dWall ( int H , int W , int [ ] [ ] C , int [ ] [ ] A ) {
  final int [ ] cost = new int [ H ] [ W ] ;
  for ( int h = 0 ;
  h < H ;
  h ++ ) {
    cost [ h ] [ w ] = cost [ A [ h ] [ w ] ] [ 1 ] ;
  }
  return ( int ) Math . pow ( cost , 10 ) ;
}
