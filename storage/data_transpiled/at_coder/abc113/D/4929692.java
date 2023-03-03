public static int H = Integer . parseInt ( input ) {
  int W = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] dp = new int [ W ] [ H + 1 ] ;
  for ( int i = 0 ;
  i < H + 1 ;
  i ++ ) {
    dp [ i ] [ 0 ] = 1 ;
  }
  int P = 10 * 9 + 7 ;
  /* Check the length of the list */
  for ( int i = 0 ;
  i < dp . length - 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < dp [ i ] . length ;
    j ++ ) {
      if ( dp [ i + 1 ] [ j ] + dp [ i ] [ j ] == 2 ) {
        return false ;
      }
    }
    return true ;
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
          tmp [ k ] = j >> k & 1 ;
        }
        if ( check ( tmp ) ) {
          if ( w - 1 >= 0 && ( j >> ( w - 1 ) ) & 1 == 1 ) X ++ ;
          else if ( w <= W - 2 && j >> w & 1 == 1 ) Z ++ ;
          else Y ++ ;
        }
        else continue ;
      }
      if ( w - 1 >= 0 ) dp [ i ] [ w - 1 ] = ( dp [ i ] [ w - 1 ] + dp [ i - 1 ] [ w ] * X ) % P ;
      dp [ i ] [ w ] = ( dp [ i ] [ w ] + dp [ i - 1 ] [ w ] * Y ) % P ;
      if ( w + 1 <= W - 1 ) dp [ i ] [ w + 1 ] = ( dp [ i ] [ w + 1 ] + dp [ i - 1 ] [ w ] * Z ) % P ;
    }
  }
  System . out . println ( dp [ H ] [ K - 1 ] ) ;
  return H ;
}
