static final double [ ] [ ] G ( ) {
  final double INF = 10 * 20 ;
  double xs , ys , xt , yt ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  double [ ] [ ] X = new double [ 1 ] [ N + 2 ] ;
  double [ ] [ ] Y = new double [ 1 ] [ N + 2 ] ;
  double [ ] R = new double [ 1 ] [ N + 2 ] ;
  X [ 0 ] [ 0 ] = xs ;
  Y [ 0 ] [ 0 ] = ys ;
  X [ 0 ] [ N + 1 ] = xt ;
  Y [ 0 ] [ N + 1 ] = yt ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    X [ i + 1 ] = X [ i ] ;
    Y [ i + 1 ] = Y [ i ] ;
    R [ i + 1 ] = map ( R [ i ] ) ;
  }
  G = csGraphFromDense ( G , NullValue . MAX_VALUE ) ;
  System . out . println ( dijkstra ( G , 0 ) [ N - 1 ] ) ;
  return X ;
}
