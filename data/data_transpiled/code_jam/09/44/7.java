@ GwtIncompatible ( "java.util.Vector" ) private static int [ ] [ ] getStrings ( ) {
  final int [ ] [ ] strings = new int [ ] [ ] {
    {
      5 }
      , {
        3 }
        , {
          20 }
          , {
            20 }
            , {
              20 }
              , {
                20 }
                , {
                  20 }
                  , {
                    20 }
                    , {
                      20 }
                      , {
                        30 }
                      }
                      , {
                        {
                          20 }
                          , {
                            30 }
                          }
                          , {
                            {
                              20 }
                              , {
                                30 }
                              }
                              , {
                                {
                                  20 }
                                }
                                , {
                                  {
                                    20 }
                                    , {
                                      30 }
                                    }
                                    , {
                                      {
                                        20 }
                                      }
                                      , {
                                        {
                                          20 }
                                          , {
                                            20 }
                                          }
                                          , {
                                            {
                                              20 }
                                              , {
                                                30 }
                                              }
                                              , {
                                                {
                                                  20 }
                                                }
                                                , {
                                                  {
                                                    20 }
                                                  }
                                                  , {
                                                    {
                                                      20 }
                                                    }
                                                    , {
                                                      {
                                                        20 }
                                                      }
                                                      , {
                                                        {
                                                          20 }
                                                        }
                                                        , {
                                                          {
                                                            20 }
                                                          }
                                                          , {
                                                            {
                                                              20 }
                                                            }
                                                            , {
                                                              {
                                                                20 }
                                                              }
                                                              , {
                                                                {
                                                                  20 }
                                                                }
                                                                , {
                                                                  {
                                                                    20 }
                                                                  }
                                                                  , {
                                                                    {
                                                                      20 }
                                                                    }
                                                                    , {
                                                                      {
                                                                        20 }
                                                                      }
                                                                      , {
                                                                        {
                                                                          20 }
                                                                        }
                                                                        , {
                                                                          {
                                                                            20 }
                                                                          }
                                                                          , {
                                                                            {
                                                                              20 }
                                                                            }
                                                                            , {
                                                                              {
                                                                                20 }
                                                                              }
                                                                              , {
                                                                                {
                                                                                  20 }
                                                                                }
                                                                                , {
                                                                                  {
                                                                                    20 }
                                                                                  }
                                                                                  , {
                                                                                    {
                                                                                      20 }
                                                                                    }
                                                                                    , {
                                                                                      {
                                                                                        20 }
                                                                                      }
                                                                                      , {
                                                                                        {
                                                                                          20 }
                                                                                        }
                                                                                        , {
                                                                                          {
                                                                                            20 }
                                                                                          }
                                                                                          , {
                                                                                            {
                                                                                              20 }
                                                                                            }
                                                                                            , {
                                                                                              {
                                                                                                20 }
                                                                                              }
                                                                                              , {
                                                                                                {
                                                                                                  20 }
                                                                                                }
                                                                                              }
                                                                                              ;
                                                                                              final int [ ] [ ] plants = new int [ ] [ ] {
                                                                                                {
                                                                                                  2 }
                                                                                                  ;
                                                                                                  final int [ ] [ ] plants = new int [ ] [ ] {
                                                                                                    {
                                                                                                      3 }
                                                                                                      ;
                                                                                                      final int t = Integer . parseInt ( strings [ 0 ] [ 0 ] ) ;
                                                                                                      for ( int xm1 = 0 ;
                                                                                                      xm1 < t ;
                                                                                                      xm1 ++ ) {
                                                                                                        final int n = Integer . parseInt ( strings [ 1 ] [ 0 ] ) ;
                                                                                                        plants [ 0 ] = new int [ n ] ;
                                                                                                        for ( int i = 0 ;
                                                                                                        i < n ;
                                                                                                        i ++ ) {
                                                                                                          plants [ i ] [ 0 ] = Integer . parseInt ( strings [ 1 ] [ 0 ] ) ;
                                                                                                        }
                                                                                                        final int guess = process2 ( plants ) ;
                                                                                                        out . printf ( "Case #%d: %.6f\n" , xm1 + 1 , guess ) ;
                                                                                                        out . flush ( ) ;
                                                                                                        if ( out instanceof PrintStream ) {
                                                                                                          System . out . println ( out . toString ( ) ) ;
                                                                                                          return strings ;
                                                                                                        }
                                                                                                        