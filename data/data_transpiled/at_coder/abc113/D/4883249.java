public static int [ ] [ ] convert ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  int K = Integer . parseInt ( input ) ;
  int MOD = 10 * 9 + 7 ;
  int [ ] [ ] dp = new int [ H + 1 ] [ W ] ;
  dp [ 0 ] [ 0 ] = 1 ;
  for ( int h = 0 ;
  h < H ;
  h ++ ) {
    for ( int x = 0 ;
    x < W ;
    x ++ ) {
      for ( int b = 0 ;
      b < 2 * ( W - 1 ) ;
      b ++ ) {
        if ( ! "11" . equals ( Integer . toHexString ( b ) ) ) {
          if ( x >= 1 && ( b >> ( x - 1 ) ) & 1 ) {
            dp [ h + 1 ] [ x - 1 ] += dp [ h ] [ x ] ;
            dp [ h + 1 ] [ x - 1 ] %= MOD ;
          }
          else if ( x <= W - 2 && ( b >> x ) & 1 ) {
            dp [ h + 1 ] [ x + 1 ] += dp [ h ] [ x ] ;
            dp [ h + 1 ] [ x ] %= MOD ;
          }
          else {
            dp [ h + 1 ] [ x ] += dp [ h ] [ x ] ;
            dp [ h + 1 ] [ x ] %= MOD ;
          }
        }
      }
    }
  }
  System . out . println ( dp [ H ] [ K - 1 ] ) ;
  return dp ;
}
