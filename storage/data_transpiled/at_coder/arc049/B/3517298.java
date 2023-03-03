public static int N = Integer . parseInt ( input ) {
  int [ ] x = new int [ N ] ;
  int [ ] y = new int [ N ] ;
  int [ ] c = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    x [ i ] = 0 ;
    y [ i ] = 0 ;
    c [ i ] = 0 ;
  }
  int a = 0 ;
  int b = 10 * 10 ;
  int inf = 10 * 11 ;
  while ( b - a > 1e-5 ) {
    int d = ( a + b ) / 2 ;
    int [ ] distance = new int [ N ] ;
    int [ ] xLimU = new int [ N ] ;
    int [ ] xLimO = new int [ N ] ;
    int [ ] yLimU = new int [ N ] ;
    int [ ] yLimO = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      distance [ i ] = d / c [ i ] ;
    }
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      xLimU [ i ] = x [ i ] - distance [ i ] ;
      xLimO [ i ] = x [ i ] + distance [ i ] ;
      yLimU [ i ] = y [ i ] - distance [ i ] ;
      yLimO [ i ] = y [ i ] + distance [ i ] ;
    }
    int xLimU [ ] = xLimU [ 0 ] , xLimO [ 0 ] = yLimO [ 0 ] , yLimU [ 0 ] = yLimU [ 0 ] , yLimO [ 0 ] = yLimO [ 0 ] ;
    for ( int i = 1 ;
    i < N ;
    i ++ ) {
      if ( xLimU [ i ] <= yLimO [ i ] ) {
        xLimU [ i ] = xLimU [ i ] ;
        xLimO [ i ] = xLimO [ i ] ;
      }
      else if ( xLimU [ i ] < xLimO [ i ] ) {
        xLimU [ i ] = xLimU [ i ] ;
        xLimO [ i ] = xLimO [ i ] ;
      }
      else if ( xLimU [ i ] <= xLimO [ i ] ) {
      }
      else