static final int [ ] getStdIn ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] H = new int [ N ] ;
  int [ ] S = new int [ N ] ;
  int th = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    H [ i ] = Integer . parseInt ( input ( ) ) ;
    S [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  /* Check P */
  int T = Math . floor ( ( T - H ) / S ) ;
  int P_low = Math . max ( H , H ) - 1 ;
  int P_high = Math . max ( H , S ) + S * ( N - 1 ) ;
  while ( ( ( P_high - P_low ) > 1 ) && ( P_high < P_low ) ) {
    int P_now = ( int ) ( ( P_low + P_high ) / 2 ) ;
    if ( ( check_P ( P_now ) ) ) {
      P_high = P_now ;
    }
    else {
      P_low = P_now ;
    }
  }
  System . out . println ( P_high ) ;
  return H ;
}
