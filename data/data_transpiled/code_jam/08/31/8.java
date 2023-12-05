static final String getUpperCaseName ( ) throws IOException {
  final String inputName = ( args . length < 2 ) ? "test.in" : args [ 0 ] ;
  final BufferedReader file = new BufferedReader ( new FileReader ( inputName ) ) ;
  final String nextLine = "" ;
  for ( int testCase = 0 ;
  testCase < Integer . parseInt ( nextLine ) ;
  testCase ++ ) {
    final int P = Integer . parseInt ( nextLine ) ;
    final int K = Integer . parseInt ( nextLine ) ;
    final int L = Integer . parseInt ( nextLine ) ;
    final List < Integer > Letters = map . get ( P ) ;
    Collections . sort ( Letters , Collections . reverseOrder ( ) ) ;
    int res = 0 ;
    int i = 1 ;
    int z = 0 ;
    for ( final Integer e : Letters ) {
      res = res + i * e ;
      z ++ ;
      if ( ( z >= K ) && ( z < L ) ) {
        z = 0 ;
        i ++ ;
      }
    }
    System . out . println ( "Case #" + ( testCase + 1 ) + ": " + res ) ;
  }
  return nextLine ;
}
