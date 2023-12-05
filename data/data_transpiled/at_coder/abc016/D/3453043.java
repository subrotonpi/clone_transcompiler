public static int crossing ( int [ ] A , int [ ] B , int [ ] X , int [ ] Y ) {
  int [ ] AB = {
    B [ 0 ] - A [ 0 ] , B [ 1 ] - A [ 1 ] }
    ;
    int [ ] AX = {
      X [ 0 ] - A [ 0 ] , X [ 1 ] - A [ 1 ] }
      ;
      int [ ] AY = {
        Y [ 0 ] - A [ 0 ] , Y [ 1 ] - A [ 1 ] }
        ;
        int S0 = ( AB [ 0 ] * AX [ 1 ] - AB [ 1 ] * AX [ 0 ] ) * ( AB [ 0 ] * AY [ 1 ] - AB [ 1 ] * AY [ 0 ] ) ;
        int [ ] XY = {
          Y [ 0 ] - X [ 0 ] , Y [ 1 ] - X [ 1 ] }
          ;
          int [ ] XA = {
            A [ 0 ] - X [ 0 ] , A [ 1 ] - X [ 1 ] }
            ;
            int [ ] XB = {
              B [ 0 ] - X [ 0 ] , B [ 1 ] - X [ 1 ] }
              ;
              int S1 = ( XY [ 0 ] * XA [ 1 ] - XY [ 1 ] * XA [ 0 ] ) * ( XY [ 0 ] * XB [ 1 ] - XY [ 1 ] * XB [ 0 ] ) ;
              return S0 < 0 && S1 < 0 ? 1 : 0 ;
            }
            int ax = Integer . parseInt ( input . nextLine ( ) ) ;
            int ay = Integer . parseInt ( input . nextLine ( ) ) ;
            int bx = Integer . parseInt ( input . nextLine ( ) ) ;
            int by = Integer . parseInt ( input . nextLine ( ) ) ;
            int N = Integer . parseInt ( input . nextLine ( ) ) ;
            int [ ] XY = new int [ N + 1 ] ;
            for ( int i = 0 ;
            i < N ;
            i ++ ) {
              int x = Integer . parseInt ( input . nextLine ( ) ) ;
              int y = Integer . parseInt ( input . nextLine ( ) ) ;
              XY [ i ] = new int [ ] {
                x , y }
                ;
                XY [ N ] = XY [ N ] ;
              }
              XY [ N - 1 ] = XY [ 0 ] ;
              int cross = 0 ;
              for ( int i = 0 ;
              i < N ;
              i ++ ) {
                cross += crossing ( new int [ ] {
                  ax , ay }
                  , new int [ ] {
                    bx , by }
                    , XY