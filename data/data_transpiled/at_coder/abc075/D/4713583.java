public static int axisParallelRectangle ( @ Nonnegative int N , int K , @ Nonnull Point [ ] xy ) {
  TreeSet < Point > sortedX = new TreeSet < Point > ( ) ;
  TreeSet < Point > sortedY = new TreeSet < Point > ( ) ;
  for ( Point v : xy ) {
    sortedX . add ( v . x ) ;
    sortedY . add ( v . y ) ;
  }
  Point [ ] XY = new Point [ N + 1 ] ;
  for ( Point v : xy ) {
    XY [ 0 ] = new Point ( sortedX . indexOf ( v . x ) , sortedY . indexOf ( v . y ) ) ;
  }
  int [ ] [ ] S = new int [ N + 1 ] [ N + 1 ] ;
  for ( int x = 0 ;
  x < XY . length ;
  x ++ ) {
    S [ x + 1 ] [ y + 1 ] = 1 ;
  }
  for ( int x = 0 ;
  x < XY . length ;
  x ++ ) {
    for ( int y = 0 ;
    y < XY [ x ] . length ;
    y ++ ) {
      S [ x + 1 ] [ y + 1 ] += S [ x ] [ y ] ;
    }
  }
  for ( int y = 0 ;
  y < XY . length ;
  y ++ ) {
    for ( int x = 0 ;
    x < XY [ x ] . length ;
    x ++ ) {
      S [ x + 1 ] [ y + 1 ] += S [ x ] [ y ] ;
    }
  }
  int minArea = Integer . MIN_VALUE ;
  for ( int x1 = 0 ;
  x1 < N ;
  x1 ++ ) {
    for ( int x2 = x1 + 1 ;
    x2 < N ;
    x2 ++ ) {
      for ( int y1 = 0 ;
      y1 < XY [ x ] . length ;
      y1 ++ ) {
        for ( int y2 = y1 + 1 ;
        y2 < XY [ x ] . length ;
        y2 ++ ) {
          int count = S [ x2 + 1 ] [ y2 + 1 ] - S [ x2 + 1 ] [ y1 ] - S [ x1 ] [ y2 + 1 ] + S [ x1 ] [ y1 ] ;
          if ( count < K ) {
            continue ;
          }
          int xmin = sortedX . get ( x1 ) ;
          int xmax = sortedX . get ( x2 ) ;
          int ymin = sortedY . get ( y1 ) ;
          int ymax = sortedY . get ( y2 ) ;
          minArea = Math . min ( minArea , ( xmax - xmin ) * ( ymax - ymin ) ) ;
        }
      }
    }
  }
  