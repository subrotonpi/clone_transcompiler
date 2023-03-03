public static int getH ( ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  double minScore = 10 * 27 ;
  for ( int i = 1 ;
  i < H ;
  i ++ ) {
    if ( W % 2 == 0 ) {
      int S1 = i * W / 2 ;
      int S2 = ( H - i ) * W ;
      minScore = Math . min ( Math . abs ( S1 - S2 ) , minScore ) ;
    }
    else {
      int S1 = i * ( W - 1 ) / 2 ;
      int S2 = i * ( W + 1 ) / 2 ;
      int S3 = ( H - i ) * W ;
      int S4 = Math . max ( S1 , S2 , S3 ) ;
      int S5 = Math . min ( S1 , S2 , S3 ) ;
      minScore = Math . min ( S4 - S5 , minScore ) ;
    }
  }
  for ( int i = 1 ;
  i < W ;
  i ++ ) {
    if ( H % 2 == 0 ) {
      int S1 = i * H / 2 ;
      int S2 = ( W - i ) * H ;
      minScore = Math . min ( Math . abs ( S1 - S2 ) , minScore ) ;
    }
    else {
      int S1 = i * ( H - 1 ) / 2 ;
      int S2 = i * ( H - 1 ) ;
      int S3 = i * ( W - 1 ) ;
      minScore = Math . min ( S1 - S2 , minScore ) ;
    }
  }
  return minScore ;
}
