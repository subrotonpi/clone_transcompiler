static int numWays ( int H , int W , List < Integer > rocks ) throws IOException {
  final int N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int nc = xrange ( H ) ;
  nc <= N ;
  nc ++ ) {
    final int [ ] [ ] mat = new int [ N ] [ ] ;
    for ( int c = xrange ( W ) ;
    c <= xrange ( H ) ;
    c ++ ) {
      mat [ c ] [ xrange ( H ) ] = 0 ;
    }
    final boolean [ ] [ ] isrock = new boolean [ N ] [ ] ;
    for ( int c = xrange ( W ) ;
    c <= xrange ( H ) ;
    c ++ ) {
      isrock [ r ] [ c ] = true ;
    }
    mat [ 0 ] [ 0 ] = 1 ;
    for ( int c = xrange ( 1 , W ) ;
    c <= xrange ( H ) ;
    c ++ ) {
      for ( int r = xrange ( H ) ;
      r <= xrange ( c ) ;
      r ++ ) {
        if ( isrock [ r ] [ c ] ) continue ;
        if ( r >= 1 && c >= 2 ) {
          mat [ r ] [ c ] += mat [ r - 1 ] [ c - 2 ] ;
        }
        if ( r >= 2 && c >= 1 ) {
          mat [ r ] [ c ] += mat [ r - 2 ] [ c - 1 ] ;
        }
        mat [ r ] [ c ] = mat [ r ] [ c ] % 10007 ;
      }
    }
    return mat [ H - 1 ] [ W - 1 ] % 10007 ;
  }
  return N ;
}
