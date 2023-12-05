public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] s = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) s [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  /* main program */
  if ( 0 == s [ N ] ) {
    return N ;
  }
  else {
    int l = 0 , r = 0 ;
    int val = 1 ;
    int ans = 0 ;
    while ( r < N ) {
      if ( val * s [ r ] <= K ) {
        val *= s [ r ] ++ ;
        ans = Math . max ( ans , r - l ) ;
      }
      else if ( l == r ) {
        l ++ ;
        r ++ ;
      }
      else {
        val /= s [ l ] ++ ;
      }
    }
    return ans ;
  }
}
