static final String getUpperCasesFileName ( ) throws IOException {
  File file = new File ( System . getProperty ( "java.home" ) ) ;
  BufferedReader inputReader = new BufferedReader ( new FileReader ( file ) ) ;
  int numCases = Integer . parseInt ( inputReader . readLine ( ) . trim ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= numCases ;
  testCase ++ ) {
    long N = Long . parseLong ( inputReader . readLine ( ) . trim ( ) ) ;
    long M = Long . parseLong ( inputReader . readLine ( ) . trim ( ) ) ;
    long A = Long . parseLong ( inputReader . readLine ( ) . trim ( ) ) ;
    long doubleArea = 0 ;
    for ( long x2 = xrange ( N + 1 ) ;
    x2 < N ;
    x2 ++ ) {
      for ( long y2 = xrange ( M + 1 ) ;
      y2 < M ;
      y2 ++ ) {
        for ( long x3 = xrange ( x2 , N + 1 ) ;
        x3 < N ;
        x3 ++ ) {
          for ( long negy3 = xrange ( M - y2 + 1 ) ;
          negy3 < M ;
          negy3 ++ ) {
            long y3 = - negy3 ;
            doubleArea = x3 * y2 - y3 * x2 ;
            if ( doubleArea >= A ) break ;
          }
          if ( doubleArea == A ) break ;
        }
        if ( doubleArea == A ) break ;
      }
      if ( doubleArea == A ) System . out . println ( "Case #" + testCase + ": " + 0 + " " + - y3 + " " + x2 + " " + y2 - y3 + " " + x3 + " " + 0 ) ;
      else System . out . println ( "Case #" + testCase + ": IMPOSSIBLE" ) ;
    }
  }
  return file . getAbsolutePath ( ) ;
}
