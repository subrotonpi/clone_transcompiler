public static int [ ] S ( ) {
  int [ ] S = new int [ input . length ] ;
  for ( int i = 0 ;
  i < S . length ;
  i ++ ) {
    S [ i ] = Integer . parseInt ( input [ i ] ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < S . length ;
  i ++ ) {
    int dig = 0 ;
    for ( int j = 0 ;
    j < S . length ;
    j ++ ) {
      if ( ( int ) ( i / ( 2 * j ) ) % 2 == 0 ) {
        dig ++ ;
      }
      else {
        dig = 0 ;
      }
    }
    ans += S [ S . length - j - 2 ] * ( 10 * dig ) ;
  }
  return S ;
}
