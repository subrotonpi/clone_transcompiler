public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] s = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) s [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( 0 == s [ N ] ) {
    System . out . println ( N ) ;
    exit ( ) ;
  }
  int left = 0 ;
  int right = 0 ;
  int a = 1 ;
  int ans = 0 ;
  while ( right < N ) {
    while ( right < N ) {
      if ( a * s [ right ] <= K ) {
        a *= s [ right ] ;
        right ++ ;
      }
      else break ;
    }
    if ( left >= right ) {
      left ++ ;
      right ++ ;
    }
    else {
      ans = Math . max ( ans , right - left ) ;
      a /= s [ left ] ;
      left ++ ;
    }
  }
  return ans ;
}
