static final int [ ] [ ] solve ( int [ ] A ) {
  int LEFT = A . length - 4 , TOP = A [ 0 ] . length - 4 , RIGHT = A [ 1 ] . length - 4 , BOT = A [ 2 ] . length - 4 ;
  int [ ] [ ] dest = {
    {
      0 , - 1 }
      , {
        - 1 , 0 }
        , {
          0 , 1 }
          , {
            1 , 0 }
          }
          ;
          int [ ] [ ] dest = {
            {
              0 , - 1 }
              , {
                - 1 , 0 }
                , {
                  - 1 , 0 }
                  , {
                    1 , 0 }
                  }
                  ;
                  int [ ] [ ] ret ;
                  if ( getClass ( ) . getName ( ) . equals ( "java.util.Arrays" ) ) {
                    main ( ) ;
                  }
                  v -= C ;
                  if ( v < R ) {
                    return new int [ ] [ ] {
                      v , C - 1 , RIGHT }
                      ;
                    }
                    v -= R ;
                    if ( v < C ) {
                      return new int [ ] [ ] {
                        R - 1 , C - v - 1 , BOT }
                        ;
                      }
                      v -= C ;
                      return new int [ ] [ ] {
                        R - v - 1 , 0 , LEFT }
                        ;
                      }
                      