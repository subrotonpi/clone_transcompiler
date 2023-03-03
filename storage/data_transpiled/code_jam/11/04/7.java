static void print ( double [ ] [ ] args ) {
  final int t = Integer . parseInt ( args [ 0 ] [ 1 ] ) ;
  for ( int testNr = 1 ;
  testNr <= t ;
  testNr ++ ) {
    System . out . println ( "Case #" + testNr + ":" ) ;
    final int n = Integer . parseInt ( args [ 0 ] [ 1 ] ) ;
    final int [ ] a = ArrayUtil . toIntArray ( args ) ;
    int nf = 0 ;
    for ( int i = 0 ;
    i < a . length ;
    i ++ ) {
      if ( a [ i ] + 1 != args [ i ] [ 0 ] ) {
        nf ++ ;
      }
    }
    System . out . println ( nf ) ;
  }
}
