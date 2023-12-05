public static void print ( String input ) {
  int H = ( int ) input . length ( ) ;
  int W = ( int ) input . charAt ( 0 ) ;
  char [ ] [ ] fig = new char [ W + 2 ] [ H + 2 ] ;
  char [ ] [ ] org = new char [ W + 2 ] [ H + 2 ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    int [ ] [ ] area = {
      {
        - 1 , - 1 }
        , {
          - 1 , 0 }
          , {
            - 1 , 1 }
            , {
              0 , - 1 }
              , {
                0 , 1 }
                , {
                  1 , - 1 }
                  , {
                    1 , 0 }
                    , {
                      1 , 1 }
                    }
                    ;
                    boolean pos = true ;
                    for ( int i = 0 ;
                    i < H ;
                    i ++ ) {
                      char [ ] S = new char [ input . charAt ( i ) ] ;
                      System . arraycopy ( input . toCharArray ( ) , 0 , fig [ i ] , 0 , S . length ) ;
                      fig [ i ] [ i ] = '#' ;
                    }
                    fig [ 0 ] [ 0 ] = '?' ;
                    for ( int i = 1 ;
                    i <= H ;
                    i ++ ) {
                      for ( int j = 1 ;
                      j <= W ;
                      j ++ ) {
                        if ( fig [ i ] [ j ] == '#' ) {
                          if ( Arrays . equals ( ( char [ ] ) area [ i + k [ 0 ] ] , ( char [ ] ) area [ j + k [ 1 ] ] ) ) {
                            org [ i ] [ j ] = '#' ;
                          }
                          else {
                            org [ i ] [ j ] = '?' ;
                          }
                        }
                      }
                    }
                    for ( int i = 1 ;
                    i <= H ;
                    i ++ ) {
                      for ( int j = 1 ;
                      j <= W ;
                      j ++ ) {
                        if ( org [ i ] [ j ] == '?' ) {
                          if ( Arrays . equals ( ( char [ ] ) org [ i + k [ 0 ] ] , ( char [ ] ) area [ j + k [ 1 ] ] ) ) {
                            pos = false ;
                            break ;
                          }
                          org [ i ] [ j ] = '.' ;
                        }
                      }
                      else {
                        continue ;
                      }
                      break ;
                    }
                    if ( pos ) {
                      System . out . println ( "possible" ) ;
                      for ( int i = 1 ;
                      i <= H ;
                      i ++ ) {
                        for ( int j = 1 ;
                        j <= W ;
                        j ++ ) {
                          System