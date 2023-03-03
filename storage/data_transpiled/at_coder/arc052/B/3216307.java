static final int [ ] S ( int N , int Q ) {
  int [ ] X = new int [ N ] ;
  int [ ] R = new int [ N ] ;
  int [ ] H = new int [ N ] ;
  int [ ] A = new int [ Q ] ;
  int [ ] B = new int [ Q ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    X [ i ] = 0 ;
    R [ i ] = 0 ;
    H [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    A [ i ] = 0 ;
    B [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    X [ i ] = 0 ;
    R [ i ] = 0 ;
    H [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    A [ i ] = 0 ;
    B [ i ] = 0 ;
  }
  int M = 2 * 10 * 4 ;
  double [ ] T = new double [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    T [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    double CST = Math . PI * R [ i ] * R [ i ] * R [ i ] / ( 3 * H [ i ] * H [ i ] ) ;
    for ( int k = 0 ;
    k < H [ i ] ;
    k ++ ) {
      T [ X [ i ] + k ] += CST * ( ( k + 1 - H [ i ] ) * ( k - H [ i ] ) * ( k - H [ i ] ) * ( k - H [ i ] ) ) ;
    }
  }
  double [ ] S = new double [ M + 1 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    S [ i + 1 ] = S [ i ] + T [ i ] ;
  }
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    System . out . println ( S [ B [ i ] ] - S [ A [ i ] ] ) ;
  }
  return S ;
}
