static int solvePow10 ( int p ) {
  int y = 10 ;
  int i = 1 ;
  while ( i < p ) {
    i ++ ;
    y += 10 * ( i / 2 ) + 10 * ( ( i + 1 ) / 2 ) - 1 ;
  }
  return y ;
  for ( int x = 1 ;
  x <= Integer . parseInt ( input . nextLine ( ) ) ;
  x ++ ) {
    int N = Integer . parseInt ( input . nextLine ( ) ) ;
    int N1 = N ;
    int lastInc = 0 ;
    if ( N1 % 10 == 0 ) {
      N1 -- ;
      lastInc = 1 ;
    }
    int l = Integer . toString ( N1 ) . length ( ) ;
    int y1 ;
    if ( l == 1 ) {
      y = N1 ;
    }
    else {
      y = solvePow10 ( l - 1 ) ;
      y1 = N1 - 10 * ( l - 1 ) ;
      int l2 = l / 2 ;
      String sN1 = Integer . toString ( N1 ) ;
      String sN1a = sN1 . substring ( l2 ) ;
      String sN1b = StringUtils . reverse ( sN1 . substring ( 0 , l2 ) ) ;
      int y2 = Integer . parseInt ( sN1b ) + 1 + Integer . parseInt ( sN1a ) - 1 ;
      y += Math . min ( y1 , y2 ) ;
    }
    y += lastInc ;
    System . out . println ( "Case #" + x + ":" + y ) ;
  }
  return y ;
}
