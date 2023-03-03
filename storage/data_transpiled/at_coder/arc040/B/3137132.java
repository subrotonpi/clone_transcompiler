public static int N = Integer . parseInt ( input ) {
  int R = Integer . parseInt ( input . nextLine ( ) ) ;
  StringBuilder S = new StringBuilder ( input . nextLine ( ) ) ;
  int r = S . length ( ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int p = S . substring ( i , i + R ) . indexOf ( '.' ) ;
    if ( r == 0 ) {
      ans = 0 ;
      break ;
    }
    if ( p == r ) {
      ans ++ ;
      break ;
    }
    if ( S . charAt ( i ) == '.' ) {
      for ( int j = i ;
      j < i + R ;
      j ++ ) {
        S . setCharAt ( j , 'o' ) ;
      }
      r -= p ;
      ans ++ ;
    }
    ans ++ ;
  }
  return ans ;
}
