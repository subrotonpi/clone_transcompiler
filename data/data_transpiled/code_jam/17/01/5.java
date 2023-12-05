public static void IN ( Scanner in ) throws FileNotFoundException {
  PrintStream out = new PrintStream ( new File ( "input.txt" ) ) ;
  int NUM_TESTS = Integer . parseInt ( in . nextLine ( ) ) ;
  for ( int test = xrange ( NUM_TESTS ) ;
  test < NUM_TESTS ;
  test ++ ) {
    boolean [ ] pancake , K ;
    pancake = in . nextLine ( ) . split ( " " ) ;
    Arrays . sort ( pancake ) ;
    K = Integer . parseInt ( K ) ;
    int answer = 0 ;
    for ( int i : xrange ( pancake . length - K + 1 ) ) {
      if ( pancake [ i ] ) {
        answer ++ ;
        for ( int j = 0 ;
        j < K ;
        j ++ ) {
          pancake [ i + j ] = ! pancake [ j ] ;
        }
      }
    }
  }
}
