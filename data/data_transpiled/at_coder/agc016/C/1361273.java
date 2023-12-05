public static void main ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  int h = Integer . parseInt ( input ) ;
  int w = Integer . parseInt ( input ) ;
  if ( H % h == 0 && W % w == 0 ) {
    System . out . println ( "No" ) ;
    exit ( 0 ) ;
  }
  int blocks = ( H / h ) * ( W / w ) ;
  int left = H * W - blocks * h * w ;
  int offset = blocks / left + 1 ;
  int [ ] v = {
    offset , - offset * ( h * w - 1 ) - 1 }
    ;
    System . out . println ( "Yes" ) ;
    for ( int i = 0 ;
    i < H ;
    i ++ ) {
      int [ ] a = new int [ W ] ;
      for ( int j = 0 ;
      j < W ;
      j ++ ) {
        a [ j ] = v [ i % h == h - 1 && j % w == w - 1 ? 1 : 0 ] ;
      }
      System . out . println ( Arrays . toString ( a ) ) ;
    }
  }
  