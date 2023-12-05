public static final String getCase ( ) throws IOException {
  BufferedReader iReader = new BufferedReader ( new FileReader ( sys . argv [ 0 ] ) ) ;
  int T = Integer . parseInt ( iReader . readLine ( ) . trim ( ) ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    String [ ] line = iReader . readLine ( ) . trim ( ) . split ( " " ) ;
    int R = Integer . parseInt ( line [ 0 ] ) ;
    int C = Integer . parseInt ( line [ 1 ] ) ;
    int W = Integer . parseInt ( line [ 2 ] ) ;
    int shotsFailRows = 0 ;
    int shotsWinRow = 0 ;
    int remainingFields = C ;
    while ( remainingFields >= 2 * W ) {
      remainingFields -= W ;
      shotsFailRows ++ ;
      shotsWinRow ++ ;
    }
    shotsWinRow += Math . min ( remainingFields , W + 1 ) ;
    shotsFailRows ++ ;
    int answer = ( R - 1 ) * shotsFailRows + shotsWinRow ;
    String output = Integer . toString ( answer ) ;
    System . out . println ( "Case #" + ( t + 1 ) + ": " + output ) ;
  }
  return "Case #" + ( T + 1 ) + ": " + output ;
}
