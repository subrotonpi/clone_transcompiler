static final String print ( ) {
  final int inf = 10 * 20 ;
  final int mod = 10 * 9 + 7 ;
  /* LI */
  final int [ ] li = new int [ 10 ] ;
  /* LI_ */
  final int [ ] li = new int [ 10 ] ;
  /* LF */
  final int [ ] lf = new int [ 10 ] ;
  /* LS */
  final int [ ] ls = new int [ 10 ] ;
  /* I */
  final int [ ] i = new int [ 10 ] ;
  /* F */
  final int [ ] s = new int [ 10 ] ;
  /* S */
  final int R = li [ 0 ] ;
  final int C = li [ 1 ] ;
  final int N = li [ 2 ] ;
  final int [ ] a = new int [ N ] ;
  /* main loop */
  final int [ ] [ ] ff = new int [ N ] ;
  /* loop */
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int x1 = li [ i ] [ 0 ] ;
    final int y1 = li [ i ] [ 1 ] ;
    final int x2 = li [ i ] [ 1 ] ;
    final int y2 = li [ i ] [ 2 ] ;
    if ( ( 0 < x1 && x1 < R && 0 < y1 && y1 < C ) || ( 0 < x2 && x2 < R && 0 < y2 && y2 < C ) ) {
      continue ;
    }
    a [ i ] [ 0 ] = ff [ x1 ] [ y1 ] ;
    a [ i ] [ 1 ] = ff [ x2 ] [ y2 ] ;
  }
  Arrays . sort ( a ) ;
  final int [ ] b = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    b [ i ] = a [ i ] [ 1 ] ;
  }
  final int [ ] s = new int [ N ] ;
  int si = - 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( si < - 1 ) {
      si ++ ;
      s [ 0 ] = i ;
      continue ;
    }
    if ( s [ si ] == i ) {
      si -- ;
    }
    else {
      si ++ ;
      s [ si ] = i ;
    }
  }
  if ( si > 1 ) {
    return "NO" ;
  }
  return "YES" ;
}
