public static int [ ] [ ] getSummarine ( ) {
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] a = new int [ 10 ] [ h ] ;
  int [ ] [ ] b = new int [ w ] [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    b [ i ] = a [ i ] [ j ] ;
  }
  return b ;
}
