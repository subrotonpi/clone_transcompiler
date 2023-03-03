public static int T = Integer . parseInt ( readLine ( ) ) {
  int bestsofar = 0 ;
  int [ ] stuff = new int [ T ] ;
  int C = 0 ;
  if ( stuff . length == 0 ) {
    return bestsofar ;
  }
  if ( stuff [ 0 ] > bestsofar + 1 ) {
    return bestsofar ;
  }
  return calcBest ( bestsofar + C * stuff [ 0 ] , stuff , C ) ;
}
private int doprob ( ) {
  int [ ] read = new int [ T ] ;
  for ( int k = 0 ;
  k < T ;
  k ++ ) {
    read [ k ] = Integer . parseInt ( readLine ( ) ) ;
  }
  int C = read [ 0 ] ;
  int D = read [ 1 ] ;
  int V = read [ 2 ] ;
  Arrays . sort ( read ) ;
  Arrays . sort ( aug ) ;
  int [ ] aug = new int [ T ] ;
  int best = calcBest ( 0 , read , C ) ;
  while ( best < V ) {
    aug [ best ] = best + 1 ;
    best = calcBest ( 0 , new ArrayList < > ( read + aug ) , C ) ;
  }
  return aug . length ;
}
