public static int [ ] [ ] [ ] createOutOp ( ) {
  int H = ( int ) input . nextInt ( ) ;
  int W = ( int ) input . nextInt ( ) ;
  int [ ] [ ] aMat = new int [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    aMat [ i ] = new int [ W ] ;
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      aMat [ i ] [ j ] = Integer . parseInt ( input . next ( ) ) ;
    }
  }
  ArrayList < Integer > outOp = new ArrayList < Integer > ( ) ;
  for ( int h = 0 ;
  h < H ;
  h ++ ) {
    for ( int w = 0 ;
    w < W ;
    w ++ ) {
      int wd ;
      int [ ] nextPos ;
      if ( h % 2 == 0 ) {
        wd = w ;
        if ( w == W - 1 ) nextPos = new int [ ] {
          h + 1 , wd }
          ;
          else nextPos = new int [ ] {
            h , wd + 1 }
            ;
          }
          else {
            wd = W - 1 - w ;
            if ( w == W - 1 ) nextPos = new int [ ] {
              h + 1 , wd }
              ;
              else nextPos = new int [ ] {
                h , wd - 1 }
                ;
              }
              if ( h == H - 1 && w == W - 1 ) break ;
              if ( aMat [ h ] [ wd ] % 2 == 1 ) {
                aMat [ nextPos [ 0 ] ] [ nextPos [ 1 ] ] ++ ;
                outOp . add ( new Integer [ ] [ ] {
                  h , wd , nextPos [ 0 ] , nextPos [ 1 ] }
                  ) ;
                }
              }
            }
            System . out . println ( outOp . size ( ) ) ;
            for ( int y = 0 ;
            y < outOp . size ( ) ;
            y ++ ) {
              int x = outOp . get ( y ) ;
              int yn = outOp . get ( x ) ;
              int xn = outOp . get ( y + 1 ) ;
              System . out . println ( y + 1 + " " + x + " " + yn + " " + xn + " " + xn ) ;
            }
            return outOp . toArray ( ) ;
          }
          