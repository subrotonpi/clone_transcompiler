@ GwtIncompatible ( "java.io.BufferedReader" ) private static PrintStream inpReader = new PrintStream ( new FileReader ( "B-small.in" ) ) {
  private PrintWriter out = new PrintWriter ( new BufferedWriter ( new FileWriter ( "B-small.out" ) ) ) {
    private int A = Integer . parseInt ( line ) ;
    private int B = Integer . parseInt ( line ) ;
    private int P = Integer . parseInt ( line ) ;
    private int [ ] numbers = new int [ B - A + 1 ] ;
    private int [ ] sets = new int [ B - A + 1 ] ;
    @ Override public String print ( String s ) {
      for ( int i = 0 ;
      i < primes . length ;
      i ++ ) {
        int c1 = primes [ i ] ;
        if ( c1 < P ) continue ;
        if ( c1 > B / 2 + 1 ) break ;
        int [ ] same = new int [ 2 ] ;
        for ( int c2 = 0 ;
        c2 < numbers . length ;
        c2 ++ ) {
          if ( ! numbers [ c2 ] % c1 == 0 ) same [ c2 ] = c2 - A ;
        }
        sets = mergeSets ( sets , same ) ;
      }
    }
  }
  ;
}
