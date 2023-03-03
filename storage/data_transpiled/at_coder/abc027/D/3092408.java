public static void input ( ) {
  int [ ] sSum = new int [ S . length ] ;
  sSum [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < S . length ;
  i ++ ) {
    switch ( S . charAt ( i ) ) {
      case '+' : sSum [ i ] = sSum [ i ] + 1 ;
      break ;
      case '-' : sSum [ i ] = sSum [ i ] - 1 ;
      break ;
      default : sSum [ i ] = sSum [ i ] ;
    }
  }
  int total = sum ( sSum ) ;
  int [ ] rSum = new int [ total ] ;
  for ( int i = 0 ;
  i < rSum . length ;
  i ++ ) {
    if ( rSum [ i ] == 'M' ) {
      rSum [ i ] = total - sSum [ i ] ;
    }
  }
}
