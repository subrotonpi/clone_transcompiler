static final String print ( ) {
  int inf = 10 * 20 ;
  int mod = 10 * 9 + 7 ;
  /* LI */
  int [ ] [ ] li = {
    Integer . parseInt ( li [ 0 ] ) , Integer . parseInt ( li [ 1 ] ) , Integer . parseInt ( li [ 2 ] ) , Integer . parseInt ( li [ 3 ] ) }
    ;
    /* LI_ */
    int [ ] [ ] li = {
      Integer . parseInt ( li [ 0 ] ) , Integer . parseInt ( li [ 1 ] ) - 1 , Integer . parseInt ( li [ 2 ] ) }
      ;
      /* LF */
      float [ ] [ ] lf = {
        Float . parseFloat ( li [ 3 ] ) , Float . parseFloat ( li [ 4 ] ) }
        ;
        /* LS */
        int [ ] [ ] ls = {
          Float . parseFloat ( li [ 5 ] ) , Float . parseFloat ( li [ 6 ] ) , Float . parseFloat ( li [ 7 ] ) }
          ;
          /* I */
          int [ ] [ ] i = {
            Integer . parseInt ( li [ 0 ] ) , Integer . parseInt ( li [ 1 ] ) , Float . parseFloat ( li [ 2 ] ) }
            ;
            /* F */
            float [ ] [ ] s = {
              Float . parseFloat ( li [ 1 ] ) , Float . parseFloat ( li [ 2 ] ) , Float . parseFloat ( li [ 3 ] ) }
              ;
              /* S */
              int H = li [ 0 ] [ 0 ] ;
              int W = li [ 1 ] [ 1 ] ;
              boolean f = false ;
              if ( H % h == 0 && W % w == 0 ) {
                return "No" ;
              }
              if ( W % w == 0 ) {
                H = W ;
                W = h ;
                h = w ;
                w = h ;
                f = true ;
              }
              int p = 10 * 6 * ( w - 1 ) - 1 ;
              int m = - ( 10 * 6 ) ;
              int [ ] [ ] a = new int [ H ] [ W ] ;
              for ( int i = 0 ;
              i < W ;
              i ++ ) {
                if ( i % w == 0 ) {
                  a [ i ] [ p ] = p ;
                }
                else {
                  a [ i ] [ m ] = m ;
                }
              }
              int [ ] [ ] aa = new int [ H ] [ W ] ;
              for ( int i = 0 ;
              i < H ;
              i ++ ) {
                a [ i ] [ j ] = a [ i ] ;
              }
              return "