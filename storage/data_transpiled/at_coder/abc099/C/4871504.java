public static int N = Integer . parseInt ( input ) {
  int [ ] dp = new int [ N + 10 ] ;
  dp [ 0 ] = 0 ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    for ( int p = 0 ;
    p < N + 1 ;
    p ++ ) {
      p = 6 * p ;
      if ( p > N ) break ;
      dp [ i ] = Math . min ( dp [ i ] , dp [ i - p ] + 1 ) ;
    }
  }
  System . out . println ( dp [ N ] ) ;
  return dp [ N ] ;
}
