public static void print ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  char [ ] [ ] square = new char [ W + 2 ] [ ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    square [ i ] = new char [ W + 2 ] ;
  }
  for ( int i = 0 ;
  i < W ;
  i ++ ) {
    square [ i ] [ 0 ] = '#' ;
  }
  int [ ] [ ] result = new int [ H + 2 ] [ W + 2 ] ;
  for ( int y = 0 ;
  y < H ;
  y ++ ) {
    for ( int x = 0 ;
    x < W + 2 ;
    x ++ ) {
      result [ y ] [ x ] = 1 ;
    }
  }
}
