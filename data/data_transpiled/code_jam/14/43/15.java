static private int minCut ( int [ ] [ ] grid ) {
  final int w = grid [ 0 ] [ 0 ] ;
  final int h = grid [ 0 ] [ 1 ] ;
  final int t = input . nextInt ( ) ;
  {
    int [ ] [ ] g = new int [ w ] [ h ] ;
    for ( int i = 1 ;
    i < w ;
    i ++ ) {
      g [ i ] [ 0 ] = 1 ;
    }
    int [ ] [ ] buildings = new int [ h ] [ w ] ;
    for ( int i = 0 ;
    i < h ;
    i ++ ) {
      for ( int j = 0 ;
      j < b ;
      j ++ ) {
        int x0 = i ;
        int y0 = i ;
        int x1 = i ;
        int y1 = i ;
        for ( int j = y0 ;
        j <= y1 ;
        j ++ ) {
          for ( int j = y0 ;
          j <= y1 ;
          j ++ ) {
            for ( int x = x0 ;
            x <= x1 ;
            x ++ ) {
              g [ x ] [ y ] = 0 ;
            }
          }
        }
      }
    }
    return g . length ;
  }
  {
    int [ ] [ ] g = new int [ w ] [ h ] ;
    for ( int i = 0 ;
    i < h ;
    i ++ ) {
      int x0 = i ;
      int y0 = i ;
      int x1 = i ;
      int y1 = i ;
      for ( int j = 0 ;
      j < w ;
      j ++ ) {
        int b = i ;
        if ( b > 0 ) {
          g [ i ] [ j ] = 1 ;
        }
      }
    }
    return g . length ;
  }
  {
    int [ ] [ ] l = new int [ w ] [ h ] ;
    if ( w - 1 >= 0 && h > 0 ) {
      l [ w - 1 ] [ h - 1 ] = 1 ;
    }
    if ( h - 1 >= 0 && h > 0 ) {
      l [ w - 1 ] [ h - 1 ] = 1 ;
    }
    if ( w + 1 <= h ) {
      l [ w - 1 ] [ h - 1 ] = 1 ;
    }
    if ( h + 1 <= h ) {
      l [ w - 1 ] [ h - 1 ] = 1 ;
    }
    return l [ w - 1 ] [ h - 1 ] ;
  }
}
