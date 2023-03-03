static final int [ ] [ ] getDFs ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  int N = Integer . parseInt ( input ) ;
  Map < Integer , Integer > [ ] graph = new Map [ N ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    graph [ i ] = new HashMap < > ( ) ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      graph [ i ] . put ( j , i ) ;
    }
  }
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    graph [ a ] [ b ] = 1 ;
    graph [ b ] [ a - 1 ] = 1 ;
  }
  int mod = 10 * 9 + 7 ;
  int [ ] [ ] dp = new int [ N ] [ 2 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    dp [ i ] [ 0 ] = 0 ;
    for ( int j = 0 ;
    j < graph [ i ] . size ( ) ;
    j ++ ) {
      int to = graph [ i ] . get ( j ) ;
      if ( to != from ) {
        dp [ i ] [ 0 ] = dp [ i ] [ 0 ] * ( dfs_w ( i , to ) + dfs_b ( i , to ) ) ;
        dp [ i ] [ 0 ] %= mod ;
      }
    }
  }
  /* dp[N][1] = 0; */
  System . out . println ( ( dfs_b ( - 1 , 0 ) + dfs_w ( - 1 , 0 ) ) % mod ) ;
}
