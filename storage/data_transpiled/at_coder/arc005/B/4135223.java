public static int x , int y , String w ) {
  x = input . nextInt ( ) - 1 ;
  y = input . nextInt ( ) - 1 ;
  int [ ] d = {
    w . contains ( "R" ) ? - ( w . contains ( "L" ) ? 1 : 0 ) , w . contains ( "D" ) ? - ( w . contains ( "U" ) ? 1 : 0 ) }
    ;
    int [ ] [ ] m = new int [ 9 ] [ 9 ] ;
    for ( int i = 0 ;
    i < 9 ;
    i ++ ) {
      m [ i ] = input . nextInt ( ) ;
    }
    int a = m [ y ] [ x ] ;
    for ( int i = 0 ;
    i < 3 ;
    i ++ ) {
      x = x + d [ 0 ] ;
      y = y + d [ 1 ] ;
      if ( x < 0 ) {
        d [ 0 ] = 1 ;
        x = 1 ;
      }
      else if ( x > 8 ) {
        d [ 0 ] = - 1 ;
        x = 7 ;
      }
      if ( y < 0 ) {
        d [ 1 ] = 1 ;
        y = 1 ;
      }
      else if ( y > 8 ) {
        d [ 1 ] = - 1 ;
        y = 7 ;
      }
      a += m [ y ] [ x ] ;
    }
    System . out . println ( a ) ;
    return a ;
  }
  