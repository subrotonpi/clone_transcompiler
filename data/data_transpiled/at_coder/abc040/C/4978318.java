public static int N ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = Lists . newArrayList ( ) . stream ( ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int [ ] dp = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( i == 1 ) {
      dp [ 1 ] = Math . abs ( a [ i ] - a [ i - 1 ] ) ;
    }
    else if ( i > 1 ) {
      dp [ i ] = Math . min ( dp [ i - 1 ] + Math . abs ( a [ i ] - a [ i - 1 ] ) , dp [ i - 2 ] + Math . abs ( a [ i ] - a [ i - 2 ] ) ) ;
    }
  }
  return dp [ N - 1 ] ;
}
