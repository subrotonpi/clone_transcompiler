static final String getProblemName ( ) {
  final String problemName = "A" ;
  final String testCase = "large" ;
  int attempt = 0 ;
  {
    final Scanner scanner = new Scanner ( System . in ) ;
    int totalTaken = 0 ;
    final Stack < Character > holding = new Stack < > ( ) ;
    int points = 0 ;
    for ( char c : scanner . nextLine ( ) . toCharArray ( ) ) {
      if ( holding . size ( ) == 0 || holding . peek ( ) != c ) {
        if ( totalTaken == preferences . length / 2 ) {
          holding . pop ( ) ;
          points += 5 ;
        }
        else {
          holding . push ( c ) ;
          totalTaken ++ ;
        }
      }
      else {
        holding . pop ( ) ;
        points += 10 ;
      }
    }
    return points ;
  }
  final File currentDir = new File ( System . getProperty ( "user.dir" ) ) ;
  final String inputString ;
  final String outputString ;
  if ( testCase . equals ( "large" ) || testCase . equals ( "example" ) ) {
    inputString = problemName + ( "-" + testCase ) ;
    outputString = problemName + ( "-" + testCase ) ;
  }
  else {
    inputString = problemName + ( "-" + testCase + "-attempt" + attempt ) ;
    outputString = problemName + ( "-" + testCase ) ;
  }
  final File inFile = new File ( currentDir , "inputfiles/" + inputString + ".in" ) ;
  final File outFile = new File ( currentDir , "outputfiles/" + outputString + ".out" ) ;
  if ( outFile . exists ( ) ) {
    outFile . delete ( ) ;
  }
  try {
    final Scanner inputScanner = new Scanner ( inFile ) ;
    final int numberOfCases = Integer . parseInt ( inputScanner . nextLine ( ) ) ;
    for ( int testCase = 1 ;
    testCase <= numberOfCases ;
    testCase ++ ) {
      final int result = scanner . nextInt ( ) ;
      try {
        final PrintWriter pw = new PrintWriter ( outFile ) ;
        pw . printf ( "Case #%d: %d\n" , testCase , result ) ;
        pw . println ( "Case #%d: %d\n" , testCase , result ) ;
      }
      finally {
        inputScanner . close ( ) ;
        pw . close ( ) ;
      }
    }
  }
  catch ( final FileNotFoundException e ) {
    e . printStackTrace ( ) ;
  }
  return null ;
}
