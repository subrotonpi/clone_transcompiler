static public int [ ] [ ] readInput ( ) throws IOException {
  final BufferedReader file = new BufferedReader ( new FileReader ( System . getProperty ( "test.file" ) ) ) ;
  final int testCaseCount = Integer . parseInt ( file . readLine ( ) . replaceAll ( " " , "" ) ) ;
  final int [ ] [ ] testCases = new int [ testCaseCount ] [ ] ;
  for ( int i = 0 ;
  i < xrange ;
  i ++ ) {
    final int n = Integer . parseInt ( file . readLine ( ) . replaceAll ( " " , "" ) ) ;
    final int [ ] As = new int [ n ] ;
    final int [ ] Bs = new int [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      final int a = Integer . parseInt ( file . readLine ( ) . replaceAll ( " " , "" ) ) ;
      final int b = Integer . parseInt ( file . readLine ( ) . replaceAll ( " " , "" ) ) ;
      As [ i ] = a ;
      Bs [ j ] = b ;
    }
    testCases [ i ] = new int [ n ] ;
  }
  return testCases ;
}
