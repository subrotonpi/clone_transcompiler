static public int [ ] [ ] parseInput ( String fname ) throws IOException {
  final BufferedReader br = new BufferedReader ( new FileReader ( fname ) ) ;
  final String text [ ] = br . readLine ( ) . split ( "\n" ) ;
  br . close ( ) ;
  final int [ ] [ ] testCases = new int [ cases ] [ ] ;
  final int cases = Integer . parseInt ( text [ 0 ] ) ;
  int cnt = 1 ;
  for ( int i = 0 ;
  i < cases ;
  i ++ ) {
    final String [ ] string = text [ cnt ++ ] . split ( "\\s+" ) ;
    testCases [ i ] = new int [ string . length ] ;
    for ( int j = 0 ;
    j < string . length ;
    j ++ ) {
      testCases [ i ] [ j ] = Integer . parseInt ( string [ j ] ) ;
    }
  }
  return testCases ;
}
