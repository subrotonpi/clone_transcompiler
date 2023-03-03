@ VisibleForTesting static int solve ( final int INF , final int EPS ) {
  final int INF = 1e50 ;
  final int EPS = 1e-9 ;
  int tinter = 0 ;
  int a [ ] = new int [ INF ] ;
  int b [ ] = new int [ INF ] ;
  for ( int i = 0 ;
  i < INF ;
  i ++ ) {
    a [ i ] = i ;
  }
  for ( int i = 0 ;
  i < INF ;
  i ++ ) {
    a [ i ] = a [ i ] ;
  }
  for ( int i = 0 ;
  i < INF ;
  i ++ ) {
    b [ i ] = b [ i ] ;
  }
  if ( ( a [ 1 ] == b [ 1 ] ) && ( a [ 1 ] > b [ 1 ] ) ) {
    a [ 0 ] = b [ 1 ] ;
    b [ 1 ] = a [ 0 ] ;
  }
  if ( ( b [ 0 ] >= a [ 0 ] - EPS ) && ( b [ 0 ] >= a [ 0 ] - EPS ) ) {
    b [ 0 ] -= 360 ;
  }
  return ( a [ 0 ] - b [ 0 ] ) / ( b [ 1 ] - a [ 1 ] ) ;
}
