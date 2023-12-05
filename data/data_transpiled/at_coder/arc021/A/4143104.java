public static String [ ] [ ] L = new String [ 4 ] [ ] ;
for ( int h = 0 ;
h < 4 ;
h ++ ) {
  L [ h ] = new String [ ] {
    Integer . parseInt ( input . nextLine ( ) ) }
    ;
  }
  int [ ] [ ] dxy = {
    {
      - 1 , 0 }
      , {
        1 , 0 }
        , {
          - 0 , - 1 }
          , {
            0 , 1 }
          }
          ;
          String ans = "GAMEOVER" ;
          int explore = 1 ;
          for ( int y = 0 ;
          y < 4 ;
          y ++ ) {
            if ( ! explore ) break ;
            for ( int x = 0 ;
            x < 4 ;
            x ++ ) {
              if ( ! explore ) break ;
              for ( int dy = 0 ;
              dy < dxy . length ;
              dy ++ ) {
                int dx = dxy [ dy ] [ x ] ;
                int ny = y + dy ;
                int nx = x + dx ;
                if ( ( ny < 0 ) || ( ny >= 4 ) || ( nx < 0 ) || ( nx >= 4 ) ) continue ;
                if ( L [ y ] [ x ] == L [ ny ] [ nx ] ) {
                  ans = "CONTINUE" ;
                  explore = 0 ;
                  break ;
                }
              }
            }
          }
          System . out . println ( ans ) ;
          return ans ;
        }
        