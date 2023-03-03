@ Nullable public static String readString ( ) {
  int H = Integer . parseInt ( input . readLine ( ) ) ;
  int W = Integer . parseInt ( input . readLine ( ) ) ;
  char [ ] [ ] c = new char [ W + 2 ] [ W + 2 ] ;
  for ( int h = 0 ;
  h < H ;
  h ++ ) {
    char [ ] C = input . readChar ( ) ;
    for ( int w = 0 ;
    w < W ;
    w ++ ) {
      c [ h + 1 ] [ w + 1 ] = C [ w ] ;
      if ( C [ w ] == 's' ) {
        s [ h + 1 ] [ w + 1 ] = 's' ;
      }
    }
  }
  int [ ] [ ] cnt = new int [ W + 2 ] [ ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    cnt [ i ] [ 0 ] = 0 ;
  }
  return "NO" ;
}
