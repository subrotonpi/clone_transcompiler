public static long speed ( long [ ] speeds ) {
  long [ ] table = new long [ speeds . length ] ;
  table [ 0 ] = 1 ;
  for ( int i = 1 ;
  i < speeds . length ;
  i ++ ) {
    table [ i ] = 1 ;
    for ( int j = 0 ;
    j <= i ;
    j ++ ) {
      if ( speeds [ i ] > speeds [ j ] ) {
        table [ i ] += table [ j ] ;
      }
    }
  }
  return Long . bitCount ( table ) % 1000000007 ;
}
