public static int except_4_9 ( String length ) {
  int [ ] [ ] t = new int [ length . length ( ) + 1 ] [ 2 ] ;
  t [ 0 ] [ 1 ] = 1 ;
  for ( int i = 0 ;
  i < length . length ( ) ;
  i ++ ) {
    for ( int j = 0 ;
    j < t [ 0 ] . length ;
    j ++ ) {
      int n = Integer . parseInt ( length . substring ( i , i + 1 ) ) ;
      if ( j == 0 ) {
        t [ i + 1 ] [ j ] += t [ i ] [ j ] * 8 ;
      }
      else {
        for ( int k = 0 ;
        k < n ;
        k ++ ) {
          t [ i + 1 ] [ j ] += t [ i ] [ j ] ;
        }
      }
    }
  }
  return Integer . parseInt ( t [ length . length ( ) ] ) ;
}
