public static int [ ] fSearchLowCost ( int iN , int iX ) {
  int iN = Integer . parseInt ( input ( ) ) ;
  int iX = Integer . parseInt ( input ( ) ) ;
  int [ ] aCum = new int [ iN ] ;
  for ( int i = 0 ;
  i < iN ;
  i ++ ) {
    aCum [ i ] = aCum [ iN ] + Integer . parseInt ( input ( ) ) ;
  }
  /* fCeil */
  int iT = - 1 * iT / iR * - 1 ;
  /* calc cost */
  int iN = ( iN + iK ) * iX + 5 * aCum [ iN ] ;
  for ( int i = 2 ;
  i < iN ;
  i ++ ) {
    iCost += 2 * aCum [ iN - i * iK ] ;
  }
  /* search low cost */
  if ( iU - iL <= iX ) {
    int iTotalCost = Math . min ( iLCost , iUCost ) ;
    for ( int iK = iL + 1 ;
    iK < iU ;
    iK ++ ) {
      iTotalCost = Math . min ( iTotalCost , fCalcCost ( iN , iX , aCum , iK ) ) ;
    }
    return iTotalCost ;
  }
  else {
    int iM = ( iU + iL ) / 2 ;
    int iMCost = fCalcCost ( iN , iX , aCum , iM ) ;
    if ( iLCost < iUCost ) {
      return fSearchLowCost ( iL , iLCost , iM , iMCost , iN , iX , aCum ) ;
    }
    else {
      return fSearchLowCost ( iM , iMCost , iU , iUCost , iN , iX , aCum ) ;
    }
  }
  if ( 1 < iN ) {
    int iULim = fCeil ( iN , 2 ) + 1 ;
    int iLLim = 1 ;
    System . out . println ( fSearchLowCost ( iLLim , iX , aCum , iLLim ) + " " + iULim + " " + fCalcCost ( iN , iX , aCum , iULim ) ) ;
  }
  else {
    System . out .