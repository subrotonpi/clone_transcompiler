static String foo2 ( int x , int y , int n , int [ ] [ ] a ) {
  int tx = 0 ;
  int ty = 0 ;
  int tt = 0 ;
  for ( int i = x ;
  i < x + n ;
  i ++ ) {
    for ( int j = y ;
    j < y + n ;
    j ++ ) {
      tx += a [ i ] [ j ] * i ;
      ty += a [ i ] [ j ] * j ;
      tt += a [ i ] [ j ] ;
    }
  }
  String res ;
  /* Test "IMPOSSIBLE" */
  int R = Integer . parseInt ( ifile . readLine ( ) ) ;
  int C = Integer . parseInt ( ifile . readLine ( ) ) ;
  int [ ] [ ] a = new int [ R ] [ R ] ;
  int N = Math . min ( R , C ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < C ;
    j ++ ) {
      if ( i + j > res [ i ] [ j ] ) break ;
      if ( j + j > res [ i ] [ j ] ) break ;
    }
  }
  /* Test "IMPOSSIBLE" */
  res = new String [ N ] [ N ] ;
  int cx = x + x + n - 1 ;
  int cy = y + y + n - 1 ;
  System . out . println ( x + " " + y + " " + cx + " " + cy + " " + tx + " " + ty + " " + n + " " + N + " " + tx * 2 + " " + cx * N + " " + ty * 2 + " " + cy * N ) ;
  return cx * N == tx * 2 && cy * N == ty * 2 ? res [ i ] [ j ] : 0 ;
}
