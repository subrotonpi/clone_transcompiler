{
  return new int [ ] [ ] {
    {
      0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 }
      , {
        0 , 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 }
        , {
          0 , 2 , 5 , 4 , 7 , 6 , 1 , 8 , 3 }
          , {
            0 , 3 , 8 , 5 , 2 , 7 , 4 , 1 , 6 }
            , {
              0 , 4 , 3 , 6 , 5 , 8 , 7 , 2 , 1 }
              , {
                0 , 5 , 6 , 7 , 8 , 1 , 2 , 3 , 4 }
                , {
                  0 , 6 , 1 , 8 , 3 , 2 , 5 , 4 , 7 }
                  , {
                    0 , 7 , 4 , 1 , 6 , 3 , 8 , 5 , 2 }
                    , {
                      0 , 8 , 7 , 2 , 1 , 4 , 3 , 6 , 5 }
                      , }
                      ;
                      String elements = "01ijk" ;
                      int T = Integer . parseInt ( scanner . nextLine ( ) ) ;
                      for ( int x = xrange ( 1 , T + 1 ) ;
                      x <= T ;
                      x ++ ) {
                        int L = Integer . parseInt ( scanner . nextLine ( ) ) ;
                        int X = Integer . parseInt ( scanner . nextLine ( ) ) ;
                        String string = scanner . nextLine ( ) ;
                        int [ ] reduced = new int [ L + 1 ] ;
                        reduced [ 0 ] = 1 ;
                        for ( int i = 0 ;
                        i < string . length ( ) ;
                        i ++ ) {
                          reduced [ i + 1 ] = mult [ reduced [ i ] ] [ elements . indexOf ( string . charAt ( i ) ) ] ;
                        }
                        int p = reduced [ reduced . length - 1 ] ;
                        String y = "NO" ;
                        int c = 1 ;
                        for ( int i = xrange ( X % 8 ) ;
                        i < X ;
                        i ++ ) {
                          c = mult [ c ] [ p ++ ] ;
                        }
                        if ( c == 5 ) {
                          int r = 0 ;
                          c = 1 ;
                          for ( int i = xrange ( Math . min ( 8 , X ) ) ;
                          i < X ;
                          i ++ ) {
                            for ( int j = xrange ( L ) ;
                            j < L ;
                            j ++ ) {
                              if ( mult [ c ] [ reduced [ j + 1 ] ] == 2 ) {
                                break ;
                              }
                            }
                            else {
                              c = mult [ c ] [ p ++ ] ;
                              continue ;
                            }
                            for ( int j1 = xrange ( j + 1 , L ) ;
                            j1 <