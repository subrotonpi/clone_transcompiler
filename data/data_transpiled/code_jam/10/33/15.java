static public String [ ] [ ] readInput ( ) throws IOException {
  final BufferedReader file = new BufferedReader ( new FileReader ( System . getProperty ( "file.name" ) ) ) ;
  final int testCaseCount = Integer . parseInt ( file . readLine ( ) ) ;
  final String [ ] [ ] testCases = new String [ testCaseCount ] [ ] ;
  for ( int i = 0 ;
  i < testCaseCount ;
  i ++ ) {
    System . out . println ( "Case #" + testCaseNr + ": " + solve ( testCaseCount ) ) ;
    testCaseNr ++ ;
  }
  final String [ ] [ ] fields = new String [ testCaseCount ] [ ] ;
  for ( int i = 0 ;
  i < fields . length ;
  i ++ ) {
    final int m = Integer . parseInt ( file . readLine ( ) ) ;
    final int n = Integer . parseInt ( file . readLine ( ) ) ;
    final String [ ] grid = new String [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      grid [ j ] = parseLine ( file . readLine ( ) ) ;
    }
    testCases [ i ] = new String [ ] {
      grid [ m ] , grid [ n ] }
      ;
    }
    return testCases ;
  }
  