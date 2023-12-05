public static String solve ( ) {
  boolean won = new Boolean ( false ) ;
  char [ ] [ ] board = new char [ xrange ( 4 ) ] [ xrange ( 4 ) ] ;
  for ( int x = 0 ;
  x < xrange ( 4 ) ;
  x ++ ) board [ x ] [ x ] = scanner . nextString ( ) ;
  int [ ] dxa = {
    0 , + 1 , 0 , - 1 , + 1 , + 1 , - 1 , - 1 }
    ;
    int [ ] dya = {
      + 1 , 0 , - 1 , 0 , + 1 , - 1 , + 1 , - 1 }
      ;
      boolean can = false ;
      for ( int i = 0 ;
      i < xrange ( 8 ) ;
      i ++ ) {
        int dx = dxa [ i ] ;
        int dy = dya [ i ] ;
        for ( int sx = 0 ;
        sx < xrange ( 4 ) ;
        sx ++ ) {
          for ( int sy = 0 ;
          sy < xrange ( 4 ) ;
          sy ++ ) {
            for ( char sym = 'X' ;
            sym < 'O' ;
            sym ++ ) {
              int x = sx ;
              int y = sy ;
              int cur = 0 ;
              while ( x >= 0 && y >= 0 && x < 4 && y < 4 ) {
                if ( board [ x ] [ y ] == sym || board [ x ] [ y ] == 'T' ) {
                  cur ++ ;
                  if ( cur == 4 ) won . putBoolean ( sym , true ) ;
                  else cur = 0 ;
                  x += dx ;
                  y += dy ;
                }
              }
            }
          }
        }
      }
      for ( int i = 0 ;
      i < board . length ;
      i ++ ) {
        for ( char j = 0 ;
        j < board [ i ] . length ;
        j ++ ) if ( board [ i ] [ j ] == '.' ) can = true ;
      }
      if ( won . putBoolean ( 'X' , true ) && ! won . putBoolean ( 'O' , true ) ) return "X won" ;
      if ( won . putBoolean ( 'O' , true ) && ! won . putBoolean ( 'X' , true ) ) return "O won" ;
      if ( won . putBoolean ( 'X' , true ) && won . putBoolean ( 'O' , true ) || ! can ) return "Draw" ;
      return "Game has not completed" ;
    }
    