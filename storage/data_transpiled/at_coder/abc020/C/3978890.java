static final boolean bfs ( ) {
  final int H = Integer . parseInt ( input . nextLine ( ) ) ;
  final int W = Integer . parseInt ( input . nextLine ( ) ) ;
  final int T = Integer . parseInt ( input . nextLine ( ) ) ;
  final char [ ] s = new char [ H ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    s [ i ] = input . charAt ( i ) ;
  }
  /* bfs */
  int [ ] [ ] g = new int [ H * W ] [ W ] ;
  int S = 0 ;
  int G = 0 ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      if ( s [ i ] [ j ] == 'S' ) S = i * W + j ;
      if ( s [ i ] [ j ] == 'G' ) G = i * W + j ;
      if ( 1 <= i ) g [ i * W + j ] [ ( i - 1 ) * W + j ] = s [ i - 1 ] [ j ] == '#' ? 1 : 1 ;
      if ( i < H - 1 ) g [ i * W + j ] [ ( i + 1 ) * W + j ] = s [ i + 1 ] [ j ] == '#' ? 1 : 1 ;
      if ( 1 <= j ) g [ i * W + j ] [ i * W + ( j - 1 ) ] = s [ i ] [ j - 1 ] == '#' ? 1 : 1 ;
      if ( j < W - 1 ) g [ i * W + j ] [ i * W + ( j + 1 ) ] = s [ i ] [ j + 1 ] == '#' ? 1 : 1 ;
    }
  }
  int [ ] [ ] dist = ssc . dijkstra ( g , true , S ) ;
  return dist [ G ] <= T ;
}
