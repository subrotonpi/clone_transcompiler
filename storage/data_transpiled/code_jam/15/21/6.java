static int comb ( int [ ] N ) {
  final int s = 0 ;
  for ( int i = 0 ;
  i < N . length ;
  i ++ ) {
    s = 10 * s + N [ i ] ;
  }
  return s ;
}
