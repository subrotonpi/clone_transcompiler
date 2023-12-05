public static int N = Integer . parseInt ( input ) {
  String S1 = input . substring ( 0 , 1 ) ;
  String S2 = input . substring ( 1 , 2 ) ;
  int ans = 0 ;
  int i = 0 ;
  if ( S1 . charAt ( 0 ) == S2 . charAt ( 0 ) ) {
    ans = 3 ;
    i = 1 ;
  }
  else {
    ans = 6 ;
    i = 2 ;
  }
  while ( ( i < S1 . length ( ) ) && ( i < S2 . length ( ) ) ) {
    if ( S1 . charAt ( i ) == S2 . charAt ( i ) ) {
      if ( S1 . charAt ( i - 1 ) == S2 . charAt ( i - 1 ) ) {
        ans *= 2 ;
        ans %= ( 10 * 9 + 7 ) ;
      }
      i ++ ;
    }
    else {
      if ( S1 . charAt ( i - 1 ) != S2 . charAt ( i - 1 ) ) {
        ans *= 3 ;
        ans %= ( 10 * 9 + 7 ) ;
      }
      else {
        ans *= 2 ;
        ans %= ( 10 * 9 + 7 ) ;
      }
      i += 2 ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
