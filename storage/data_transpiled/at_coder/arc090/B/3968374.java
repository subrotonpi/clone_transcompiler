public static int [ ] [ ] readInputInt ( Scanner input ) {
  int N = input . nextInt ( ) , M = input . nextInt ( ) ;
  int [ ] [ ] LRD = new int [ M ] [ ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    LRD [ i ] = new int [ N ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      LRD [ i ] [ j ] = input . nextInt ( ) ;
    }
  }
  HashMap < Integer , HashMap < Integer , Integer >> G = new HashMap < Integer , HashMap < Integer , Integer >> ( ) ;
  for ( int l = 0 ;
  l < LRD . length ;
  l ++ ) {
    int r = LRD [ l ] [ r ] ;
    int d = LRD [ l ] [ r ] ;
    l -- ;
    r -- ;
    G . put ( l , G . get ( l ) ) ;
    G . put ( r , G . get ( r ) ) ;
    G . put ( l , d ) ;
    G . put ( r , - d ) ;
  }
  final double INF = Double . POSITIVE_INFINITY ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( G . containsKey ( i ) ) {
      D [ i ] = G . get ( i ) ;
    }
    else {
      D [ i ] = G . get ( i ) ;
    }
  }
  return D ;
}
