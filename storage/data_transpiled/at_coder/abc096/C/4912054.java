public static void print ( int H , int W ) {
  String [ ] s = Integer . parseInt ( input . nextLine ( ) ) ;
  boolean [ ] [ ] check = new boolean [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    s [ i ] = new String ( input . nextLine ( ) ) ;
  }
  check [ 0 ] [ 0 ] = false ;
  int [ ] dx = {
    - 1 , 0 , 1 , 0 }
    ;
    int [ ] dy = {
      0 , - 1 , 0 , 1 }
      ;
      for ( int h = 0 ;
      h < H ;
      h ++ ) {
        for ( int w = 0 ;
        w < W ;
        w ++ ) {
          int bcount = 0 ;
          if ( s [ h ] [ w ] == '#' ) {
            for ( int i = 0 ;
            i < 4 ;
            i ++ ) {
              if ( 0 <= h + dx [ i ] && h <= H - 1 && 0 <= w + dy [ i ] && w <= W - 1 && s [ h + dx [ i ] ] [ w + dy [ i ] ] == '#' ) {
                bcount ++ ;
              }
            }
            if ( bcount == 0 ) {
              System . out . println ( "No" ) ;
              exit ( ) ;
            }
          }
        }
      }
      System . out . println ( "Yes" ) ;
    }
    