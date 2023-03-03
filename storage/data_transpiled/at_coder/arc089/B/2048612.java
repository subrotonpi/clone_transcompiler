@ VisibleForTesting static int [ ] [ ] solve ( ) {
  int N = input . nextInt ( ) ;
  int K = input . nextInt ( ) ;
  int L = K ;
  int [ ] [ ] board = new int [ K ] [ K ] ;
  int NW = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int x = input . nextInt ( ) ;
    final int y = input . nextInt ( ) ;
    final int c = ( x / K + y / K + ( int ) c == 'W' ) ? 1 : - 1 ;
    board [ y ] [ x ] += c == 1 ? 1 : - 1 ;
    NW += c ;
    board [ y ] [ x ] += c == 1 ? 1 : - 1 ;
  }
  int NB = N - NW ;
  int [ ] [ ] psumr = new int [ K + 1 ] [ K + 1 ] ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    for ( int j = 0 ;
    j < K ;
    j ++ ) {
      psumr [ i ] [ j + 1 ] = psumr [ i ] [ j ] + board [ i ] [ j ] ;
    }
  }
  int [ ] [ ] psum = new int [ K + 1 ] [ K + 1 ] ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    for ( int j = 0 ;
    j < K ;
    j ++ ) {
      psum [ i + 1 ] [ j + 1 ] = psum [ i ] [ j + 1 ] + psumr [ i ] [ j + 1 ] ;
    }
  }
  int result = 0 ;
  for ( int i = 0 ;
  i < K + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < K + 1 ;
    j ++ ) {
      int summ = psum [ i ] [ K ] + psum [ K ] [ j ] - 2 * psum [ i ] [ j ] ;
      result = max ( result , NB + summ , NW - summ ) ;
    }
  }
  System . out . println ( result ) ;
  return board ;
}
