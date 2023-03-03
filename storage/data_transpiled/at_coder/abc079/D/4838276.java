public static int [ ] [ ] parse ( String input ) {
  int h = Integer . parseInt ( input ) ;
  int w = Integer . parseInt ( input ) ;
  int [ ] [ ] c = new int [ 10 ] [ 10 ] ;
  int [ ] [ ] a = new int [ h ] [ w ] ;
  for ( int y = 0 ;
  y < 10 ;
  y ++ ) {
    int [ ] cx = new int [ 10 ] ;
    for ( int z = 0 ;
    z < 10 ;
    z ++ ) {
      cx [ y ] = Integer . parseInt ( input ) ;
      c [ y ] = cx ;
    }
  }
  for ( int z = 0 ;
  z < 10 ;
  z ++ ) {
    for ( int y = 0 ;
    y < 10 ;
    y ++ ) {
      for ( int x = 0 ;
      x < 10 ;
      x ++ ) {
        if ( c [ y ] [ x ] > c [ y ] [ z ] + c [ z ] [ x ] ) {
          c [ y ] [ x ] = c [ y ] [ z ] + c [ z ] [ x ] ;
        }
      }
    }
  }
  for ( int y = 0 ;
  y < h ;
  y ++ ) {
    int [ ] ax = new int [ w ] ;
    for ( int x = 0 ;
    x < w ;
    x ++ ) {
      ax [ y ] = Integer . parseInt ( input ) ;
      a [ y ] [ x ] = ax ;
    }
  }
  int e = 0 ;
  for ( int y = 0 ;
  y < h ;
  y ++ ) {
    for ( int x = 0 ;
    x < w ;
    x ++ ) {
      if ( a [ y ] [ x ] != - 1 && a [ y ] [ x ] != 1 ) {
        int i = a [ y ] [ x ] ;
        e += c [ i ] [ 1 ] ;
      }
    }
  }
  System . out . println ( e ) ;
  return c ;
}
