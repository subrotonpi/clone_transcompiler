static final String solve ( final int [ ] testCase ) {
  final int N = testCase [ 0 ] ;
  final int [ ] [ ] lists = new int [ 2 * N - 1 ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    lists [ i ] = new int [ N ] ;
    for ( int i2 = 0 ;
    i2 < N ;
    i2 ++ ) {
      lists [ i ] [ i2 ] = testCase [ i2 ] ;
    }
  }
  final int [ ] count = new int [ N ] ;
  return Arrays . toString ( lists ) ;
}
