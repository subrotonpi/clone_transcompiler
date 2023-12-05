public static int countJump ( List < Integer > rightList , List < Integer > leftList , int L ) {
  int jumpCount = 0 ;
  if ( rightList . size ( ) == 0 ) {
    for ( int i = 0 ;
    i < leftList . size ( ) ;
    i ++ ) {
      int p = leftList . get ( i ) ;
      jumpCount += p - i - 1 ;
    }
  }
  else if ( leftList . size ( ) == 0 ) {
    for ( int i = 0 ;
    i < rightList . size ( ) ;
    i ++ ) {
      int p = rightList . get ( i ) ;
      jumpCount += L - p - i ;
    }
  }
  else {
    for ( int i = 0 ;
    i < rightList . size ( ) ;
    i ++ ) {
      int p = rightList . get ( rightList . size ( ) - 1 ) ;
      int i = leftList . get ( i ) ;
      jumpCount += p - leftList . get ( 0 ) - i ;
    }
    int headDiff = leftList . get ( 0 ) - rightList . get ( rightList . size ( ) - 1 ) - 1 ;
    int maxCnt = Math . max ( rightList . size ( ) , leftList . size ( ) ) ;
    jumpCount += headDiff * maxCnt ;
  }
  return jumpCount ;
}
