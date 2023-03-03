public static void pm ( String [ ] [ ] l , boolean tf ) {
  if ( tf ) {
    Stream < String [ ] > ln = Stream . of ( l ) ;
    for ( String [ ] li : ln ) {
      System . out . println ( Arrays . toString ( li ) ) ;
    }
  }
  {
    int t = Integer . parseInt ( readLine ( ) ) ;
    for ( int ti = 0 ;
    ti < t ;
    ti ++ ) {
      System . out . println ( "Case #" + ( ti + 1 ) + ":" ) ;
      int r = Integer . parseInt ( readLine ( ) ) ;
      int c = Integer . parseInt ( readLine ( ) ) ;
      int m1 = Integer . parseInt ( readLine ( ) ) ;
      int m = r * c - m1 ;
      if ( r > c ) {
        r = c ;
        c = r ;
        tf = 1 ;
      }
      else tf = 0 ;
      switch ( r ) {
        case 1 : l = new String [ ] [ ] {
          new String [ ] {
            "c" }
            , new String [ ] {
              "." }
              , new String [ ] {
                "*" }
                , new String [ ] {
                  "*" }
                }
                ;
                pm ( l , tf ) ;
                break ;
                case 2 : switch ( m ) {
                  case 1 : l = new String [ ] [ ] {
                    new String [ ] {
                      "c" }
                      , new String [ ] {
                        "*" }
                        , new String [ ] {
                          "*" }
                          , new String [ ] {
                            "*" }
                            , new String [ ] {
                              "*" }
                              , new String [ ] {
                                "*" }
                              }
                              ;
                              pm ( l , tf ) ;
                              break ;
                              case 1 : l = new String [ ] [ ] {
                                new String [ ] {
                                  "c" }
                                  , new String [ ] {
                                    "." }
                                    , new String [ ] {
                                      "*" }
                                      , new String [ ] {
                                        "*" }
                                        , new String [ ] {
                                          "*" }
                                          , new String [ ] {
                                            "*" }
                                            , new String [ ] {
                                              "*" }
                                              , new String [ ] {
                                                "*" }
                                                , new String [ ] {
                                                  "*" }
                                                  , new String [ ] {
                                                    "*" }
                                                    , new String [ ] {
                                                      "*" }
                                                      , new String [ ] {
                                                        "*" }
                                                        , new String [ ] {
                                                          "*" }
                                                          , new String [ ] {
                                                            "*" }
                                                            , new String [ ] {
                                                              "*" }
                                                            }
                                                            ] ;
                                                            break ;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    