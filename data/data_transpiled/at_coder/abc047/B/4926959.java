static final int [ ] [ ] resize ( int [ ] input ) {
  int W = input . length ;
  int H = input [ 0 ] . length ;
  int N = input . length ;
  int [ ] [ ] Map = new int [ H ] [ W ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    map [ i ] = input [ i ] ;
  }
  return Map ;
}
