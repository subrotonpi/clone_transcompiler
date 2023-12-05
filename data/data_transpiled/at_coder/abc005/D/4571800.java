public static int [ ] [ ] getM ( ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] f = new int [ N + 1 ] [ N + 1 ] ;
  for ( int x = 0 ;
  x < N + 1 ;
  x ++ ) {
    for ( int y = 1 ;
    y <= N ;
    y ++ ) {
      f [ y ] [ x ] += f [ y - 1 ] [ x ] ;
    }
  }
  for ( int y = 0 ;
  y < N + 1 ;
  y ++ ) {
    for ( int x = 1 ;
    x <= N ;
    x ++ ) {
      f [ y ] [ x ] += f [ y ] [ x - 1 ] ;
    }
  }
  int [ ] [ ] M = new int [ N * N + 1 ] [ N + 1 ] ;
  for ( int y1 = 1 ;
  y1 <= N ;
  y1 ++ ) {
    for ( int x1 = 1 ;
    x1 <= N ;
    x1 ++ ) {
      for ( int y2 = y1 ;
      y2 <= y1 ;
      y2 ++ ) {
        for ( int x2 = x1 <= x1 ;
        x2 ++ ) {
          int s = ( y1 - y2 ) * ( x1 - x2 ) ;
          M [ s ] = Math . max ( M [ s ] , f [ y1 ] [ x1 ] - f [ y2 ] [ x1 ] - f [ y1 ] [ x2 ] + f [ y2 ] [ x2 ] ) ;
        }
      }
    }
  }
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int ans = 0 , L = Integer . parseInt ( input . nextLine ( ) ) ;
    for ( int j = 0 ;
    j < L ;
    j ++ ) {
      ans = Math . max ( ans , M [ j ] ) ;
    }
    System . out . println ( ans ) ;
  }
  return M ;
}
