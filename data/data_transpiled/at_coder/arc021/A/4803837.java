public static String ans ( ) {
  int [ ] [ ] board = new int [ 4 ] [ 4 ] ;
  for ( int i = 0 ;
  i < board . length ;
  i ++ ) board [ i ] = Integer . parseInt ( input ( ) . nextLine ( ) ) ;
  Point [ ] pattarn = {
    new Point ( 1 , 0 ) , new Point ( - 1 , 0 ) , new Point ( 0 , 1 ) , new Point ( 0 , - 1 ) }
    ;
    for ( int i = 0 ;
    i < 4 ;
    i ++ ) {
      for ( int j = 0 ;
      j < 4 ;
      j ++ ) {
        for ( int x = 0 ;
        x < pattarn . length ;
        x ++ ) {
          int y = pattarn [ x ] . y ;
          try {
            if ( i + y < 0 || j + x < 0 ) {
            }
            else if ( board [ i + y ] [ j + x ] == board [ i ] [ j ] ) {
              return "CONTINUE" ;
            }
          }
          catch ( Exception e ) {
          }
        }
      }
    }
    return "GAMEOVER" ;
  }
  