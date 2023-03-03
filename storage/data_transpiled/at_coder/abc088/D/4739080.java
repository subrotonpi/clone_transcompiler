@ VisibleForTesting static int bfs ( int gh , int gw ) {
  int H = Integer . parseInt ( input ( ) ) ;
  int W = Integer . parseInt ( input ( ) ) ;
  char [ ] [ ] s = new char [ W + 2 ] [ ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    s [ i ] [ i ] = '#' ;
  }
  int black = 0 ;
  for ( int h = 0 ;
  h < H ;
  h ++ ) {
    char [ ] S = input . toCharArray ( ) ;
    for ( int w = 0 ;
    w < W ;
    w ++ ) {
      s [ h + 1 ] [ w + 1 ] = S [ w ] ;
      if ( S [ w ] == '#' ) {
        black ++ ;
      }
    }
  }
  int [ ] [ ] dxy = {
    new int [ ] [ ] {
      {
        1 , 0 }
        , new int [ ] {
          0 , 1 }
          , new int [ ] {
            - 1 , 0 }
            , new int [ ] {
              0 , - 1 }
            }
            ;
            /* bfs */
            Stack < Integer > st = new Stack < Integer > ( ) ;
            Stack < Integer > sts = new Stack < Integer > ( ) ;
            Method push = st . push , pop = st . pop ;
            Method pushs = sts . push , pops = sts . pop ;
            int cnt = 1 ;
            push . invoke ( new Object [ ] {
              - 1 , - 1 }
              ) ;
              pushs . invoke ( new Object [ ] {
                - 1 , - 1 }
                ) ;
                push . invoke ( new Object [ ] {
                  1 , 1 }
                  ) ;
                  int g = 0 ;
                  while ( g < 1 ) {
                    int t = 0 ;
                    for ( int i = 0 ;
                    i < 999999 ;
                    i ++ ) {
                      int [ ] now = pop . invoke ( ) ;
                      if ( now == new int [ ] {
                        - 1 , - 1 }
                        ) {
                          push . invoke ( new Object [ ] {
                            - 1 , - 1 }
                            ) ;
                            break ;
                          }
                          pushs . invoke ( new Object [ ] {
                            now }
                            ) ;
                          }
                          cnt ++ ;
                          int c = 0 ;
                          while ( t < 1 ) {
                            int [ ] now = pops . invoke ( ) ;
                            if ( now == new int [ ] {
                              - 1 , - 1 }
                              ) {
                                if ( c == 0 ) {
                                  return - 1 ;
                                }
                                break ;
                              }
                              pushs . invoke ( new Object [ ] {
                                now }
                                ) ;
                                t = 1 ;
                                break ;
                                