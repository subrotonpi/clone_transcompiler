static final int doSplit ( int f , int t ) {
  final int N ;
  int [ ] V ;
  /* do split */
  f = ( f + t - 1 ) / t - 1 ;
  /* solve the array */
  Arrays . sort ( V , reverse = true ) ;
  int best = V [ 0 ] ;
  for ( int j : xrange ( 1 , V [ 0 ] + 1 ) ) {
    int r = 0 ;
    for ( int v : V ) {
      if ( v <= j ) break ;
      r += doSplit ( v , j ) ;
    }
    best = Math . min ( best , r + j ) ;
  }
  /* main loop */
  T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int t : xrange ( 1 , T + 1 ) ) {
    N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    V = ArrayUtil . toIntArray ( V ) ;
    assert ( V . length == N ) ;
    System . out . println ( "Case #" + t + ": " + solve ( V ) ) ;
  }
  if ( __name__ == null ) {
    /* main loop */
  }
  return 0 ;
}
