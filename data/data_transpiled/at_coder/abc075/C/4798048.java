static final int [ ] [ ] solve ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int m = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] vertex = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) vertex [ i ] = Arrays . stream ( l . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  /* Find the root node */
  if ( root [ 0 ] == root [ 0 ] ) {
    return root [ 0 ] ;
  }
  root [ 0 ] = find ( root [ 0 ] ) ;
  /* Check the size of the root node */
  if ( size [ 0 ] >= size [ 1 ] ) {
    root [ 0 ] = size [ 1 ] ;
  }
  /* Union the root node */
  int x = find ( root [ 0 ] ) ;
  int y = find ( root [ 1 ] ) ;
  if ( size [ 0 ] == size [ 1 ] ) {
    size [ 0 ] ++ ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    root = new int [ n + 1 ] ;
    size [ 0 ] = 0 ;
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      if ( j != i ) {
        if ( check ( vertex [ j ] [ 0 ] , vertex [ j ] [ 1 ] ) ) {
        }
        else {
          union ( vertex [ j ] [ 0 ] , vertex [ j ] [ 1 ] ) ;
        }
      }
    }
    for ( int j = 1 ;
    j < n ;
    j ++ ) {
      if ( check ( j , j + 1 ) == true ) {
      }
      else {
        ans ++ ;
        break ;
      }
    }
  }
  System . out . println ( ans ) ;
  return null ;
}
