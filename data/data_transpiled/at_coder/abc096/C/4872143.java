public static void main ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  char [ ] [ ] field = new char [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    field [ i ] = new char [ W ] ;
    for ( int y = 0 ;
    y < H ;
    y ++ ) {
      for ( int x = 0 ;
      x < W ;
      x ++ ) {
        if ( field [ y ] [ x ] == '#' ) {
          boolean flag = false ;
          for ( int dy = 1 , dx = - 1 ;
          dy <= 1 ;
          dy ++ , dx = - 1 ) {
            int ny = y + dy , nx = x + dx ;
            if ( 0 <= nx && nx < W && 0 <= ny && ny < H ) {
              if ( field [ ny ] [ nx ] == '#' ) {
                flag = true ;
              }
            }
            else {
              continue ;
            }
          }
          if ( flag == false ) {
            System . out . println ( "No" ) ;
            exit ( ) ;
          }
        }
      }
    }
  }
  System . out . println ( "Yes" ) ;
}
