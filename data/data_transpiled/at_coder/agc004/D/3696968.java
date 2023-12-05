public static final int [ ] getBinaryArray ( ) {
  System . setMemory ( 200000 ) ;
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int k = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  int ans = 0 ;
  if ( a [ 0 ] != 1 ) {
    a [ 0 ] = 1 ;
    ans ++ ;
  }
  b = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) b [ i ] = new int [ n ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) b [ a [ i ] - 1 ] = i ;
  huka = 0 ;
  kyo = new double [ n ] ;
  z = new int [ n ] ;
  /* dfs */
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    kyo [ i ] = i ;
    z [ i ] = i ;
    for ( int j = 0 ;
    j < b [ i ] ;
    j ++ ) dfs ( b [ i ] , j + 1 ) ;
  }
  /* dfs */
  for ( int i = n - 1 ;
  i >= k ;
  i -- ) {
    if ( kyo [ i ] <= k - 1 ) return null ;
    if ( y == k - 1 && i != 0 ) {
      kyo [ i ] = 0 ;
      ans ++ ;
      return null ;
    }
    kyo [ i ] = 0 ;
    dfs2 ( a [ i ] - 1 , y + 1 ) ;
  }
  for ( int i = n - 1 ;
  i >= k ;
  i -- ) {
    for ( int j = 0 ;
    j < z [ i ] ;
    j ++ ) dfs2 ( z [ i ] , 0 ) ;
  }
  System . out . println ( ans ) ;
  return null ;
}
