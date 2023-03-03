public static int [ ] [ ] dfs ( int n , int m ) {
  for ( int item : input . split ( " " ) ) {
    int [ ] [ ] edge = new int [ n ] [ m ] ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      int a = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
      int b = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
      edge [ a - 1 ] [ b - 1 ] = 1 ;
      edge [ b - 1 ] [ a - 1 ] = 1 ;
    }
  }
  int ans = 0 ;
  int order = 0 ;
  int [ ] pre = new int [ n ] ;
  int [ ] low = new int [ n ] ;
  /* dfs(node, prev) */
  pre [ order ] = 0 ;
  low [ order ] = 1 ;
  for ( int to = 0 ;
  to < n ;
  to ++ ) {
    if ( to == prev || edge [ node ] [ to ] == 0 ) {
      continue ;
    }
    if ( pre [ to ] == - 1 ) {
      int ret = dfs ( to , node ) ;
      low [ node ] = Math . min ( low [ node ] , ret ) ;
    }
    else {
      low [ node ] = Math . min ( low [ node ] , pre [ to ] ) ;
    }
    if ( pre [ node ] < low [ to ] ) {
      ans ++ ;
    }
  }
  return low [ node ] ;
}
