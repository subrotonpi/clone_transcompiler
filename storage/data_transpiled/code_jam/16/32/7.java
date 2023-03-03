public static int T = Integer . parseInt ( input ) {
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    String [ ] t = input . split ( " " ) ;
    int B = Integer . parseInt ( t [ 0 ] ) ;
    int M = Integer . parseInt ( t [ 1 ] ) ;
    if ( M > 2 * ( B - 2 ) ) {
      System . out . println ( "Case #" + testCase + ": IMPOSSIBLE" ) ;
      continue ;
    }
    else {
      System . out . println ( "Case #" + testCase + ": POSSIBLE" ) ;
    }
    char [ ] [ ] ans = new char [ B ] [ ] ;
    for ( int i = 0 ;
    i < B ;
    i ++ ) {
      ans [ i ] = new char [ B ] ;
      for ( int j = 0 ;
      j < B ;
      j ++ ) ans [ i ] [ j ] = '0' ;
      for ( int j = i + 1 ;
      j < B - 1 ;
      j ++ ) ans [ i ] [ j ] = '1' ;
    }
    for ( int i = B - 2 ;
    i > 0 ;
    i -- ) {
      int now = 2 * ( i - 1 ) ;
      if ( M >= now ) {
        M -= now ;
        ans [ i ] [ B - 1 ] = '1' ;
      }
    }
    assert ( M <= 1 ) ;
    if ( M >= 1 ) ans [ 0 ] [ B - 1 ] = '1' ;
    for ( char [ ] line : ans ) {
      System . out . println ( new String ( line ) ) ;
    }
  }
  return T ;
}
