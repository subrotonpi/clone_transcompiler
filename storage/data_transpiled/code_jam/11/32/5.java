static int [ ] [ ] readInput ( ) throws IOException {
  final BufferedReader file = new BufferedReader ( new FileReader ( System . getProperty ( "test.file" ) ) ) ;
  final int testCaseCount = Integer . parseInt ( file . readLine ( ) ) ;
  final int [ ] [ ] testCases = new int [ testCaseCount ] [ ] ;
  for ( int i = 0 ;
  i < testCaseCount ;
  i ++ ) {
    testCases [ i ] = new int [ ] {
      Integer . parseInt ( file . readLine ( ) ) }
      ;
    }
    return testCases ;
  }
  