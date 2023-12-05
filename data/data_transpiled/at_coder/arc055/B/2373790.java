public static void print ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int K = Integer . parseInt ( input ) ;
  float dp [ ] [ ] [ ] = new float [ K + 2 ] [ N + 1 ] ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < K + 1 ;
    j ++ ) {
      dp [ N ] [ j ] [ 1 ] = 1.0f ;
    }
  }
  for ( int i = N - 1 ;
  i >= 0 ;
  i -- ) {
    for ( int j = 0 ;
    j < K ;
    j ++ ) {
      for ( int b = 0 ;
      b < 2 ;
      b ++ ) {
        dp [ i ] [ j ] [ b ] = ( Math . max ( dp [ i + 1 ] [ j ] [ 0 ] , dp [ i + 1 ] [ j ] [ 1 ] ) ) ;
      }
    }
  }
}
