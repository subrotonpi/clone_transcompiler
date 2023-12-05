public static String [ ] [ ] getHW ( int H , int W ) {
  int [ ] [ ] L = new int [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) L [ i ] = new int [ W ] ;
  boolean [ ] [ ] treated = new boolean [ H ] [ W ] ;
  String [ ] ans = new String [ W ] ;
  for ( int w = 0 ;
  w < W ;
  w ++ ) ans [ w ] = new String [ W ] ;
  for ( int h = 0 ;
  h < H ;
  h ++ ) ans [ w ] [ h ] = "." ;
  int [ ] [ ] dxy = {
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
                  for ( int y = 0 ;
                  y < H ;
                  y ++ ) for ( int x = 0 ;
                  x < W ;
                  x ++ ) {
                    int cnt = 0 ;
                    for ( int dy = 0 ;
                    dy < H ;
                    dy ++ ) {
                      int dx = dxy [ dy ] [ x ] ;
                      int ny = y + dy ;
                      int nx = x + dx ;
                      if ( ( ny < 0 ) || ( nx < 0 ) || ( ny >= H ) || ( nx >= W ) ) {
                        cnt ++ ;
                        continue ;
                      }
                      if ( L [ ny ] [ nx ] == "." ) break ;
                      cnt ++ ;
                    }
                    if ( cnt == 8 ) {
                      if ( L [ y ] [ x ] == "." ) continue ;
                      treated [ y ] [ x ] = true ;
                      ans [ y ] [ x ] = "#" ;
                      for ( int dy = 0 ;
                      dy < H ;
                      dy ++ ) {
                        int dx = dxy [ dy ] [ x ] ;
                        int ny = y + dy ;
                        int nx = x + dx ;
                        if ( ( ny < 0 ) || ( nx < 0 ) || ( ny >= H ) || ( nx >= W ) ) continue ;
                        treated [ ny ] [ nx ] = true ;
                      }
                    }
                  }
                  for ( int y = 0 ;
                  y < H ;
                  y ++ ) for ( int x = 0 ;
                  x < W ;
                  x ++ ) if ( L [ y ] [ x ] == "." ) treated [ y ] [ x ] = true ;
                  for ( int