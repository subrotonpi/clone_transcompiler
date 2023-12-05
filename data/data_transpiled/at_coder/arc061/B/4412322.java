static Function f = new Function ( ) {
  int [ ] [ ] ints = input . getIntegerArrays ( ) . toArray ( new int [ 0 ] [ ] ) ;
  int h = input . length ;
  int w = input . length ;
  int n = input [ 0 ] . length ;
  int [ ] c = new int [ 9 ] ;
  Map < Point , Integer > map = new HashMap < > ( ) ;
  while ( n -- > 0 ) {
    int x = input [ 0 ] [ 0 ] ;
    int y = input [ 0 ] [ 1 ] ;
    for ( int i = 0 ;
    i < 9 ;
    i ++ ) {
      Point a = new Point ( x + i % 3 , y + i / 3 ) ;
      if ( h >= a . x > 2 && w < a . y && a . x <= w ) t = map . put ( a , map . get ( a ) + 1 ) ;
      c [ t - 1 ] -- ;
      c [ t ] ++ ;
    }
  }
  return ( int [ ] ) c ;
}
