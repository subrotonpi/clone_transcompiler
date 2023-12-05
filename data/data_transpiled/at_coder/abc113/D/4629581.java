public static int [ ] [ ] convert ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  int K = Integer . parseInt ( input ) ;
  int mod = 10 * 9 + 7 ;
  int [ ] [ ] dp = new int [ H + 1 ] [ W ] ;
  dp [ 0 ] [ 0 ] = 1 ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      for ( int k = 0 ;
      k < 1 << ( W - 1 ) ;
      k ++ ) {
        boolean flag = true ;
        if ( "11" . equals ( Integer . toHexString ( k ) ) ) flag = false ;
        if ( flag ) {
          if ( j >= 1 && ( k >> ( j - 1 ) ) & 1 ) {
            dp [ i + 1 ] [ j - 1 ] += dp [ i ] [ j ] ;
            dp [ i + 1 ] [ j - 1 ] %= mod ;
          }
          else if ( j <= W - 1 && ( k >> j ) & 1 ) {
            dp [ i + 1 ] [ j ] += dp [ i ] [ j ] ;
            dp [ i + 1 ] [ j ] %= mod ;
          }
        }
      }
    }
  }
  System . out . println ( dp [ dp [ dp . length - 1 ] [ K - 1 ] ] ) ;
  return dp ;
}
