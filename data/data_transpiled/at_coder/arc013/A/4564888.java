static final int [ ] [ ] n ( int [ ] [ ] input ) {
  int [ ] [ ] d = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < 6 ;
  i ++ ) {
    int e = 1 ;
    for ( int j = 0 ;
    j < 3 ;
    j ++ ) {
      h *= n [ j ] [ i ] / d [ i ] [ j ] ;
    }
    if ( e > 0 ) {
      e -- ;
    }
  }
  return d ;
}
