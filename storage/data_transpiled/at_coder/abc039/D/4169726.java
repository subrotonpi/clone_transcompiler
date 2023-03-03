public static void print ( int H , int W ) {
  char [ ] S = {
    '.' }
    ;
    char [ ] [ ] A = {
      '.' }
      ;
      int [ ] [ ] dxy = {
        {
          0 , 1 }
          , {
            1 , 1 }
            , {
              1 , 0 }
              , {
                1 , - 1 }
                , {
                  0 , - 1 }
                  , {
                    - 1 , - 1 }
                    , {
                      - 1 , 0 }
                      , {
                        - 1 , 1 }
                      }
                      ;
                      for ( int y = 0 ;
                      y < H ;
                      y ++ ) {
                        for ( int x = 0 ;
                        x < W ;
                        x ++ ) {
                          if ( S [ y ] [ x ] == '.' ) continue ;
                          for ( int dx = 0 ;
                          dx < dxy . length ;
                          dx ++ ) {
                            int dy = dxy [ dx ] ;
                            int nx = x + dx , ny = y + dy ;
                            if ( ! 0 <= nx && nx < W ) continue ;
                            if ( ! 0 <= ny && ny < H ) continue ;
                            if ( S [ ny ] [ nx ] == '.' ) break ;
                            else A [ y ] [ x ] = '#' ;
                          }
                        }
                      }
                      char [ ] [ ] B = {
                        '.' }
                        ;
                        for ( int y = 0 ;
                        y < H ;
                        y ++ ) {
                          for ( int x = 0 ;
                          x < W ;
                          x ++ ) {
                            if ( A [ y ] [ x ] == '.' ) continue ;
                            B [ y ] [ x ] = '#' ;
                            for ( int dx = 0 ;
                            dx < dxy . length ;
                            dx ++ ) {
                              int dy = dxy [ dx ] ;
                              int nx = x + dx , ny = y + dy ;
                              if ( ! 0 <= nx && nx < W ) continue ;
                              if ( ! 0 <= ny && ny < H ) continue ;
                              B [ ny ] [ nx ] = '#' ;
                            }
                          }
                        }
                        for ( char [ ] sr : S ) {
                          char [ ] br = B [ y ] ;
                          for ( int s = 0 ;
                          s < br . length ;
                          s ++ ) {
                            char b = br [ s ] ;
                            if ( s != b ) {
                              System . out . println ( "impossible" ) ;
                              exit ( ) ;
                            }
                          }
                        }
                        System . out . println ( "possible" ) ;
                        for ( char [ ] row : A ) {
                          System . out . print ( ( String ) row ) ;
                        }
                      }
                      