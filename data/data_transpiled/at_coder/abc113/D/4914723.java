public static int [ ] [ ] getDigits ( ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int r = 10 * 9 + 7 ;
  int [ ] [ ] dp = new int [ W ] [ H + 1 ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      dp [ i ] [ j ] = 0 ;
    }
    dp [ 0 ] [ 0 ] = 1 ;
    int [ ] num = {
      1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 }
      ;
      if ( W != 1 ) {
        for ( int i = 0 ;
        i < H ;
        i ++ ) {
          for ( int j = 0 ;
          j < W ;
          j ++ ) {
            if ( j == 0 ) {
              dp [ i + 1 ] [ j ] = ( num [ W - 1 ] * dp [ i ] [ j ] + num [ W - 2 ] * dp [ i ] [ j + 1 ] ) % r ;
            }
            else if ( j == W - 1 ) {
              dp [ i + 1 ] [ j ] = ( num [ W - 1 ] * dp [ i ] [ j ] + num [ W - 2 ] * dp [ i ] [ j - 1 ] ) % r ;
            }
            else {
              dp [ i + 1 ] [ j ] = ( num [ j ] * num [ W - j - 1 ] * dp [ i ] [ j ] + num [ j - 1 ] * num [ W - j - 1 ] * dp [ i ] [ j - 1 ] + num [ j ] * num [ W - j - 2 ] * dp [ i ] [ j + 1 ] ) % r ;
            }
          }
        }
      }
      System . out . println ( dp [ H ] [ K - 1 ] ) ;
    }
    else {
      System . out . println ( 1 ) ;
    }
    return dp ;
  }
  