@ VisibleForTesting static void go ( String file ) throws IOException {
  final Scanner scanner = new Scanner ( new File ( file ) ) ;
  try ( final PrintStream output = new PrintStream ( new FileOutputStream ( "out.txt" ) ) ) {
    for ( int testCase = 1 ;
    testCase <= Integer . parseInt ( scanner . nextLine ( ) ) ;
    testCase ++ ) {
      output . print ( "Case #" + testCase + ": " ) ;
      final int [ ] in1 = scanner . nextLine ( ) . split ( " " ) ;
      final int l = in1 [ 1 ] ;
      final int h = in1 [ 2 ] ;
      final int [ ] jeff = new int [ l + 1 ] ;
      for ( int i = l ;
      i <= h ;
      i ++ ) {
        jeff [ i ] = i ;
      }
      final int [ ] players = scanner . nextLine ( ) . split ( " " ) ;
      for ( int p : players ) {
        final int [ ] nj = new int [ jeff . length ] ;
        for ( int j = 0 ;
        j < jeff . length ;
        j ++ ) {
          if ( ( j >= p && j % p == 0 ) || ( j < p && p % j == 0 ) ) {
            nj [ j ] = j ;
          }
        }
        jeff = nj ;
        if ( jeff . length == 0 ) {
          output . println ( "NO" ) ;
          break ;
        }
      }
      else {
        output . println ( jeff [ 0 ] ) ;
      }
    }
  }
}
