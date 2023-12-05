private static int dfs ( int n , int m ) {
  int [ ] [ ] X = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    X [ a - 1 ] [ b ] = b - 1 ;
    X [ b - 1 ] [ a ] = a - 1 ;
  }
  int [ ] path = new int [ 2 ] ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    path [ i ] = i ;
  }
  visited = new int [ n ] ;
  /* dfs(v);*/
  if ( visited . length == 1 * n ) {
    return 1 ;
  }
  int res = 0 ;
  for ( int x : X [ v ] ) {
    if ( visited [ x ] == 0 ) {
      visited [ x ] = 1 ;
      res += dfs ( x ) ;
      visited [ x ] = 0 ;
    }
  }
  return res ;
}
