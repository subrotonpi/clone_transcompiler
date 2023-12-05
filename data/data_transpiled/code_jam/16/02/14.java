static final int getCase ( String s ) {
  final int testCase = 0 ;
  for ( String s : new BufferedReader ( new InputStreamReader ( System . in ) ) . readLine ( ) . split ( s ) ) {
    if ( testCase > 0 ) {
      final String S = s . trim ( ) ;
      System . out . println ( "Case #" + testCase + ":" + Integer . valueOf ( ( S + '+' ) . charAt ( i + 1 ) != S . charAt ( i ) ) ) ;
    }
    testCase ++ ;
  }
  return testCase ;
}
