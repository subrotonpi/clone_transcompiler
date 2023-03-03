public static int bCandy ( int N , int [ ] A ) {
  int right = 0 ;
  int ans = 0 ;
  Set < Integer > chosenCandy = new HashSet < > ( ) ;
  for ( int left = 0 ;
  left < N ;
  left ++ ) {
    while ( right < N && ! ( A [ right ] == 0 ) ) {
      chosenCandy . add ( A [ right ] ) ;
      right ++ ;
    }
    chosenCandy . remove ( A [ left ] ) ;
    ans = Math . max ( right - left , ans ) ;
  }
  return ans ;
}
