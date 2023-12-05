public static double diff ( int x0 , int y0 , int x1 , int y1 ) {
  return ( ( x1 - x0 ) * ( x1 - x0 ) + ( y1 - y0 ) * ( y1 - y0 ) ) * ( 1 / 2 ) ;
  /* Calculate the difference between the two integers */
  x0 = Integer . parseInt ( input . nextLine ( ) ) ;
  y0 = Integer . parseInt ( input . nextLine ( ) ) ;
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  pX = new int [ N ] ;
  pY = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    pX [ i ] = a ;
    pY [ i ] = b ;
  }
  double ret = 100000000 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int xa = pX [ i ] ;
    int xb = i + 1 < N ? pX [ i + 1 ] : pX [ 0 ] ;
    int ya = pY [ i ] ;
    int yb = i + 1 < N ? pY [ i + 1 ] : pY [ 0 ] ;
    double a2 = diff2 ( x0 , y0 , xa , ya ) ;
    double b2 = diff2 ( x0 , y0 , xb , yb ) ;
    double c2 = diff2 ( xa , ya , xb , yb ) ;
    double m = ( a2 - b2 + c2 ) / 2 / c2 ;
    double d = ( a2 - m * m * c2 ) * ( 1 / 2 ) ;
    ret = Math . min ( d , ret ) ;
  }
  System . out . println ( ret ) ;
  return ret ;
}
