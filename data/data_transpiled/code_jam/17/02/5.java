public static PrintStream IN = new PrintStream ( new File ( "input.txt" ) ) {
  PrintStream OUT = new PrintStream ( new File ( "output.txt" ) ) ;
  int NUM_TESTS = Integer . parseInt ( IN . readLine ( ) ) ;
  for ( int test : xrange ( NUM_TESTS ) ) {
    int N = Integer . parseInt ( IN . readLine ( ) ) ;
    while ( true ) {
      long [ ] l = new long [ N ] ;
      for ( int i = 0 ;
      i < l . length ;
      i ++ ) {
        l [ i ] = Long . parseLong ( N ) ;
      }
      for ( int i : xrange ( l . length - 1 ) ) {
        if ( l [ i ] > l [ i + 1 ] ) {
          N = Integer . parseInt ( l [ i + 1 ] ) ;
        }
      }
    }
  }
  OUT . println ( ) ;
}
