public static int N ( ) {
  N = input . nextInt ( ) ;
  int ans1 = 0 , ans2 = 0 ;
  for ( int i = 0 ;
  i < N . length ;
  i ++ ) {
    if ( ( i == 0 ) && ( N . charAt ( i ) == '-' ) ) ans1 += Integer . parseInt ( N . charAt ( i ) ) - 1 ;
    else ans1 += 9 ;
    ans2 += Integer . parseInt ( N . charAt ( i ) ) ;
  }
  int ans = Math . max ( ans1 , ans2 ) ;
  return ans ;
}
