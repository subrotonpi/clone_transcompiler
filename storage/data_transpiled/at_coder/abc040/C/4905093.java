public static int [ ] getDigits ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = Lists . newArrayList ( ) . stream ( ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int INF = 10 * 9 ;
  int [ ] dp = new int [ N ] ;
  dp [ 0 ] = INF ;
  for ( int i = 0 ;
  i <= N ;
  i ++ ) {
    if ( i + 1 < N ) {
      dp [ i + 1 ] = Math . min ( dp [ i + 1 ] , dp [ i ] + Math . abs ( a [ i + 1 ] - a [ i ] ) ) ;
    }
    if ( i + 2 < N ) {
      dp [ i + 2 ] = Math . min ( dp [ i + 2 ] , dp [ i ] + Math . abs ( a [ i + 2 ] - a [ i ] ) ) ;
    }
  }
  System . out . println ( dp [ N - 1 ] ) ;
  return dp ;
}
