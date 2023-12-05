@ VisibleForTesting static void heapSort ( ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  float INF = Float . POSITIVE_INFINITY ;
  String [ ] [ ] F = new String [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    String s = new String ( input . nextLine ( ) ) ;
    F [ i ] = s ;
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      if ( s . charAt ( j ) == 'S' ) {
        sx = i ;
        sy = j ;
      }
      else if ( s . charAt ( j ) == 'G' ) {
        gx = i ;
        gy = j ;
      }
    }
  }
  int left = 1 , right = 10 * 9 ;
  while ( right - left > 1 ) {
    int mid = ( left + right ) / 2 ;
    int [ ] [ ] D = new int [ W ] [ W ] ;
    for ( int i = 0 ;
    i < H ;
    i ++ ) {
      D [ i ] [ 0 ] = INF ;
    }
    D [ sx ] [ sy ] = 0 ;
    int [ ] que = new int [ ] {
      new int [ ] {
        0 , sx , sy }
      }
      ;
      while ( que . length > 0 ) {
        int d = heapheappop ( que ) ;
        int x = heappop ( que ) ;
        int y = heappop ( que ) ;
        if ( D [ x ] [ y ] < d ) continue ;
        for ( int dx = 0 , dy = 1 ;
        dx < H ;
        dx ++ , dy ++ ) {
          int nx = x + dx , ny = y + dy ;
          if ( ! ( 0 <= nx && nx < H && 0 <= ny && ny < W ) ) continue ;
          float cost = F [ nx ] [ ny ] == "#" ? mid : 1 ;
          if ( D [ nx ] [ ny ] > D [ x ] [ y ] + cost ) {
            D [ nx ] [ ny ] = D [ x ] [ y ] + cost ;
            heappush ( que , new int [ ] {
              D [ nx ] [ ny ] , nx , ny }
              ) ;
            }
          }
        }
        if ( D [ gx ] [ gy ] <= T ) {
          left = mid ;
        }
        else {
          right = mid ;
        }
      }
      System . out . println ( left ) ;
    }
    