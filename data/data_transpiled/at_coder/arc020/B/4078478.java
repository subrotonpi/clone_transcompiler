@ VisibleForTesting static long bStripe ( int N , long C , long [ ] A ) {
  List < Long > usedNumList = Lists . newArrayList ( ) ;
  for ( long i = 0 ;
  i < A . length ;
  i ++ ) {
    usedNumList . add ( i ) ;
  }
  if ( usedNumList . size ( ) == 1 ) {
    return C * ( A . length / 2 ) ;
  }
  long ans = Long . MAX_VALUE ;
  for ( long first : usedNumList ) {
    long second = A [ i ] ;
    long tmpCost = 0 ;
    for ( long k = 0 ;
    k < A . length ;
    k ++ ) {
      long a = A [ k ] ;
      if ( k % 2 == 0 && a != first ) tmpCost += C ;
      else if ( k % 2 == 1 && a != second ) tmpCost += C ;
    }
    ans = Math . min ( ans , tmpCost ) ;
  }
  return ans ;
}
