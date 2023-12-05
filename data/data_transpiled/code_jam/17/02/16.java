static final String getLargeString ( ) throws IOException {
  final String fileName = "B-large" ;
  System . loadLibrary ( fileName + ".in" ) ;
  final PrintStream output = new PrintStream ( new FileOutputStream ( fileName + ".out" ) ) ;
  final int T = Integer . parseInt ( input ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    final String S = input ( ) ;
    System . out . println ( "S = " + S ) ;
    final int [ ] D = new int [ S . length ( ) ] ;
    for ( int n = 0 ;
    n < D . length ;
    n ++ ) D [ n ] = Integer . parseInt ( S . substring ( n , n + 1 ) ) ;
    boolean isTidy = true ;
    for ( int i = 1 ;
    i < D . length ;
    i ++ ) {
      if ( D [ i ] < D [ i - 1 ] ) isTidy = false ;
    }
    int answer ;
    if ( isTidy ) {
      answer = S ;
      System . out . println ( "Case #" + testCase + ":" + answer ) ;
      System . out . println ( "Case #" + testCase + ":" + answer ) ;
    }
    else {
      Arrays . sort ( D ) ;
      int i = 1 ;
      while ( D [ i ] >= D [ i - 1 ] ) i ++ ;
      int j = i - 1 ;
      while ( D [ j ] == D [ j - 1 ] ) j -- ;
      final int [ ] E = new int [ D . length ] ;
      for ( int i = 0 ;
      i < D . length ;
      i ++ ) {
        E [ i ] = D [ j ] - 1 ;
      }
      for ( int j = 0 ;
      j < E . length ;
      j ++ ) {
        answer *= 10 ;
        answer += E [ j ] ;
      }
      answer = Integer . toString ( answer ) ;
      System . out . println ( "Case #" + testCase + ":" + answer ) ;
      System . out . println ( "Case #" + testCase + ":" + answer ) ;
    }
  }
  return output . toString ( ) ;
}
