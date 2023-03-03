public static void print ( int H , int W ) {
  int [ ] [ ] blue = new int [ H ] [ W ] ;
  int [ ] [ ] red = new int [ H ] [ W ] ;
  for ( int x = 0 ;
  x < W ;
  x ++ ) {
    blue [ 0 ] [ x ] = 1 ;
    red [ - 1 ] [ x ] = 1 ;
  }
  for ( int y = 0 ;
  y < H - 1 ;
  y ++ ) {
    for ( int x = 0 ;
    x < W ;
    x += 2 ) {
      blue [ y ] [ x ] = 1 ;
      if ( x + 1 < W ) {
        red [ y + 1 ] [ x + 1 ] = 1 ;
      }
    }
  }
  char [ ] [ ] m = new char [ H ] [ W ] ;
  for ( int y = 0 ;
  y < H ;
  y ++ ) {
    m [ y ] = input . charAt ( y ) ;
  }
  for ( int [ ] color : new int [ ] [ ] {
    red , blue }
    ) {
      for ( int y = 0 ;
      y < H ;
      y ++ ) {
        for ( int x = 0 ;
        x < W ;
        x ++ ) {
          if ( m [ y ] [ x ] == '#' ) {
            System . out . print ( '#' ) ;
          }
          else if ( color [ y ] [ x ] == 1 ) {
            System . out . print ( '#' ) ;
          }
          else {
            System . out . print ( "." ) ;
          }
        }
        System . out . println ( ) ;
      }
    }
    System . out . println ( ) ;
  }
  