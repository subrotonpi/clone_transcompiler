static int [ ] [ ] calc ( boolean [ ] a , int [ ] b ) throws IOException {
  int n = a . length ;
  int [ ] [ ] c = new int [ n + 1 ] [ n ] ;
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    if ( a [ i ] ) c [ i ] = c [ i * 2 + 1 ] & c [ i * 2 + 2 ] ;
    else c [ i ] = c [ i * 2 + 1 ] | c [ i * 2 + 2 ] ;
  }
  return c [ 0 ] ;
}
