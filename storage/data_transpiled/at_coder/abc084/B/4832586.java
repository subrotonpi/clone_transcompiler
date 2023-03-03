static final int [ ] [ ] range ( int a , int b ) {
  int [ ] [ ] array = new int [ b ] [ a ] ;
  for ( int i = 0 ;
  i < b ;
  i ++ ) {
    array [ i ] = range ( a , b ) ;
  }
  return array ;
}
