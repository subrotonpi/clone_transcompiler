static int [ ] solve ( int E , int R , int N , int [ ] values ) throws IOException {
  System . setRecursionDesired ( 11000 ) ;
  BufferedReader br = new BufferedReader ( new FileReader ( "B-large.in" ) ) ;
  int T = Integer . parseInt ( br . readLine ( ) ) ;
  int [ ] result = new int [ T + 1 ] ;
  int best , bestI ;
  for ( int test = 1 ;
  test <= T ;
  test ++ ) {
    E = Integer . parseInt ( br . readLine ( ) ) ;
    R = Integer . parseInt ( br . readLine ( ) ) ;
    N = Integer . parseInt ( br . readLine ( ) ) ;
    values = new int [ N ] ;
    for ( int i : xrange ( start , end ) ) {
      if ( values [ i ] > best ) {
        best = values [ i ] ;
        bestI = i ;
      }
    }
  }
  /* solve */
  result [ 0 ] = bestI ;
  int [ ] result = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    result [ i ] = i ;
  }
  System . out . println ( "Case #" + test + ": " + solve ( E , R , N , result ) ) ;
  return result ;
}
