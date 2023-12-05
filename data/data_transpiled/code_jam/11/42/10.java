private static int solve ( ) {
  int r = Integer . parseInt ( readLine ( ) ) ;
  int c = Integer . parseInt ( readLine ( ) ) ;
  int d = Integer . parseInt ( readLine ( ) ) ;
  int [ ] [ ] a = new int [ r ] [ c ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) a [ i ] [ 0 ] = Integer . parseInt ( readLine ( ) ) ;
  for ( int k = Integer . parseInt ( readLine ( ) ) ;
  k >= 0 ;
  k -- ) {
    for ( int x = Integer . parseInt ( readLine ( ) ) ;
    x < r - k + 1 ;
    x ++ ) {
      for ( int y = Integer . parseInt ( readLine ( ) ) ;
      y < c - k + 1 ;
      y ++ ) {
        int sx = 0 ;
        int sy = 0 ;
        for ( int i = 0 ;
        i < a . length ;
        i ++ ) {
          for ( int j = 0 ;
          j < a . length ;
          j ++ ) {
            if ( a [ i ] [ j ] == 0 && ( a [ j ] [ 0 ] == 0 || a [ j ] [ k - 1 ] == 0 ) ) continue ;
            if ( a [ i ] [ j ] == 0 && a [ j ] [ k - 1 ] == 0 ) continue ;
            sx += ( a [ i ] [ x ] [ y ] ) ;
            sy += ( a [ j ] [ x ] [ y ] ) ;
          }
        }
        if ( sx == sy ) return k ;
      }
    }
  }
  return "IMPOSSIBLE" ;
}
