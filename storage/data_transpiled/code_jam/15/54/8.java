static final String [ ] [ ] simplify ( int [ ] [ ] ef , int d ) {
  final String [ ] [ ] ef2 = new String [ ef . length ] [ ] ;
  for ( int i : xrange ( ef . length ) ) {
    final int e = ef [ i ] [ 0 ] ;
    final int f = ef [ i ] [ 1 ] ;
    if ( f == 0 ) {
      continue ;
    }
    ef2 [ i ] = ef [ i ] ;
    for ( int j = 0 ;
    j < ef . length ;
    j ++ ) {
      if ( ef [ j ] [ 0 ] != e + d ) {
        continue ;
      }
      ef [ j ] [ 1 ] -= f ;
    }
  }
  return ef2 ;
}
