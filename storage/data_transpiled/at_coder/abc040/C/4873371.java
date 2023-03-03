static final int [ ] getStdDev ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] dp = new int [ N ] ;
  dp [ 0 ] = 0 ;
  dp [ 1 ] = Math . abs ( a [ 1 ] - a [ 0 ] ) ;
  /* dp[0] = 0;*/
  dp [ N ] = Math . min ( dp [ N - 1 ] + Math . abs ( a [ N - 1 ] - a [ N - 1 ] ) , dp [ N - 2 ] + Math . abs ( a [ N - 2 ] - a [ N - 2 ] ) ) ;
  return dp ;
}
