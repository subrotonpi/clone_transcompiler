public static int T = Integer . parseInt ( input ) {
  int N ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    N = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] perm = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) perm [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    String guess = ( Integer . parseInt ( perm [ i ] + N - i - 1 ) % 1000 ) > 485000 ? "GOOD" : "BAD" ;
    System . out . println ( "Case #" + testCase + ": " + guess ) ;
  }
  return T ;
}
