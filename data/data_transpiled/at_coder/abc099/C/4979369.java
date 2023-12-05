public static int N = Integer . parseInt ( input ) {
  int [ ] dp = new int [ N + 1 ] ;
  dp [ 0 ] = 0 ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    dp [ i ] = dp [ i - 1 ] + 1 ;
    for ( int j = 6 ;
    j <= 9 ;
    j ++ ) {
      int now = j ;
      while ( now <= i ) {
        if ( i - now >= 0 ) dp [ i ] = Math . min ( dp [ i - now ] + 1 , dp [ i ] ) ;
        now *= j ;
      }
    }
  }
  return dp [ dp . length - 1 ] ;
}
