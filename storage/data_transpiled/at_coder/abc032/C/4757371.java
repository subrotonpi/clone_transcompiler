public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] s = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) s [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int right = 0 ;
  int res = 0 ;
  int sum = 1 ;
  if ( 0 == s [ right ] ) {
    res = N ;
  }
  else {
    for ( int left = 0 ;
    left <= N ;
    left ++ ) {
      while ( ( right < N ) && ( sum * s [ right ] <= K ) ) {
        sum *= s [ right ] ;
        right ++ ;
      }
      res = Math . max ( res , right - left ) ;
      if ( ( right == left ) && ( sum == 0 ) ) right ++ ;
      else sum /= s [ left ] ;
    }
  }
  return res ;
}
