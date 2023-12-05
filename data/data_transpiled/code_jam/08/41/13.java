static final int [ ] [ ] G = new int [ ] [ ] {
  {
    0 , 0 }
    , {
      0 , 0 }
      , {
        0 , 0 , 0 }
        , {
          0 , 0 , 0 }
          , {
            0 , 0 , 0 }
            , {
              0 , 0 , 0 }
              , {
                0 , 0 , 0 }
                , {
                  0 , 0 , 0 }
                  , {
                    0 , 0 , 0 }
                    , {
                      0 , 0 , 0 }
                      , {
                        0 , 0 , 0 }
                        , {
                          0 , 0 , 0 }
                        }
                        , {
                          0 , 0 , 0 }
                          , {
                            0 , 0 , 0 }
                          }
                          ;
                          int [ ] [ ] tree = new int [ ] [ ] {
                            {
                              0 , 0 }
                              , {
                                0 , 0 }
                                , {
                                  0 , 0 }
                                }
                                ;
                                int [ ] [ ] tree = new int [ ] [ ] {
                                  {
                                    0 , 0 }
                                    , {
                                      0 , 0 }
                                    }
                                    ;
                                    for ( int nc : xrange ( 1 , N + 1 ) ) {
                                      ( tree [ nc ] [ 0 ] ) = createTree ( System . in ) ;
                                      int mc = minCh ( tree , 1 , V ) ;
                                      if ( mc < 1000000 ) {
                                        System . out . println ( "Case #" + nc + ": " + mc ) ;
                                      }
                                      else {
                                        System . out . println ( "Case #" + nc + ": IMPOSSIBLE" ) ;
                                      }
                                    }
                                    for ( int nc : xrange ( ( M + 1 ) / 2 ) ) {
                                      tree [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [ nc ] [