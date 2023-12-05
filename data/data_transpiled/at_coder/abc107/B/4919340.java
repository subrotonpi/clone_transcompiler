static final int [ ] [ ] resize ( int H , int W ) {
  int [ ] [ ] A = resize ( H , W ) ;
  int [ ] [ ] [ ] = resize ( H , W ) ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    A [ i ] = resize ( H , W ) ;
  }
  boolean mask = A [ 0 ] == A [ 0 ] [ 0 ] ;
  int rowIdx = 0 ;
  int colIdx = 0 ;
  for ( int i = 0 ;
  i < W ;
  i ++ ) {
    mask &= A [ rowIdx ] [ i ] == A [ rowIdx ] [ i ] ;
  }
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    A [ rowIdx ] [ i ] = resize ( W , H ) ;
  }
  for ( int i = 0 ;
  i < W ;
  i ++ ) {
    A [ rowIdx ] [ i ] = resize ( W , H ) ;
  }
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    A [ rowIdx ] [ i ] = resize ( W , H ) ;
  }
  for ( int i = 0 ;
  i < W ;
  i ++ ) {
    A [ rowIdx ] [ i ] = resize ( W , H ) ;
  }
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    A [ rowIdx ] [ i ] = resize ( W , H ) ;
  }
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    A [ rowIdx ] [ i ] = resize ( W , H ) ;
  }
  for ( int i = 0 ;
  i < W ;
  i ++ ) {
    A [ rowIdx ] [ i ] = resize ( W , H ) ;
  }
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    A [ rowIdx ] [ i ] = resize ( H ,