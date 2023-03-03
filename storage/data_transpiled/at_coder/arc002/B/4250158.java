public static void main ( String [ ] s ) {
  int [ ] y = {
    0 , 31 , 28 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31 }
    ;
    if ( ( s [ 0 ] % 4 == 0 && s [ 0 ] % 100 != 0 ) || ( s [ 0 ] % 400 == 0 ) ) {
      y [ 2 ] ++ ;
    }
    while ( true ) {
      if ( s [ 1 ] == 1 && s [ 2 ] == 1 ) break ;
      if ( s [ 0 ] % ( s [ 1 ] * s [ 2 ] ) == 0 ) break ;
      s [ 2 ] ++ ;
      if ( s [ 2 ] > y [ s [ 1 ] ] ) {
        s [ 1 ] = 1 ;
        if ( s [ 1 ] == 1 ) s [ 0 ] ++ ;
      }
    }
  }
  