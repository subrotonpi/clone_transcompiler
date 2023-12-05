public static int [ ] S ( ) {
  int K = ( S . length + 1 ) / 2 ;
  if ( S . length % 2 == 0 ) {
    int mark = S [ S . length / 2 ] ;
    if ( mark != S [ S . length / 2 - 1 ] ) {
      System . out . println ( K ) ;
      exit ( ) ;
    }
    int count = 1 ;
    while ( ( 0 < S . length - K - count ) && ( mark != S [ S . length / 2 - 1 - count ] || mark != S [ S . length / 2 + count ] ) ) {
      System . out . println ( K + count ) ;
      exit ( ) ;
    }
    count ++ ;
    System . out . println ( K + count ) ;
  }
  else {
    int mark = S [ S . length / 2 ] ;
    int count = 0 ;
    while ( ( 0 < S . length - K - count ) && ( mark != S [ S . length / 2 - 1 - count ] || mark != S [ S . length / 2 + 1 + count ] ) ) {
      System . out . println ( K + count ) ;
      exit ( ) ;
    }
    count ++ ;
    System . out . println ( K + count ) ;
  }
  return S ;
}
