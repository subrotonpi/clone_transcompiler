static public List < TestCase > readInput ( ) throws IOException {
  final BufferedReader file = new BufferedReader ( new FileReader ( sys . argv [ 0 ] ) ) ;
  final int testCaseCount = Integer . parseInt ( file . readLine ( ) ) ;
  final List < TestCase > testCases = new ArrayList < > ( ) ;
  for ( int x = 0 ;
  x < xrange ( testCaseCount ) ;
  x ++ ) {
    final int R = Integer . parseInt ( file . readLine ( ) ) ;
    final int C = Integer . parseInt ( file . readLine ( ) ) ;
    final char [ ] [ ] picture = new char [ R ] [ C ] ;
    for ( int a = 0 ;
    a < R ;
    a ++ ) {
      for ( int b = 0 ;
      b < C ;
      b ++ ) {
        picture [ a ] [ b ] = file . read ( ) ;
      }
    }
    testCases . add ( new TestCase ( R , C , picture ) ) ;
  }
  return testCases ;
}
