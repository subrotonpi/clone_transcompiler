public static int [ ] S ( String input ) {
  int [ ] S = new int [ input . length ( ) ] ;
  for ( int i = 0 ;
  i < S . length ;
  i ++ ) {
    S [ i ] = Integer . parseInt ( input . substring ( i , i + 1 ) ) ;
  }
  for ( int i = 0 ;
  i < 8 ;
  i ++ ) {
    int ch = S [ 0 ] ;
    for ( int j = 0 ;
    j < 3 ;
    j ++ ) {
      if ( ( int ) ( i / ( 2 * j ) ) % 2 == 0 ) {
        ch += S [ j + 1 ] ;
      }
      else {
        ch -= S [ j + 1 ] ;
      }
    }
    if ( ch == 7 ) {
      System . out . print ( S [ 0 ] ) ;
      for ( int j = 0 ;
      j < 3 ;
      j ++ ) {
        if ( ( int ) ( i / ( 2 * j ) ) % 2 == 0 ) {
          System . out . print ( '+' ) ;
        }
        else {
          System . out . print ( '-' ) ;
        }
        System . out . print ( S [ j + 1 ] ) ;
      }
      System . out . println ( "=7" ) ;
      break ;
    }
  }
  return S ;
}
