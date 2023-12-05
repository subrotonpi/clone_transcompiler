public static int [ ] input ( ) {
  int [ ] s = input ( ) ;
  int [ ] c = {
    0 , 0 }
    ;
    int [ ] d = new int [ s . length ] ;
    int b = 0 ;
    for ( int i = s . length - 1 ;
    i >= 0 ;
    i -- ) {
      if ( s [ i ] == 'M' ) {
        d [ b ] ++ ;
      }
      else {
      }
    }
    return d ;
  }
  