public static int T = Integer . parseInt ( input ) {
  for ( int testCase = 0 ;
  testCase <= T ;
  testCase ++ ) {
    int N = Integer . parseInt ( input . nextLine ( ) ) ;
    Pair [ ] A = new Pair [ N ] ;
    for ( int n = 0 ;
    n <= N ;
    n ++ ) {
      String [ ] line = input . nextLine ( ) . split ( " " ) ;
      A [ n ] = new Pair ( Integer . parseInt ( line [ 0 ] ) , Integer . parseInt ( line [ 1 ] ) ) ;
    }
    Arrays . sort ( A ) ;
    int s = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int a0 = A [ i ] . left ;
      int b0 = A [ i ] . right ;
      int i = 0 ;
      while ( A [ i ] . left < a0 ) {
        if ( A [ i ] . right > b0 ) {
          s ++ ;
        }
        i ++ ;
      }
    }
    System . out . println ( "Case #" + ( testCase + 1 ) + ": " + s ) ;
  }
  return T ;
}
