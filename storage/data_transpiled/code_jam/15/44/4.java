public static void main ( String input ) {
  for ( int x = 1 ;
  x <= Integer . parseInt ( input ) ;
  x ++ ) {
    int R = Integer . parseInt ( input . nextLine ( ) ) ;
    int C = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] [ ] table = new int [ R + 1 ] [ R + 1 ] ;
    table [ 0 ] = new int [ ] [ ] {
      {
        1 , 1 }
        , {
          0 , 0 }
          , {
            0 , 0 }
            , {
              0 , 0 }
            }
            ;
            for ( int i = 1 ;
            i <= R ;
            i ++ ) {
              table [ i ] = new int [ ] [ ] {
                {
                  0 , 0 }
                  , {
                    0 , 0 }
                    , {
                      0 , 0 }
                      , {
                        0 , 0 }
                      }
                      ;
                      for ( int i = 1 ;
                      i <= R ;
                      i ++ ) {
                        table [ i ] [ 0 ] [ 0 ] += table [ i - 2 ] [ 0 ] [ 1 ] ;
                        table [ i ] [ 1 ] [ 0 ] += table [ i - 2 ] [ 1 ] [ 1 ] ;
                        table [ i ] [ 2 ] [ 0 ] += table [ i - 2 ] [ 2 ] [ 1 ] ;
                        table [ i ] [ 3 ] [ 0 ] += table [ i - 2 ] [ 3 ] [ 1 ] ;
                        table [ i ] [ 4 ] [ 0 ] += table [ i - 2 ] [ 4 ] [ 1 ] ;
                      }
                    }
                    int y = Integer . parseInt ( input . nextLine ( ) ) % 1000000007 ;
                    System . out . println ( "Case #" + x + ":" + y ) ;
                  }
                }
                