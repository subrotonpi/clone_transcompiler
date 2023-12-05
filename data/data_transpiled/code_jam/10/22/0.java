public static void readInput ( BufferedReader br ) throws IOException {
  int C = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int tNo = 1 ;
  tNo <= C ;
  tNo ++ ) {
    Set < String > dirs = new HashSet < String > ( ) ;
    int N = Integer . parseInt ( br . readLine ( ) ) ;
    int K = Integer . parseInt ( br . readLine ( ) ) ;
    int B = Integer . parseInt ( br . readLine ( ) ) ;
    int T = Integer . parseInt ( br . readLine ( ) ) ;
    int X [ ] = new int [ N ] ;
    int V [ ] = new int [ N ] ;
    for ( int i = N - 1 ;
    i >= 0 ;
    i -- ) {
      dirs . add ( Integer . parseInt ( br . readLine ( ) ) ) ;
      X [ i ] = Integer . parseInt ( br . readLine ( ) ) ;
      V [ i ] = Integer . parseInt ( br . readLine ( ) ) ;
    }
    int sol = 0 ;
    for ( int i = N - 1 ;
    i >= 0 ;
    i -- ) {
      if ( K == 0 ) break ;
      if ( ( B - X [ i ] ) > T * V [ i ] ) sol += K ;
      else K -- ;
    }
    if ( K != 0 ) sol = "IMPOSSIBLE" ;
    System . out . println ( "Case #" + tNo + ": " + sol ) ;
  }
}
