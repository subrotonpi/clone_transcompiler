static final String solve ( ) {
  final int [ ] cnt = new int [ 1024 ] ;
  for ( int x = 0 ;
  x < 1024 ;
  x ++ ) {
    int s = 0 ;
    for ( int b = 0 ;
    b < 10 ;
    b ++ ) {
      if ( ( x & ( 1 << b ) ) != 0 ) s ++ ;
    }
    cnt [ x ] = s ;
  }
  final int [ ] [ ] next = new int [ 1024 ] [ ] ;
  for ( int x = 0 ;
  x < next . length ;
  x ++ ) {
    final int [ ] nn = new int [ next [ x ] . length ] ;
    for ( int y = 0 ;
    y < next [ x ] . length ;
    y ++ ) {
      if ( ( ( x << 1 ) | ( x << 2 ) | ( x << 3 ) ) & ( y << 2 ) ) {
      }
      else {
        nn [ x ] [ y ] = y ;
      }
    }
    next [ x ] [ y ] = nn [ x ] ;
  }
  return String . format ( "Case #%d: %s" , ( test + 1 ) , cnt [ test ] , next [ test ] ) ;
}
