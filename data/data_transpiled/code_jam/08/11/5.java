private static Scanner scan ( Scanner in ) throws IOException {
  in = new Scanner ( new File ( "A.txt" ) ) ;
  int T = in . nextInt ( ) ;
  for ( int testCase = 0 ;
  testCase < T ;
  testCase ++ ) {
    int n = in . nextInt ( ) ;
    int [ ] a = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      a [ i ] = in . nextInt ( ) ;
    }
    int [ ] b = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      b [ i ] = in . nextInt ( ) ;
    }
    Arrays . sort ( a ) ;
    Arrays . sort ( b ) ;
    Arrays . reverse ( b ) ;
    System . out . println ( "Case #" + ( testCase + 1 ) + ": " + Arrays . toString ( a ) ) ;
  }
  return in ;
}
