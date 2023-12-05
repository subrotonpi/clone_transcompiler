@ GwtIncompatible ( "java.util.BitSet" ) private static int [ ] [ ] check ( int x ) {
  int [ ] [ ] s = new int [ 8 ] [ 8 ] ;
  int d = x / 8 , m = x % 8 ;
  for ( int i = 0 ;
  i < 8 ;
  i ++ ) {
    s [ 8 * i ] = 8 * i + m ;
    s [ 8 * d + i ] = 8 * d ;
  }
  for ( int d = - 9 ;
  d <= 7 ;
  d ++ ) {
    int y = x ;
    while ( 0 <= y + d && y <= 63 && ( y % 8 ) > 0 ) {
      y += d ;
      s [ 8 * i + d ] = y ;
    }
  }
  for ( int d = 9 ;
  d <= - 7 ;
  d ++ ) {
    int y = x ;
    while ( 0 <= y + d && y <= 63 && ( y % 8 ) < 7 ) {
      y += d ;
      s [ 8 * i + d ] = y ;
    }
  }
  return s ;
}
