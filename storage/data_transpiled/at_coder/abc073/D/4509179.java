@ VisibleForTesting static Iterable < Integer > solve ( int N , int M , int R , int [ ] [ ] ABCs ) {
  final int INF = 100000 * 200 * 10 ;
  final Iterable < Integer > [ ] dists = new Iterable [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    dists [ i ] [ i ] = INF ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    dists [ i ] [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int ans = INF ;
    for ( int s = 0 ;
    s < N ;
    s ++ ) {
      int e = Integer . parseInt ( input . nextLine ( ) ) ;
      if ( dists [ s - 1 ] [ e - 1 ] == - 1 ) {
        int d = denseDijkstra ( s , e , R , ABCs ) ;
        dists [ s - 1 ] [ e - 1 ] = d ;
        dists [ e - 1 ] [ s - 1 ] = d ;
      }
      else {
        int d = dists [ s - 1 ] [ e - 1 ] ;
        dists [ s ] [ e ] = min ( ans , tans ) ;
      }
    }
  }
  return dists ;
}
