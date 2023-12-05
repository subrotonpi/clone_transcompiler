public static int H = Integer . parseInt ( input ) {
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int MOD = 10 * 9 + 7 ;
  {
    int [ ] X = {
      1 , 2 , 3 , 5 , 8 , 13 , 21 , 34 }
      ;
      if ( X [ 0 ] >= 0 ) {
        return X [ 1 ] ;
      }
      else {
        return 1 ;
      }
    }
    int [ ] [ ] dp = new int [ H + 1 ] [ W ] ;
    dp [ 0 ] [ 0 ] = 1 ;
    for ( int h = 0 ;
    h < H ;
    h ++ ) {
      for ( int w = 0 ;
      w < W ;
      w ++ ) {
        dp [ h + 1 ] [ w ] += dp [ h ] [ w ] * ( transition ( w - 1 ) * transition ( W - w - 2 ) ) ;
        dp [ h + 1 ] [ w + 1 ] %= MOD ;
      }
      if ( w - 1 >= 0 ) {
        dp [ h + 1 ] [ w - 1 ] += dp [ h ] [ w ] * ( transition ( w - 2 ) * transition ( W - w - 2 ) ) ;
        dp [ h + 1 ] [ w - 1 ] %= MOD ;
      }
    }
    System . out . println ( dp [ H ] [ K - 1 ] ) ;
    return H ;
  }
  