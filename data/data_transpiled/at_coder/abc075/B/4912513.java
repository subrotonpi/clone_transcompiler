@ VisibleForTesting static void main ( Scanner input ) {
  int H = input . nextInt ( ) ;
  int W = input . nextInt ( ) ;
  int [ ] [ ] S = new int [ H ] [ W ] ;
  int [ ] [ ] dxy = {
    {
      1 , 0 }
      , {
        0 , 1 }
        , {
          0 , - 1 }
          , {
            - 1 , 0 }
            , {
              1 , 1 }
              , {
                1 , - 1 }
                , {
                  - 1 , 1 }
                  , {
                    - 1 , - 1 }
                  }
                  ;
                  for ( int i = 0 ;
                  i < H ;
                  i ++ ) S [ i ] = Collections . singletonList ( String . valueOf ( input . nextLine ( ) ) ) ;
                  for ( int i = 0 ;
                  i < H ;
                  i ++ ) for ( int j = 0 ;
                  j < W ;
                  j ++ ) if ( S [ i ] [ j ] == "." ) {
                    int cnt = 0 ;
                    for ( int [ ] d : dxy ) if ( ( 0 <= i + d [ 0 ] ) && ( 0 <= j + d [ 1 ] ) && ( S [ i + d [ 0 ] ] [ j + d [ 1 ] ] == "#" ) ) cnt ++ ;
                    S [ i ] [ j ] = cnt ;
                  }
                  for ( int i = 0 ;
                  i < H ;
                  i ++ ) for ( int j = 0 ;
                  j < W ;
                  j ++ ) System . out . print ( S [ i ] [ j ] + " " ) ;
                  System . out . println ( ) ;
                }
                