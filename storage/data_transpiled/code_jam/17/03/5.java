@ VisibleForTesting static void readQueue ( ) throws IOException {
  BufferedReader IN = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  PrintWriter OUT = new PrintWriter ( new BufferedWriter ( new OutputStreamWriter ( System . out ) ) ) ;
  int NUM_TESTS = Integer . parseInt ( IN . readLine ( ) ) ;
  for ( int test = xrange ( NUM_TESTS ) ;
  test < NUM_TESTS ;
  test ++ ) {
    int N = Integer . parseInt ( IN . readLine ( ) ) ;
    int K = Integer . parseInt ( IN . readLine ( ) ) ;
    Queue < Integer > queue = new ArrayDeque < > ( ) ;
    queue . add ( N ) ;
    int [ ] sizes = new int [ N ] ;
    String binN = N + "b" ;
    for ( int i : xrange ( 1 , binN . length ( ) + 1 ) ) {
      sizes [ i ] = Integer . parseInt ( binN . substring ( 0 , i ) , 2 ) - 1 ;
      sizes [ i ] = Integer . parseInt ( binN . substring ( 0 , i ) , 2 ) ;
    }
    sizes = sizes [ 0 ] ;
    for ( int chunkSize : sizes ) {
      int chunkNum = queue . get ( chunkSize ) ;
      int minNext = ( chunkSize - 1 ) / 2 ;
      int maxNext = ( chunkSize - 1 ) - minNext ;
      if ( K <= chunkNum ) {
        queue . put ( maxNext , minNext ) ;
        break ;
      }
      K -= chunkNum ;
      if ( maxNext == minNext ) {
        queue . put ( maxNext , 2 * chunkNum ) ;
      }
      else {
        queue . put ( maxNext , chunkNum ) ;
        queue . put ( minNext , chunkNum ) ;
      }
    }
    OUT . println ( "Case #" + ( test + 1 ) + ": " + answer . get ( 0 ) + " " + answer . get ( 1 ) ) ;
  }
  IN . close ( ) ;
  OUT . close ( ) ;
}
