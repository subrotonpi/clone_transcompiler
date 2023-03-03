static void c ( ) {
  final int t = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int i = 0 ;
  i < xrange . size ( t ) ;
  i ++ ) {
    final int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    final int [ ] arr = ArrayUtil . toIntArray ( new int [ n ] ) ;
    Arrays . sort ( arr ) ;
    assert arr . length == n ;
    int count = 0 ;
    final boolean [ ] seen = new boolean [ n ] ;
    for ( int ix = 0 ;
    ix < n ;
    ix ++ ) {
      seen [ ix ] = true ;
    }
    for ( int ix = 0 ;
    ix < n ;
    ix ++ ) {
      int x = arr [ ix ] ;
      if ( x == ix ) continue ;
      while ( ! seen [ x ] ) {
        seen [ x ] = true ;
        x = arr [ ix ] ;
        count ++ ;
      }
    }
    System . out . println ( "Case #" + ( i + 1 ) + ": " + count ) ;
  }
}
