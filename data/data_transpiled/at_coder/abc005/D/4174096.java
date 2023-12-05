static int [ ] [ ] rectangles ( int [ ] [ ] D , int N ) {
  final int [ ] [ ] t = new int [ N + 1 ] [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    t [ i ] [ 0 ] = 0 ;
  }
  for ( int i = N ;
  i >= 0 ;
  i -- ) {
    for ( int j = N ;
    j >= 0 ;
    j -- ) {
      t [ i ] [ j ] = D [ i ] [ j ] + t [ i + 1 ] [ j ] + t [ i ] [ j + 1 ] - t [ i + 1 ] [ j + 1 ] ;
    }
  }
  final int [ ] [ ] m = new int [ N * N + 1 ] [ N * N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      for ( int ie = i + 1 ;
      ie <= N ;
      ie ++ ) {
        for ( int je = j + 1 ;
        je <= N ;
        je ++ ) {
          final int n = ( ie - i ) * ( je - j ) ;
          m [ n ] = Math . max ( m [ n ] , rect [ i ] [ j ] - rect [ i ] [ je ] - rect [ ie ] [ j ] + rect [ ie ] [ je ] ) ;
        }
      }
    }
  }
  return m ;
}
