static final void main ( String [ ] args ) throws IOException {
  System . setIn ( new FileInputStream ( "data.txt" ) ) ;
  System . setOut ( new FileOutputStream ( "out.txt" ) ) ;
  BufferedReader input = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  for ( int testCase = 0 ;
  testCase < Integer . parseInt ( input . readLine ( ) ) ;
  testCase ++ ) {
    String s = input . readLine ( ) . trim ( ) ;
    StringBuilder ans = new StringBuilder ( s . substring ( 0 , 1 ) ) ;
    for ( int i = 1 ;
    i < s . length ( ) ;
    i ++ ) {
      char ch = s . charAt ( i ) ;
      if ( ch >= ans . length ( ) ) ans . insert ( 0 , ch ) ;
      else ans . append ( ch ) ;
    }
    System . out . println ( "Case #" + ( testCase + 1 ) + ": " + ans . toString ( ) ) ;
  }
}
