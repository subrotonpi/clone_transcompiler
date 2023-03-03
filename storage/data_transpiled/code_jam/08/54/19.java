static private long calc ( int H , int W , int R [ ] [ ] ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  final int [ ] [ ] board = new int [ W ] [ H ] ;
  for ( int x = 0 ;
  x < W ;
  x ++ ) {
    for ( int y = 0 ;
    y < H ;
    y ++ ) {
      board [ r - 1 ] [ c - 1 ] = 0 ;
    }
  }
  board [ 0 ] [ 0 ] = 1 ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      if ( board [ i ] [ j ] != 0 ) {
        int x = i - 1 , y = j - 2 ;
        if ( x >= 0 && y >= 0 && board [ x ] [ y ] != 0 ) {
          board [ i ] [ j ] += board [ x ] [ y ] ;
        }
        x = i - 2 , y = j - 1 ;
        if ( x >= 0 && y >= 0 && board [ x ] [ y ] != 0 ) {
          board [ i ] [ j ] += board [ x ] [ y ] ;
        }
      }
    }
  }
  return board [ H - 1 ] [ W - 1 ] % 10007 ;
}
