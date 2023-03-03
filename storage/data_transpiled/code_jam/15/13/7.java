static final int cases = Integer . parseInt ( readLine ( ) ) ;
for ( int c : xrange ( cases ) ) {
  int treeCount = Integer . parseInt ( readLine ( ) ) ;
  int [ ] [ ] dims = new int [ treeCount ] [ ] ;
  for ( int t : xrange ( treeCount ) ) {
    dims [ t ] = ArrayUtil . parseInt ( readLine ( ) . split ( " " ) ) ;
  }
  System . out . println ( "Case #" + ( c + 1 ) + ":" ) ;
  for ( int i = 0 ;
  i < dims . length ;
  i ++ ) {
    int [ ] p = dims [ i ] ;
    List < int [ ] > rest = Arrays . stream ( dims ) . filter ( d -> d [ 0 ] != p [ 0 ] || d [ 1 ] != p [ 1 ] ) . collect ( Collectors . toList ( ) ) ;
    double [ ] angles = new double [ rest . size ( ) ] ;
    for ( int j = 0 ;
    j < rest . size ( ) ;
    j ++ ) {
      angles [ j ] = Math . atan2 ( rest . get ( j ) - p [ 1 ] , rest . get ( j ) - p [ 0 ] ) ;
    }
    angles = angles . clone ( ) ;
    angles [ 0 ] = angles [ 1 ] + 2 * Math . PI ;
    angles [ 1 ] = angles [ 2 ] + 4 * Math . PI ;
    Arrays . sort ( angles ) ;
    int end = 0 ;
    int minRemove = 999999999 ;
    for ( int start : xrange ( angles . length / 2 ) ) {
      while ( angles [ end ] < ( angles [ start ] + Math . PI - 1e-12 ) ) {
        end ++ ;
      }
      minRemove = Math . min ( minRemove , end - start - 1 ) ;
    }
    if ( minRemove == 999999999 ) {
      minRemove = 0 ;
    }
    System . out . println ( minRemove ) ;
  }
}
