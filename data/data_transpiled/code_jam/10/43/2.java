static final Scanner rl = new Scanner ( System . in ) {
  private int next ;
  private int seconds ;
  private int [ ] [ ] nextboard ;
  {
    int minx = board [ 0 ] . length ;
    int maxx = 0 ;
    int miny = board . length ;
    int maxy = 0 ;
    for ( int y = 0 ;
    y < board . length ;
    y ++ ) {
      for ( int x = 0 ;
      x < board [ y ] . length ;
      x ++ ) {
        if ( board [ y ] [ x ] != 0 ) {
          minx = Math . min ( minx , x ) ;
          miny = Math . min ( miny , y ) ;
          maxx = Math . max ( maxx , x ) ;
          maxy = Math . max ( maxy , y ) ;
        }
      }
    }
    return new int [ ] [ ] {
      {
        minx , maxx + 1 }
        , {
          miny , maxy + 1 }
        }
        ;
      }
      private void generate ( int [ ] [ ] board ) {
        int h = board . length ;
        int w = board [ 0 ] . length ;
        int [ ] [ ] next = new int [ h + 1 ] [ w + 1 ] ;
        boolean lives = false ;
        for ( int i = 0 ;
        i < h + 1 ;
        i ++ ) {
          for ( int j = 0 ;
          j < w + 1 ;
          j ++ ) {
            if ( i < h && j < w && board [ i ] [ j ] == 1 ) {
              if ( ( ( i == 0 || board [ i - 1 ] [ j ] == 0 ) && ( j == 0 || board [ i ] [ j - 1 ] == 0 ) ) ) {
                // do nothing
              }
              else {
                next [ i ] [ j ] = 1 ;
                lives = true ;
              }
            }
            else {
              if ( ( i > 0 && j < w && board [ i - 1 ] [ j ] == 1 ) && ( j > 0 && i < h && board [ i ] [ j - 1 ] == 1 ) ) {
                next [ i ] [ j ] = 1 ;
                lives = true ;
              }
            }
          }
        }
        System . out . println ( "Case #" + ( cc + 1 ) + ": " + seconds ) ;
      }
    }
    