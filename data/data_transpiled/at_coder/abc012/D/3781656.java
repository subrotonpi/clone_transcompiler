@ VisibleForTesting static int [ ] [ ] floydWarshall ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] g = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    g [ i ] [ i ] = 0 ;
  }
  return g ;
}
