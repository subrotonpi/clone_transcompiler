static private int [ ] [ ] findCrossing ( int [ ] [ ] prices ) throws IOException {
  final int [ ] [ ] res = new int [ prices . length ] [ ] ;
  for ( int i = 0 ;
  i < prices . length ;
  i ++ ) {
    final int [ ] pi = prices [ i ] ;
    final int [ ] x = new int [ prices . length ] ;
    res [ i ] = x ;
    for ( int j = 0 ;
    j < prices . length ;
    j ++ ) {
      final int [ ] pj = prices [ j ] ;
      boolean cross = false ;
      final int where = Integer . compare ( pi [ 0 ] , pj [ 0 ] ) ;
      cross = cross || where == 0 ;
      cross = cross || ArrayUtil . indexOf ( pi , pj ) != - 1 ;
      x [ i ] = cross ;
    }
  }
  return res ;
}
