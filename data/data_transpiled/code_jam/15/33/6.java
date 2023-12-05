public static final String getCombinations ( ) throws IOException {
  BufferedReader iReader = new BufferedReader ( new FileReader ( args [ 0 ] ) ) ;
  int T = Integer . parseInt ( iReader . readLine ( ) . trim ( ) ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    String [ ] line = iReader . readLine ( ) . trim ( ) . split ( " " ) ;
    int C = Integer . parseInt ( line [ 0 ] ) ;
    int D = Integer . parseInt ( line [ 1 ] ) ;
    int V = Integer . parseInt ( line [ 2 ] ) ;
    int [ ] denominations = new int [ D ] ;
    for ( int x = 0 ;
    x < D ;
    x ++ ) denominations [ x ] = Integer . parseInt ( iReader . readLine ( ) . trim ( ) ) ;
    denominations [ x ] = V + 1 ;
    int covered = 0 ;
    int additions = 0 ;
    for ( int denom : denominations ) {
      while ( denom > covered + 1 ) {
        additions ++ ;
        covered += C * ( covered + 1 ) ;
      }
      covered += C * denom ;
    }
    int answer = additions ;
    String output = Integer . toString ( answer ) ;
    System . out . println ( "Case #" + ( t + 1 ) + ": " + output ) ;
  }
  return "" ;
}
