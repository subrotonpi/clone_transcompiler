static final int [ ] [ ] map ( ) {
  final int [ ] [ ] map_ = new int [ 8 ] [ 8 ] ;
  for ( int i = 0 ;
  i < 8 ;
  i ++ ) {
    map_ [ i ] = new int [ 8 ] ;
  }
  /* Check for y */
  for ( int i = 1 ;
  i < 8 ;
  i ++ ) {
    int [ ] y1 = {
      y , y , y - i , y - i , y + i , y + i , y + i }
      ;
      int [ ] x1 = {
        x - i , x + i , x - i , x , x + i , x - i , x , x + i }
        ;
        for ( int Y = 0 ;
        Y < y1 . length ;
        Y ++ ) {
          int X = y1 [ y ] ;
          if ( 0 <= Y && Y <= 7 && 0 <= X && map_ [ Y ] [ X ] == "Q" ) {
            return 0 ;
          }
        }
      }
      /* dfs */
      if ( n == 0 ) {
        for ( int [ ] m : map_ ) {
          System . out . println ( Arrays . toString ( m ) ) ;
        }
        System . exit ( 0 ) ;
      }
      /* dfs */
      return map_ ;
    }
    