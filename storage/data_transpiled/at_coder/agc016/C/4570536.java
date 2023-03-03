public static int H = Integer . parseInt ( input ) {
  int W = Integer . parseInt ( input . readLine ( ) ) ;
  int h = Integer . parseInt ( input . readLine ( ) ) ;
  int w = Integer . parseInt ( input . readLine ( ) ) ;
  if ( h * w == 1 ) {
    System . out . println ( "No" ) ;
    exit ( ) ;
  }
  int plus = 1000 ;
  int [ ] [ ] matrix = new int [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) matrix [ i ] [ 0 ] = plus ;
  int minus = - h * w * plus + plus - 1 , total = H * W * plus ;
  int y , x ;
  for ( y = h - 1 ;
  y < H ;
  y += h ) {
    for ( x = w - 1 ;
    x < W ;
    x += w ) {
      matrix [ y ] [ x ] = minus ;
      total += minus - plus ;
    }
  }
  if ( total <= 0 ) {
    System . out . println ( "No" ) ;
  }
  else {
    System . out . println ( "Yes" ) ;
    for ( int i = 0 ;
    i < matrix . length ;
    i ++ ) {
      System . out . println ( ( int [ ] ) matrix [ i ] [ 0 ] ) ;
    }
  }
  return total ;
}
