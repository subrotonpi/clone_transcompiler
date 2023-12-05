public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] lsts = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    lsts [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  int left = 0 ;
  int mul = 1 ;
  if ( 0 == lsts [ left ] ) {
    ans = N ;
  }
  else {
    for ( int right = 0 ;
    right < N ;
    right ++ ) {
      mul *= lsts [ right ] ;
      if ( mul <= K ) {
        int length = right - left + 1 ;
        ans = Math . max ( ans , length ) ;
      }
      else {
        mul /= lsts [ left ] ;
        left ++ ;
      }
    }
  }
  return ans ;
}
