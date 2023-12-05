public static void main ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  char [ ] [ ] f = new char [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    f [ i ] = new char [ W ] ;
    for ( int y = 0 ;
    y < H ;
    y ++ ) {
      for ( int x = 0 ;
      x < W ;
      x ++ ) {
        if ( f [ y ] [ x ] == '#' ) {
          int flag = 0 ;
          for ( int dy = 1 , dx = - 1 ;
          dy < W ;
          dy ++ , dx = - 1 ) {
            int ny = y + dy , nx = x + dx ;
            if ( 0 <= nx && nx < W && 0 <= ny && ny < H ) {
              if ( f [ ny ] [ nx ] == '#' ) {
                flag = 1 ;
              }
            }
          }
          if ( flag == 0 ) {
            System . out . println ( "No" ) ;
            exit ( ) ;
          }
        }
      }
    }
  }
  System . out . println ( "Yes" ) ;
}
