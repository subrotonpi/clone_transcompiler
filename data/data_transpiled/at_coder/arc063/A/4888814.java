public static int [ ] S ( ) {
  int [ ] S = new int [ input . length ] ;
  for ( int i = 0 ;
  i < S . length ;
  i ++ ) {
    if ( S [ i ] == 'W' && S [ i + 1 ] == 'B' ) {
      ans ++ ;
    }
    else if ( S [ i ] == 'B' && S [ i + 1 ] == 'W' ) {
      ans ++ ;
    }
  }
  return ans ;
}
