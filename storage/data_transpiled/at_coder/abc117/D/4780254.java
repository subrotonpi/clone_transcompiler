public static int [ ] [ ] getDigits ( String input ) {
  int n = Integer . parseInt ( input ) , k = Integer . parseInt ( input ) ;
  int [ ] a = Integer . parseInt ( input ) ;
  int [ ] [ ] dp = new int [ 42 ] [ 42 ] ;
  for ( int i = 1 ;
  i < 42 ;
  i ++ ) {
    if ( dp [ i - 1 ] [ 1 ] == 1 ) dp [ i ] [ 1 ] = 1 ;
    int ctr = 0 ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( ( a [ j ] >> ( 41 - i ) ) & 1 == 1 ) ctr ++ ;
    }
    if ( ctr >= n - ctr ) {
      dp [ i ] [ 0 ] = dp [ i - 1 ] [ 0 ] + ctr * ( 2 * ( 41 - i ) ) ;
      if ( ( k >> ( 41 - i ) ) & 1 == 1 ) dp [ i ] [ 0 ] = dp [ i - 1 ] [ 0 ] + ctr * ( 2 * ( 41 - i ) ) ;
    }
  }
  System . out . println ( dp [ 41 ] [ 0 ] ) ;
  return dp ;
}
