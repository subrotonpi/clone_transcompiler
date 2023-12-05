public static void UnionFind ( ) {
  int [ ] parent = new int [ n ] ;
  for ( int i = 0 ;
  i < parent . length ;
  i ++ ) parent [ i ] = - 1 ;
  /* root */
  if ( parent [ i ] < 0 ) {
    /* return */
  }
  else {
    parent [ i ] = root ( parent [ i ] ) ;
    /* union */
  }
  /* return */
  boolean result = true ;
  int rootX = parent [ 0 ] ;
  int rootY = parent [ 1 ] ;
  if ( rootX == rootY ) {
    return false ;
  }
  if ( result ) {
    return true ;
  }
}
