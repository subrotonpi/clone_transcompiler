public static void main ( String [ ] in ) throws IOException {
  int T = Integer . parseInt ( in [ 0 ] ) ;
  for ( int z : xrange ( 1 , T + 1 ) ) {
    int P = ( Integer . parseInt ( in [ 0 ] . trim ( ) ) ) ;
    int Q = ( Integer . parseInt ( in [ 1 ] . trim ( ) ) ) ;
    int [ ] rels = new int [ Q + 1 ] ;
    rels [ 0 ] = 0 ;
    for ( int i = 0 ;
    i < Q ;
    i ++ ) {
      rels [ i ] = Integer . parseInt ( in [ i ] . trim ( ) ) ;
      rels [ i + 1 ] = P ;
    }
    int [ ] [ ] dp = new int [ Q + 1 ] [ Q + 1 ] ;
    for ( int i = 0 ;
    i < Q ;
    i ++ ) {
      dp [ i ] [ 0 ] = i + 1 ;
    }
    for ( int i = 0 ;
    i < Q + 1 ;
    i ++ ) {
      for ( int j = 0 ;
      j < Q - i + 1 ;
      j ++ ) {
        int cm = 2 * 100 ;
        int c = rels [ j + i + 1 ] - rels [ j ] - 2 ;
        for ( int k = 0 ;
        k < Q ;
        k ++ ) {
          cm = Math . min ( cm , c + dp [ j ] [ k ] + dp [ k ] [ j + i + 1 ] ) ;
        }
        dp [ j ] [ j + i + 1 ] = cm ;
      }
    }
    System . out . println ( "Case #" + z + ": " + dp [ 0 ] [ Q + 1 ] ) ;
  }
  if ( Class . forName ( "org.apache.commons.analysis.BinaryMatrixTest" ) . getMethod ( ) . invoke ( null ) ) {
  }
}
