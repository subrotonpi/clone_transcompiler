static int run2 ( int [ ] [ ] a , int i , int X , int Y ) {
  final int n = a . length ;
  for ( int x = 0 ;
  x < n ;
  x ++ ) {
    for ( int y = 0 ;
    y < n ;
    y ++ ) {
      int t = a [ x ] [ y ] ;
      int x2 = x + X ;
      int y2 = y + Y ;
      final int [ ] coords = {
        new int [ ] {
          i - x2 - 1 , i - y2 - 1 }
          , new int [ ] {
            y2 , x2 }
            , new int [ ] {
              i - y2 - 1 , i - x2 - 1 }
            }
            ;
            for ( int x2 = 0 ;
            x2 < coords . length ;
            x2 ++ ) {
              int y2 = coords [ x2 ] ;
              int x3 = x2 - X ;
              int y3 = y2 - Y ;
              if ( 0 <= x3 && x3 < n && 0 <= y3 && a [ x3 ] [ y3 ] != t ) {
                return 0 ;
              }
            }
          }
        }
        return 1 ;
      }
      