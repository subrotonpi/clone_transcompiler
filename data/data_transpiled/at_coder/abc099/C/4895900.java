public static int [ ] getdp ( ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] dp = new int [ N + 1 ] ;
  dp [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 6 * i ;
    j ++ ) {
      for ( int i = 0 ;
      i < 7 ;
      i ++ ) {
        if ( i + j <= N ) {
          dp [ i + j ] = Math . min ( dp [ i + j ] , dp [ i ] + 1 ) ;
        }
      }
    }
  }
  System . out . println ( dp [ dp . length - 1 ] ) ;
  return dp ;
}
