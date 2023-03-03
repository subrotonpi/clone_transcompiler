public static int win ( int h , int w ) {
  String [ ] s = ( String [ ] ) input . split ( " " ) ;
  int [ ] [ ] mem = new int [ h ] [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    mem [ i ] [ 0 ] = i ;
  }
  return w ;
}
