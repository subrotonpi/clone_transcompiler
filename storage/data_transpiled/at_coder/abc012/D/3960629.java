@ VisibleForTesting static int [ ] [ ] floydWarshall ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  float inf = Float . POSITIVE_INFINITY ;
  int [ ] [ ] graph = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    graph [ i ] [ 0 ] = inf ;
    graph [ i ] [ 1 ] = inf ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    int t = Integer . parseInt ( input . nextLine ( ) ) ;
    graph [ a ] [ b ] = t ;
    graph [ b ] [ a ] = t ;
  }
  graph = floydWarshall ( graph ) ;
  float ans = inf ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    float maxNum = 0 ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( i == j ) {
        continue ;
      }
      if ( graph [ i ] [ j ] > maxNum ) {
        maxNum = graph [ i ] [ j ] ;
      }
    }
    ans = Math . min ( maxNum , ans ) ;
  }
  System . out . println ( ( int ) ans ) ;
  return graph ;
}
