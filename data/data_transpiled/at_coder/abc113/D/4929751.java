public static int H = Integer . parseInt ( input ) {
  int W = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] dp = new int [ W ] [ H + 1 ] ;
  dp [ 0 ] [ 0 ] = 1 ;
  int P = 10 * 9 + 7 ;
  /* Check the length of the dp */
  for ( int i = 0 ;
  i < dp . length - 1 ;
  i ++ ) {
    if ( dp [ i + 1 ] [ 0 ] + dp [ i ] [ 1 ] == 2 ) {
      return false ;
    }
  }
  for ( int i = 1 ;
  i <= H ;
  i ++ ) {
    for ( int w = 0 ;
    w < W ;
    w ++ ) {
      int X = 0 , Y = 0 , Z = 0 ;
      for ( int j = 0 ;
      j < 2 * ( W - 1 ) ;
      j ++ ) {
        int [ ] tmp = new int [ W - 1 ] ;
        for ( int k = 0 ;
        k < W - 1 ;
        k ++ ) {
          tmp [ X ++ ] = j >> k & 1 ;
        }
        if ( check ( tmp ) ) {
          if ( w - 1 >= 0 && ( j >> ( w - 1 ) ) & 1 == 1 ) {
            dp [ i ] [ w - 1 ] += dp [ i - 1 ] [ w ] ;
            dp [ i ] [ w - 1 ] %= P ;
          }
          else if ( w <= W - 2 && j >> w & 1 == 1 ) {
            dp [ i ] [ w + 1 ] += dp [ i - 1 ] [ w ] ;
            dp [ i ] [ w + 1 ] %= P ;
          }
          else {
            dp [ i ] [ w ] += dp [ i - 1 ] [ w ] ;
            dp [ i ] [ w ] %= P ;
          }
        }
      }
    }
  }
  System . out . println ( dp [ H ] [ K - 1 ] ) ;
  return H ;
}
