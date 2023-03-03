static final void solve ( ) throws IOException {
  System . setIn ( new FileInputStream ( "data.txt" ) ) ;
  System . setOut ( new PrintStream ( "out.txt" ) ) ;
  BufferedReader input = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  for ( int testCase = 0 ;
  testCase < Integer . parseInt ( input . readLine ( ) ) ;
  testCase ++ ) {
    int k = Integer . parseInt ( input . readLine ( ) ) ;
    int c = Integer . parseInt ( input . readLine ( ) ) ;
    int s = Integer . parseInt ( input . readLine ( ) ) ;
    if ( c * s < k ) System . out . println ( "Case #" + ( testCase + 1 ) + ": IMPOSSIBLE" ) ;
    else {
      int [ ] check = new int [ k ] ;
      int num = 0 ;
      int carry = 0 ;
      for ( int i = 0 ;
      i < k ;
      i ++ ) {
        num *= k ;
        num += i ;
        carry ++ ;
        if ( carry == c ) {
          check [ i ] = num + 1 ;
          carry = 0 ;
          num = 0 ;
        }
      }
      if ( carry > 0 ) check [ i ] = num + 1 ;
      System . out . println ( "Case #" + ( testCase + 1 ) + ": " + Arrays . toString ( check ) ) ;
    }
  }
}
