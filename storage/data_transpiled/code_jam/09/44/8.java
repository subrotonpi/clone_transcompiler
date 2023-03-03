static int [ ] [ ] readInput ( ) throws IOException {
  BufferedReader reader = new BufferedReader ( new FileReader ( "D-small-attempt0.in" ) ) ;
  int testCaseCount = Integer . parseInt ( reader . readLine ( ) ) ;
  int [ ] [ ] testCases = new int [ testCaseCount ] [ ] ;
  for ( int i = 0 ;
  i <= testCaseCount ;
  i ++ ) {
    int plantCount = Integer . parseInt ( reader . readLine ( ) ) ;
    int [ ] [ ] plants = new int [ plantCount ] [ 2 ] ;
    for ( int j = 0 ;
    j <= plantCount ;
    j ++ ) {
      plants [ j ] = new int [ plantCount ] ;
      for ( int k = 0 ;
      k <= plantCount ;
      k ++ ) {
        plants [ j ] [ k ] = Integer . parseInt ( reader . readLine ( ) ) ;
      }
    }
    testCases [ i ] = plants ;
  }
  return testCases ;
}
