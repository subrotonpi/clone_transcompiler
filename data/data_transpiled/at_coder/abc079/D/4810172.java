public static int [ ] [ ] search ( int h , int w ) {
  int [ ] [ ] c = new int [ h ] [ w ] ;
  int [ ] [ ] a = new int [ h ] [ w ] ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) {
    c [ i ] = new int [ w ] ;
    for ( int j = 0 ;
    j < h ;
    j ++ ) {
      a [ i ] [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
  }
  return c ;
}
