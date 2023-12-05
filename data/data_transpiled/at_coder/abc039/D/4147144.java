@ VisibleForTesting static boolean f ( int sx , int sy ) {
  int [ ] xs ;
  int [ ] ys ;
  int H , W ;
  int [ ] T ;
  int [ ] [ ] S ;
  int [ ] [ ] T ;
  int [ ] [ ] U ;
  {
    xs = {
      0 , 1 , 1 , 0 , - 1 , - 1 , - 1 , 0 , 1 }
      ;
      ys = {
        0 , 0 , 1 , 1 , 1 , 0 , - 1 , - 1 , - 1 }
        ;
        for ( int i = 0 ;
        i < xs . length ;
        i ++ ) {
          int dx = xs [ i ] [ 0 ] ;
          int dy = ys [ i ] [ 1 ] ;
          int tx = sx + dx ;
          int ty = sy + dy ;
          if ( tx < 0 || H - 1 < tx || ty < 0 || W - 1 < ty ) continue ;
          if ( S [ tx ] [ ty ] == '.' ) return false ;
        }
      }
      {
        int [ ] [ ] S ;
        int [ ] [ ] T ;
        int [ ] [ ] S = new int [ H ] [ W ] ;
        int [ ] [ ] T = new int [ W ] [ H ] ;
        int [ ] [ ] U = new int [ W ] [ W ] ;
        for ( int i = 0 ;
        i < H ;
        i ++ ) S [ i ] = new int [ ] {
          H }
          ;
          for ( int i = 0 ;
          i < W ;
          i ++ ) T [ i ] [ 0 ] = i ;
          for ( int i = 0 ;
          i < H ;
          i ++ ) U [ i ] [ 0 ] = i ;
          if ( S [ i ] != U [ i ] ) {
            System . out . println ( "impossible" ) ;
            exit ( ) ;
          }
          System . out . println ( "possible" ) ;
          for ( int i = 0 ;
          i < H ;
          i ++ ) System . out . println ( T [ i ] [ 0 ] ) ;
        }
      }
      