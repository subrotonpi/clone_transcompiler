public static int N = Integer . parseInt ( input ) {
  int [ ] R = new int [ N ] ;
  for ( int i = 0 ;
  i < R . length ;
  i ++ ) {
    R [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  /* Sort the list */
  if ( R . length == 1 ) {
    return R [ 0 ] ;
  }
  int mid = R . length / 2 ;
  /* Sort the list */
  if ( R . length == mid ) {
    return R [ 0 ] ;
  }
  int [ ] result = new int [ M ] ;
  int i = 0 ;
  int j = 0 ;
  int m = R . length ;
  int n = R . length ;
  while ( ( i + j < m + n ) && ( j < n ) ) {
    if ( j == n || ( i < m && list1 [ i ] < list2 [ j ] ) ) {
      result [ i ] = list1 [ i ++ ] ;
    }
    else {
      result [ j ] = list2 [ j ++ ] ;
    }
  }
  return result [ 0 ] ;
}
