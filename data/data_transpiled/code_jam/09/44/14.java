@ Test ( dataProvider = "a" ) public static void main ( String problem ) throws IOException {
  String inputFileName = problem + ".in" ;
  String outputFileName = problem + ".out" ;
  String testData = "" ;
  testData = null ;
  /* process the input */
  ArrayList < Integer > output = new ArrayList < Integer > ( ) ;
  int iLine = 0 ;
  int N = Integer . parseInt ( input . get ( iLine ++ ) . trim ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= N ;
  testCase ++ ) {
    System . out . println ( "Case " + testCase ) ;
    int nn = Integer . parseInt ( input . get ( iLine ++ ) . trim ( ) ) ;
    for ( int i = 0 ;
    i < nn ;
    i ++ ) {
      input . get ( iLine ++ ) . trim ( ) ;
    }
    int result = 0 ;
    output . add ( result ) ;
  }
  /* main */
  String [ ] input = null ;
  if ( testData == null ) {
    FileReader iReader = new FileReader ( inputFileName ) ;
    BufferedReader br = new BufferedReader ( iReader ) ;
    String line = null ;
    while ( ( line = br . readLine ( ) ) != null ) {
      System . out . println ( line ) ;
    }
  }
  else {
    input = testData . split ( "\n" ) ;
  }
  String [ ] output = process ( input ) ;
  if ( testData == null ) {
    FileWriter ofile = new FileWriter ( outputFileName ) ;
    for ( int i = 0 ;
    i < output . length ;
    i ++ ) {
      System . out . println ( output [ i ] >>> 1 ) ;
      System . out . println ( output [ i ] ) ;
    }
    ofile . close ( ) ;
  }
  for ( int i = 0 ;
  i < output . length ;
  i ++ ) {
    System . out . println ( output [ i ] ) ;
  }
  /* main */
  if ( getClass ( ) . equals ( "org.junit.runner.JUnitTestRunner" ) ) {
    final long start = System . currentTimeMillis ( ) ;
    final int N = main ( input ) ;
    System . out . println ( "Done in " + ( System . currentTimeMillis ( ) - start ) / 1000 + " seconds" ) ;
    System . out . println ( "Average " + ( ( System . currentTimeMillis ( ) - start ) * 1000 / N ) / N + " milliseconds" ) ;
  }
}
