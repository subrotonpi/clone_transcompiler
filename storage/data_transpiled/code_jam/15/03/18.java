static boolean [ ] [ ] [ ] [ ] rules = {
  {
    new int [ ] {
      0 , true }
      , {
        1 , true }
        , {
          2 , true }
          , {
            3 , true }
          }
          , {
            {
              1 , true }
              , {
                0 , false }
                , {
                  3 , true }
                  , {
                    2 , false }
                  }
                  , {
                    {
                      2 , true }
                      , {
                        3 , false }
                        , {
                          0 , false }
                          , {
                            1 , true }
                          }
                          , {
                            {
                              3 , true }
                              , {
                                2 , true }
                                , {
                                  1 , false }
                                  , {
                                    0 , false }
                                  }
                                  , }
                                  ;
                                  boolean found = false ;
                                  System . out . println ( "Case #" + ( i + 1 ) + ": " + ( found ? "YES" : "NO" ) ) ;
                                  System . out . println ( "Case #" + ( i + 1 ) + ": " + ( found ? "YES" : "NO" ) ) ;
                                  System . out . println ( "Case #" + ( i + 1 ) + ": " + ( found ? "YES" : "NO" ) ) ;
                                  System . out . println ( "Case #" + ( i + 1 ) + ": " + ( found ? "YES" : "NO" ) ) ;
                                  int t = Integer . parseInt ( System . in . readLine ( ) ) ;
                                  for ( int i = 0 ;
                                  i < t ;
                                  i ++ ) {
                                    long l , x ;
                                    l = System . in . readLine ( ) ;
                                    x = Long . parseLong ( l ) ;
                                    x = Long . parseLong ( x ) ;
                                    if ( x > 13 ) x = ( x - 10 ) % 4 + 10 ;
                                    String s = System . in . readLine ( ) ;
                                    int [ ] [ ] ss = new int [ ss . length ] [ 2 ] ;
                                    for ( int j = 0 ;
                                    j < x ;
                                    j ++ ) {
                                      for ( int k = 0 ;
                                      k < s . length ( ) ;
                                      k ++ ) {
                                        switch ( s . charAt ( k ) ) {
                                          case 'i' : ss [ k ] = 1 ;
                                          break ;
                                          case 'j' : ss [ k ] = 2 ;
                                          break ;
                                          case 'k' : ss [ k ] = 3 ;
                                          break ;
                                        }
                                      }
                                    }
                                    int [ ] [ ] dyns = new int [ ss . length ] [ ] ;
                                    int [ ] [ ] dyne = new int [ ss . length ] [ ] ;
                                    for (