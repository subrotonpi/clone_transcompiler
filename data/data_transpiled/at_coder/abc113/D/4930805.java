static final int [ ] [ ] resize ( int H , int W , int K ) {
  Scanner input = new Scanner ( System . in ) ;
  int N = input . nextInt ( ) ;
  int [ ] [ ] dp = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    dp [ i ] [ 0 ] = - 1 ;
    dp [ i ] [ i ] = 1 ;
  }
  /* barcnt */
  switch ( N ) {
    case 0 : return 1 ;
    case 1 : return 1 ;
    case 2 : return 2 ;
    case 3 : return 3 ;
    case 4 : return 5 ;
    case 5 : return 8 ;
    case 6 : return 13 ;
    case 7 : return 21 ;
    default : return 0 ;
  }
  /* f */
  if ( K < 1 || K > W ) {
    return 0 ;
  }
  else {
    if ( dp [ H ] [ K ] != - 1 ) {
      return dp [ H ] [ K ] ;
    }
    else if ( H == 1 ) {
      switch ( K ) {
        case 1 : dp [ H ] [ K ] = barcnt ( W - 1 ) ;
        return dp [ H ] [ K ] ;
        case 2 : dp [ H ] [ K ] = barcnt ( W - 2 ) ;
        return dp [ H ] [ K ] ;
        default : dp [ H ] [ K ] = 0 ;
        return 0 ;
      }
    }
    else {
      dp [ H ] [ K ] = f ( H - 1 , K - 1 ) * barcnt ( Math . max ( 0 , K - 2 ) ) * barcnt ( Math . max ( 0 , W - K ) ) ;
      dp [ H ] [ K ] += f ( H - 1 , K ) * barcnt ( Math . max ( 0 , K - 1 ) ) * barcnt ( Math . max ( 0 , W - K ) ) * barcnt ( Math . max ( 0 , W - K ) ) ;
      dp [ H ] [ K ] %= 10 * 9 + 7 ;
      return dp [ H ] [ K ] ;
    }
  }
}
