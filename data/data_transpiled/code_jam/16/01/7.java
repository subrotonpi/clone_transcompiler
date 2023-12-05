public static final void main ( String [ ] args ) throws IOException {
  System . setIn ( new FileInputStream ( "data.txt" ) ) ;
  System . setOut ( new FileOutputStream ( "out.txt" ) ) ;
  BufferedReader input = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  for ( int testCase = 0 ;
  testCase < Integer . parseInt ( input . readLine ( ) ) ;
  testCase ++ ) {
    int n = Integer . parseInt ( input . readLine ( ) ) ;
    if ( n == 0 ) {
      System . out . println ( "Case #" + ( testCase + 1 ) + ": INSOMNIA" ) ;
    }
    else {
      int [ ] left = new int [ 10 ] ;
      int count = 10 ;
      for ( int i = 1 ;
      i < 10000000 ;
      i ++ ) {
        for ( int ch : map . get ( String . valueOf ( n * i ) ) ) {
          if ( left [ ch ] != 0 ) {
            left [ ch ] = 0 ;
            count -- ;
          }
        }
        if ( count == 0 ) {
          System . out . println ( "Case #" + ( testCase + 1 ) + ": " + n * i ) ;
          break ;
        }
      }
    }
  }
}
