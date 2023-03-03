static public String [ ] [ ] readInput ( ) throws IOException {
  final BufferedReader file = new BufferedReader ( new FileReader ( System . getProperty ( "test.file" ) ) ) ;
  final int testCaseCount = Integer . parseInt ( file . readLine ( ) ) ;
  final String [ ] [ ] testCases = new String [ testCaseCount ] [ ] ;
  for ( int x = 0 ;
  x < TestCaseCount ;
  x ++ ) {
    final int N = Integer . parseInt ( file . readLine ( ) ) ;
    final int L = Integer . parseInt ( file . readLine ( ) ) ;
    final int H = Integer . parseInt ( file . readLine ( ) ) ;
    final int [ ] notes = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      notes [ i ] = Integer . parseInt ( file . readLine ( ) ) ;
    }
    testCases [ x ] = new String [ ] {
      L , H , notes [ i ] }
      ;
    }
    return testCases ;
  }
  