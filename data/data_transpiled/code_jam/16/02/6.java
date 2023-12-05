static final String getProblemName ( ) {
  final String problemName = "pancakes" ;
  final boolean runOnRealData = true ;
  final int [ ] solution = new int [ ] {
  }
  ;
  final String current = "+" ;
  int flips = 0 ;
  for ( int i = string . length ( ) - 1 ;
  i >= 0 ;
  i -- ) {
    char c = string . charAt ( i ) ;
    if ( c != current ) {
      flips ++ ;
      current = c ;
    }
  }
  final File currentDir = new File ( Thread . currentThread ( ) . getContextClassLoader ( ) . getResource ( "" ) . getFile ( ) ) ;
  final String inputString = "B-large.in" ;
  final String outputString = problemName + ( ! runOnRealData ? "_example_output" : "_output" ) ;
  final File inFile = new File ( currentDir , "inputfiles" + inputString ) ;
  final File outFile = new File ( currentDir , "outputfiles" + outputString + ".txt" ) ;
  if ( outFile . exists ( ) ) outFile . delete ( ) ;
  try {
    final Scanner inputScanner = new Scanner ( inFile ) ;
    final int numberOfCases = Integer . parseInt ( inputScanner . nextLine ( ) ) ;
    for ( int testCase : xrange ( 1 , numberOfCases + 1 ) ) {
      final String string = inputScanner . nextLine ( ) . trim ( ) ;
      final int result = solution [ testCase ] ;
      try {
        final PrintWriter pw = new PrintWriter ( outFile ) ;
        pw . printf ( "Case #%d: %d\n" , testCase , result ) ;
        pw . println ( "Result #%d: %d\n" , result ) ;
      }
      finally {
        inputScanner . close ( ) ;
      }
    }
  }
  catch ( final Exception e ) {
    e . printStackTrace ( ) ;
  }
  return null ;
}
