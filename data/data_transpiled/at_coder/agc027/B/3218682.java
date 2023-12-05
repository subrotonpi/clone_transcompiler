public static int [ ] fSearchLowCost ( int iN , int iX ) {
  int iN = Integer . parseInt ( input ( ) ) ;
  int [ ] aCum = new int [ iN ] ;
  for ( int i = 0 ;
  i < iN ;
  ++ i ) {
    aCum [ i ] = aCum [ iN - i ] + Integer . parseInt ( input ( ) ) ;
  }
  /* C++ C */
  /* C++ C */
  /* C++ C */
  /* C++ C */
  /* C++ C */
  /* C++ C */
  int iN = 0 ;
  int iX = 0 ;
  int [ ] aCum = new int [ iN ] ;
  for ( int i = 0 ;
  i < iN ;
  ++ i ) {
    aCum [ i ] = aCum [ i ] + aCum [ i ] ;
  }
  /* C++ C */
  int iL = iN + iK ;
  int iU = iX + 5 * iX ;
  int iLLim = 1 ;
  /* C++ C */
  int iL = iL + iL ;
  int iL = iU - iL ;
  if ( iL < 2 * iX ) {
    iL = Math . min ( iL , iULim ) ;
    for ( int iK = iL + 1 ;
    iK < iU ;
    ++ iK ) {
      int iThisCost = fCalcCost ( iN , iX , aCum , iK ) ;
      iL = Math . min ( iThisCost , iL ) ;
    }
    return iL ;
  }
  else {
    int iM = ( iU + iL ) / 2 ;
    int iMCost = fCalcCost ( iN , iX , aCum , iM ) ;
    if ( iLCost < iUCost ) {
      /* C++ C */
      return fSearchLowCost ( iL , iLCost , iM , iMCost , iN , iX , aCum ) ;
    }
    else {
      System . out . println ( 2 * iX + 5 * aX [ 0 ] ) ;
    }
  }
  /* C++ C */
  return aCum ;
}
