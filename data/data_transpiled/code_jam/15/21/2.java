@ VisibleForTesting static void debug ( String ... args ) {
  System . err . println ( args ) ;
}
{
  int [ ] numbers = new int [ args . length ] ;
  for ( int i = 0 ;
  i < args . length ;
  i ++ ) {
    numbers [ i ] = Integer . parseInt ( String . valueOf ( args [ i ] ) . substring ( 1 ) ) ;
  }
  BufferedReader fin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  int T = Integer . parseInt ( fin . readLine ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    int n = Integer . parseInt ( fin . readLine ( ) ) ;
    int count = 0 ;
    while ( n > 0 ) {
      String digits = String . valueOf ( n ) ;
      int halfcount = ( digits . length ( ) + 1 ) / 2 ;
      int rev = reverse ( digits ) ;
      int mod = n % ( 10 * halfcount ) ;
      if ( mod == 1 && n != rev ) {
        n = rev ;
        count ++ ;
      }
      else if ( mod <= 1 ) {
        n -- ;
        count ++ ;
      }
      else {
        n -= ( mod - 1 ) ;
        count += ( mod - 1 ) ;
      }
    }
    System . err . println ( "Case #" + testCase + ": " + count ) ;
  }
}
