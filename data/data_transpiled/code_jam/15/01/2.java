static int [ ] findsol ( int [ ] S , int Smax ) throws IOException {
  final int [ ] a ;
  int b = 0 ;
  int c = 0 ;
  for ( int ii = 0 ;
  ii < S . length ;
  ++ ii ) {
    c += S [ ii ] ;
    if ( ( ii - c + 1 ) > b ) {
      b = ii - c + 1 ;
    }
  }
  /* convertnums */
  a = new int [ S . length ] ;
  int ii = 0 ;
  for ( int jj = 0 ;
  jj < S . length ;
  ++ jj ) {
    if ( S [ jj ] == ' ' ) {
      if ( ( ii < jj ) && ( ii < Smax ) ) {
        a [ ii ] = Integer . parseInt ( S [ ii ] ) ;
        ii = jj + 1 ;
      }
    }
  }
  a [ 0 ] = Integer . parseInt ( S [ ii ] ) ;
  return a ;
}
