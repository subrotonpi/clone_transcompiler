static final void main ( String [ ] args ) throws IOException {
  System . setIn ( new FileInputStream ( "data.txt" ) ) ;
  System . setOut ( new FileOutputStream ( "out.txt" ) ) ;
  BufferedReader input = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  for ( int testCase = 0 ;
  testCase < Integer . parseInt ( input . readLine ( ) ) ;
  testCase ++ ) {
    String s = input . readLine ( ) . trim ( ) + "+" ;
    int count = 0 ;
    for ( int i = 0 ;
    i < s . length ( ) - 1 ;
    i ++ ) {
      if ( s . charAt ( i ) != s . charAt ( i + 1 ) ) count ++ ;
    }
    System . out . println ( "Case #" + ( testCase + 1 ) + ": " + count ) ;
  }
}
