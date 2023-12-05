public static int [ ] fCalcCost ( int iN , int iX ) {
  int [ ] aX = new int [ iN ] ;
  for ( int i = 0 ;
  i < iN ;
  ++ i ) {
    aX [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] aCum = new int [ iN ] ;
  aCum [ 0 ] = aX [ 0 ] ;
  for ( int i = 1 ;
  i < iN ;
  ++ i ) {
    aCum [ i ] = aCum [ i - 1 ] + aX [ i ] ;
  }
  /* Compute cost */
  int iN = iN ;
  int iX = iX ;
  int [ ] aCum = new int [ iN ] ;
  for ( int i = 2 ;
  i < iN ;
  ++ i ) {
    aCum [ i ] = ( iN + iK ) * iX + 5 * aCum [ i - 1 ] + Math . pow ( 2 * aCum [ i * iK - 1 ] , 2 ) ;
  }
  int iTotalCost = fCalcCost ( iN , iX , aCum , 1 ) ;
  int iULim = iN + 1 ;
  for ( int iK = 2 ;
  iULim <= iN ;
  ++ iK ) {
    int iThisCost = fCalcCost ( iN , iX , aCum , iK ) ;
    if ( iThisCost > iTotalCost ) {
      break ;
    }
    else {
      iTotalCost = iThisCost ;
    }
  }
  System . out . println ( iTotalCost ) ;
  return aCum ;
}
