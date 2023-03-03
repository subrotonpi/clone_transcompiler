public static void print ( String input ) {
  int h = Integer . parseInt ( input ) ;
  int w = Integer . parseInt ( input ) ;
  char [ ] [ ] amap = new char [ w + 2 ] [ ] ;
  amap [ 0 ] = '.' ;
  amap [ 1 ] = '.' ;
  amap [ 2 ] = '.' ;
  amap [ 3 ] = '.' ;
  amap [ 4 ] = '.' ;
  amap [ 5 ] = '.' ;
  int x = 1 , y = 1 ;
  boolean isOne = true ;
  while ( x != w || y != h ) {
    if ( x == 1 && y == 1 && amap [ y ] [ x ] != '#' ) break ;
    int c = 0 ;
    if ( amap [ y ] [ x + 1 ] == '#' ) c ++ ;
    if ( amap [ y ] [ x - 1 ] == '#' ) c ++ ;
    if ( amap [ y + 1 ] [ x ] == '#' ) c ++ ;
    if ( amap [ y - 1 ] [ x ] == '#' ) c ++ ;
    if ( c != 1 ) break ;
    else {
      amap [ y ] = amap [ y ] . toCharArray ( ) [ 0 ] + '.' + amap [ y ] . toCharArray ( ) [ x + 1 ] ;
      if ( amap [ y ] [ x + 1 ] == '#' ) x ++ ;
      else if ( amap [ y + 1 ] [ x ] == '#' ) y ++ ;
      else if ( amap [ y ] [ x - 1 ] == '#' ) break ;
      else if ( amap [ y - 1 ] [ x ] == '#' ) break ;
    }
  }
  if ( x == w || y == h ) {
    int c = 0 ;
    for ( char [ ] a : amap ) c += a . length ;
    if ( c == 1 ) System . out . println ( "Possible" ) ;
    else System . out . println ( "Impossible" ) ;
  }
  else System . out . println ( "Impossible" ) ;
}
