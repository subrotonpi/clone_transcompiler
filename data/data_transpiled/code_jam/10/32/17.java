static int [ ] [ ] readInput ( ) throws IOException {
  final BufferedReader file = new BufferedReader ( new FileReader ( sys . getProperty ( "file" ) ) ) ;
  final int testCaseCount = Integer . parseInt ( file . readLine ( ) . replaceAll ( "\\s+" , "" ) ) ;
  final int [ ] [ ] testCases = new int [ testCaseCount ] [ ] ;
  for ( int i = 0 ;
  i < testCaseCount ;
  i ++ ) {
    testCases [ i ] = new int [ testCaseCount ] ;
    for ( int j = 0 ;
    j < testCaseCount ;
    j ++ ) {
      testCases [ i ] [ j ] = Integer . parseInt ( file . readLine ( ) . replaceAll ( "\\s+" , "" ) ) ;
    }
  }
  return testCases ;
}
