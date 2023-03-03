@ VisibleForTesting static boolean [ ] [ ] [ ] grid ( int N , int D ) {
  final boolean [ ] [ ] [ ] grid = new boolean [ N ] [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    grid [ i ] [ 0 ] = true ;
    grid [ i ] [ 1 ] = ~ grid [ i ] [ 1 ] ;
  }
  for ( int i = 0 ;
  i < D ;
  i ++ ) {
    grid [ i ] [ 0 ] = true ;
    grid [ i ] [ 1 ] = true ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    grid [ i ] [ 0 ] = true ;
  }
  for ( int i = 0 ;
  i < D ;
  i ++ ) {
    grid [ i ] [ 1 ] = true ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    grid [ i ] [ 0 ] = true ;
  }
  for ( int i = 0 ;
  i < D ;
  i ++ ) {
    grid [ i ] [ 0 ] = true ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    grid [ i ] [ 1 ] = true ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    grid [ i ] [ 0 ] = true ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    grid [ i ] [ 0 ] [ 0 ] = true ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    grid [ i ] [ 1 ] = true ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    grid [ i ] [ 0 ] [ 0 ] = true ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    grid [ i ] [ i ] = true ;
  }
  return grid ;
}
