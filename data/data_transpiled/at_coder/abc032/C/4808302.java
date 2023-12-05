static final int [ ] S ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] s = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    s [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  if ( 0 == s . length ) {
    System . out . println ( s . length ) ;
    System . exit ( 0 ) ;
  }
  else if ( K == 0 ) {
    System . out . println ( 0 ) ;
    System . exit ( 0 ) ;
  }
  else {
    int left = - 1 ;
    int right = 0 ;
    int mul = s [ 0 ] ;
    int ans = 0 ;
    while ( right < s . length ) {
      if ( left == right ) {
        right ++ ;
        if ( right == s . length ) break ;
        else mul = s [ right ] ;
      }
      if ( mul <= K ) {
        ans = Math . max ( ans , right - left ) ;
        right ++ ;
        if ( right <= s . length - 1 ) mul = mul * s [ right ] ;
        else break ;
      }
      else if ( mul > K ) {
        left ++ ;
        if ( left == right ) mul = 0 ;
        else mul = mul / s [ left ] ;
      }
    }
  }
  System . out . println ( ans ) ;
  return s ;
}
