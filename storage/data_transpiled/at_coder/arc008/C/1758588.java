@ VisibleForTesting static void main ( String [ ] args ) {
  final int N = Integer . parseInt ( args [ 0 ] ) ;
  System . setProperty ( "java.awt.headless" , "true" ) ;
  final double [ ] dy = {
    0 , - 1 , 0 , 1 }
    ;
    final double [ ] dx = {
      1 , 0 , - 1 , 0 }
      ;
      final int [ ] [ ] dist = {
        {
          0 , 0 , 0 , 0 }
          , {
            0 , 0 , 0 }
            , {
              0 , 0 , 0 , 0 }
              , {
                0 , 0 , 0 , 0 }
                , {
                  0 , 0 , 0 , 0 }
                  , {
                    0 , 0 , 0 , 0 }
                    , {
                      0 , 0 , 0 , 0 }
                      , {
                        0 , 0 , 0 , 0 }
                        , {
                          0 , 0 , 0 , 0 }
                          , {
                            0 , 0 , 0 , 0 }
                            , {
                              0 , 0 , 0 , 0 }
                              , {
                                0 , 0 , 0 , 0 }
                                , {
                                  0 , 0 , 0 , 0 }
                                  , {
                                    0 , 0 , 0 , 0 }
                                    , {
                                      0 , 0 , 0 , 0 }
                                      , {
                                        0 , 0 , 0 , 0 }
                                        , {
                                          0 , 0 , 0 , 0 }
                                          , {
                                            0 , 0 , 0 , 0 }
                                            , {
                                              0 , 0 , 0 , 0 }
                                              , {
                                                0 , 0 , 0 , 0 }
                                                , {
                                                  0 , 0 , 0 , 0 }
                                                  , {
                                                    0 , 0 , 0 , 0 }
                                                    , {
                                                      0 , 0 , 0 , 0 }
                                                      , {
                                                        0 , 0 , 0 , 0 }
                                                        , {
                                                          0 , 0 , 0 , 0 }
                                                          , {
                                                            0 , 0 , 0 , 0 }
                                                            , {
                                                              0 , 0 , 0 , 0 }
                                                              , {
                                                                0 , 0 , 0 , 0 }
                                                                , {
                                                                  0 , 0 , 0 , 0 }
                                                                  , {
                                                                    0 , 0 , 0 , 0 }
                                                                    , {
                                                                      0 , 0 , 0 , 0 }
                                                                      , {
                                                                        0 , 0 , 0 , 0 }
                                                                        , {
                                                                          0 , 0 , 0 , 0 }
                                                                          , {
                                                                            0 , 0 , 0 , 0 }
                                                                            , {
                                                                              0 , 0 , 0 , 0 }
                                                                              , {
                                                                                0 , 0 , 0 , 0 }
                                                                                , {
                                                                                  0 , 0 , 0 , 0 }
                                                                                  , {
                                                                                    0 , 0 , 0 , 0 }
                                                                                    , {
                                                                                      0 , 0 , 0 , 0 }
                                                                                      , {
                                                                                        0 , 0 , 0 , 0 }
                                                                                        , {
                                                                                          0 , 0 , 0 , 0 }
                                                                                          , {
                                                                                            0 , 0 , 0 , 0 }
                                                                                            , {
                                                                                              0 , 0 ,