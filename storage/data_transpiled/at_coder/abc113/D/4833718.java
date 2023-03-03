static final int MOD = 1000000007 ;
int [ ] [ ] solve ( int H , int W , int K ) {
  int [ ] [ ] comb_ = new int [ W ] [ W ] ;
  comb_ [ 0 ] = new int [ ] {
    0 , 1 }
    ;
    for ( int i = 1 ;
    i < W ;
    i ++ ) comb_ [ i ] = new int [ ] {
      comb_ [ i - 1 ] [ 1 ] , Integer . valueOf ( comb_ [ i - 1 ] ) }
      ;
      int [ ] [ ] comb = new int [ W ] [ ] ;
      for ( int i = 0 ;
      i < comb_ . length ;
      i ++ ) comb [ i ] = new int [ ] {
        comb_ [ i ] [ 0 ] + comb_ [ i ] [ 1 ] }
        ;
        int [ ] [ ] dp = new int [ H + 1 ] [ W ] ;
        for ( int i = 0 ;
        i < H + 1 ;
        i ++ ) dp [ i ] [ 0 ] [ 1 ] = 1 ;
        for ( int h = 1 ;
        h <= H ;
        h ++ ) {
          for ( int w = 0 ;
          w < W ;
          w ++ ) dp [ h ] [ w ] [ 0 ] = dp [ h - 1 ] [ w ] [ 1 ] ;
          for ( int w = 0 ;
          w < W ;
          w ++ ) {
            dp [ h ] [ w ] [ 1 ] += dp [ h ] [ w ] [ 0 ] * comb [ Math . max ( 0 , w - 1 ) ] * comb [ Math . max ( 0 , W - w - 2 ) ] ;
            if ( w > 0 ) dp [ h ] [ w ] [ 1 ] += dp [ h ] [ w - 1 ] [ 0 ] * comb [ Math . max ( 0 , w - 2 ) ] * comb [ Math . max ( 0 , W - w - 2 ) ] ;
            if ( w < W - 1 ) dp [ h ] [ w ] [ 1 ] += dp [ h ] [ w + 1 ] [ 0 ] * comb [ Math . max ( 0 , w - 1 ) ] * comb [ Math . max ( 0 , W - w - 3 ) ] ;
          }
        }
        int ret = dp [ H ] [ K - 1 ] [ 1 ] % MOD ;
        System . out . println ( ret ) ;
        return ret ;
      }
      