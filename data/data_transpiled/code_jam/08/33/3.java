static final String getBenchmark ( ) throws IOException {
  final String inputName = ( args . length < 2 ) ? "test.in" : args [ 0 ] ;
  final BufferedReader file = new BufferedReader ( new FileReader ( inputName ) ) ;
  final String nextLine = "test.in" ;
  for ( int testCase = 0 ;
  testCase < Integer . parseInt ( nextLine ) ;
  testCase ++ ) {
    final int n = Integer . parseInt ( nextLine ) ;
    final int m = Integer . parseInt ( nextLine ) ;
    final int X = Integer . parseInt ( nextLine ) ;
    final int Y = Integer . parseInt ( nextLine ) ;
    final int Z = Integer . parseInt ( nextLine ) ;
    final int [ ] Speed = new int [ n ] ;
    final int [ ] A = new int [ m ] ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      A [ i ] = Integer . parseInt ( nextLine ) ;
    }
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      Speed [ i ] = A [ i % m ] ;
      A [ i % m ] = ( X * A [ i % m ] + Y * ( i + 1 ) ) % Z ;
    }
    final long [ ] res = new long [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( int j = 0 ;
      j < i ;
      j ++ ) {
        if ( Speed [ i ] > Speed [ j ] ) {
          res [ i ] = res [ i ] + res [ j ] ;
        }
      }
      if ( ( res [ i ] >= 1000000007 ) && ( res [ i ] != 0 ) ) {
        res [ i ] = res [ i ] % 1000000007 ;
      }
    }
    System . out . println ( "Case #" + ( testCase + 1 ) + ": " + Long . toString ( res [ i ] ) % 1000000007 ) ;
  }
  return null ;
}
