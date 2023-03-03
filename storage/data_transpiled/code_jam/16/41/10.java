static final String getSolutionName ( ) {
  final String problemName = "A" ;
  final String testCase = "large" ;
  int attempt = 0 ;
  final HashMap < String , String > cache = new HashMap < String , String > ( ) ;
  String inputString ;
  String outputString ;
  if ( cache . containsKey ( new String ( testCase ) ) ) {
    return cache . get ( new String ( testCase ) ) ;
  }
  else {
    inputString = problemName + ( "-" + testCase + "-" ) ;
    outputString = problemName + ( "-" + testCase + "-" ) ;
  }
  File inFile = new File ( currentDir , "inputfiles" + inputString + ".in" ) ;
  File outFile = new File ( currentDir , "outputfiles" + outputString + ".out" ) ;
  if ( outFile . exists ( ) ) {
    outFile . delete ( ) ;
  }
  Scanner inputScanner = new Scanner ( inFile ) ;
  int numberOfCases = Integer . parseInt ( inputScanner . nextLine ( ) ) ;
  for ( int i = 1 ;
  i < numberOfCases ;
  i ++ ) {
    Arrays . fill ( inputScanner . nextLine ( ) , ( char ) ( ' ' + i ) ) ;
    String string1 = Integer . parseInt ( inputScanner . nextLine ( ) ) ;
    String string2 = Integer . parseInt ( inputScanner . nextLine ( ) ) ;
    if ( string1 . compareTo ( string2 ) < 0 ) {
      result = string1 + string2 ;
    }
    else {
      result = string2 + string1 ;
    }
    cache . put ( new String ( testCase ) , result ) ;
  }
  return null ;
}
