public static int [ ] fCalcCost ( int iN , int iX , int [ ] aCum , int iK ) {
  int iN = Integer . parseInt ( input ( ) ) ;
  int iX = Integer . parseInt ( input ( ) ) ;
  int [ ] aCum = new int [ iN ] ;
  for ( int i = 0 ;
  i < iN ;
  ++ i ) {
    aCum [ i ] = aCum [ i ] + Integer . parseInt ( input ( ) ) ;
  }
  /* TODO Auto-generated method stub */
  int iCost = ( iN + iK ) * iX + 5 * aCum [ iN ] ;
  for ( int iK = 2 ;
  iK <= iK ;
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
