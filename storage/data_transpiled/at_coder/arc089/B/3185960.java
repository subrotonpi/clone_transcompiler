@ VisibleForTesting static int [ ] [ ] getSortedGrid ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int K = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] grid = new int [ K * 2 + 1 ] [ K ] ;
  for ( int i = 0 ;
  i < grid . length ;
  i ++ ) {
    grid [ i ] [ 0 ] = 0 ;
  }
  for ( String l : System . console ( ) . split ( " " ) ) {
    int x = Integer . parseInt ( l ) ;
    int y = Integer . parseInt ( l ) ;
    if ( l . equals ( "B" ) ) x += K ;
    grid [ y % ( K * 2 ) + 1 ] [ x % ( K * 2 ) + 1 ] ++ ;
  }
  for ( int y = 0 ;
  y < grid . length ;
  y ++ ) {
    final int [ ] up = grid [ y ] ;
    final int cur = grid [ y ] [ y ] ;
    grid [ y ] = new int [ up . length ] ;
    for ( int n1 = 1 , n2 = up . length ;
    n1 < cur ;
    n1 ++ ) grid [ y ] [ x ] = 0 ;
    grid [ y + 1 ] [ x ] = 0 ;
  }
  int ans = 0 ;
  int total = grid [ K + 1 ] [ K ] ;
  for ( int y = 0 ;
  y < K + 1 ;
  y ++ ) {
    final int r1 = grid [ y ] [ K - 1 ] ;
    final int r2 = grid [ y + K ] [ K - 1 ] ;
    for ( int x = 0 ;
    x < grid . length ;
    x ++ ) {
      final int upL = grid [ y ] [ x ] ;
      final int upR = grid [ y ] [ x ] ;
      final int downL = grid [ y + K ] [ x ] ;
      final int downR = grid [ y ] [ x ] ;
      final int d1 = grid [ y ] [ x ] ;
      final int d2 = grid [ y ] [ x ] ;
      int v = downR - downL - upR + upL ;
      v += total - d2 - r2 + downR ;
      v += d1 - downL ;
      v += r1 - upR ;
      v += upL ;
      if ( v < N - v ) v = N - v ;
      if ( ans < v ) ans = v ;
    }
  }
  System . out . println ( ans ) ;
  return grid ;
}
