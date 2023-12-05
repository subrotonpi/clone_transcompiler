public static int T = Integer . parseInt ( input ) {
  for ( int test = 1 ;
  test <= T ;
  test ++ ) {
    int B = Integer . parseInt ( input . nextLine ( ) ) , M = Integer . parseInt ( input . nextLine ( ) ) ;
    System . out . print ( "Case #" + test + ": " ) ;
    if ( M > ( 2 * ( B - 2 ) ) ) {
      System . out . println ( "IMPOSSIBLE" ) ;
      continue ;
    }
    int [ ] [ ] A = new int [ B ] [ B ] ;
    for ( int i = 0 ;
    i <= B ;
    i ++ ) {
      A [ i ] [ B - 1 ] = 0 ;
      for ( int j = i + 1 ;
      j <= B ;
      j ++ ) {
        A [ i ] [ j ] = 1 ;
      }
    }
    if ( M < 2 * ( B - 2 ) ) {
      A [ 0 ] [ B - 1 ] = 0 ;
      for ( int i = 0 ;
      i < B - 2 ;
      i ++ ) {
        if ( ( 1 << i ) & M ) {
          A [ 0 ] [ B - i - 2 ] = 1 ;
        }
        else {
          A [ 0 ] [ B - i - 2 ] = 0 ;
        }
      }
    }
    System . out . println ( "POSSIBLE" ) ;
    for ( int i = 0 ;
    i < B ;
    i ++ ) {
      System . out . println ( Arrays . toString ( A [ i ] ) ) ;
    }
  }
  return T ;
}
