private static int [ ] [ ] readAllInts ( ) throws IOException {
  final BufferedReader in = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final int cases = Integer . parseInt ( in . readLine ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= cases ;
  testCase ++ ) {
    final int N = Integer . parseInt ( in . readLine ( ) ) ;
    final int [ ] bffs = ArrayUtil . reverseArray ( Integer . parseInt ( in . readLine ( ) ) ) ;
    final int [ ] maxEnd = new int [ N ] ;
    int maxCycle = 0 ;
    for ( int curr = 0 ;
    curr < N ;
    ) {
      final int [ ] visited = new int [ N ] ;
      int step = 1 ;
      int prev = 0 ;
      while ( true ) {
        if ( bffs [ bffs [ curr ] ] == curr ) {
          maxEnd [ curr ] = Math . max ( maxEnd [ curr ] , step ) ;
          maxEnd [ bffs [ curr ] ] = Math . max ( 1 , maxEnd [ bffs [ curr ] ] ) ;
          break ;
        }
        if ( visited [ curr ] != 0 ) {
          maxCycle = Math . max ( maxCycle , step - visited [ curr ] ) ;
          break ;
        }
        visited [ curr ] = step ;
        prev = curr ;
        curr = bffs [ curr ] ;
        step ++ ;
      }
    }
    final int [ ] [ ] result = new int [ cases ] [ ] ;
    for ( int i = 0 ;
    i < cases ;
    i ++ ) {
      result [ i ] [ 0 ] = i ;
    }
    System . out . println ( "Case #" + testCase + ": " + result [ 0 ] ) ;
  }
  return result ;
}
