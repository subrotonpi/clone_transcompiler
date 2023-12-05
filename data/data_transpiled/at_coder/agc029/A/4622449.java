public static int input ( ) {
  int ans = 0 ;
  int tmp = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( S . charAt ( i ) == 'W' ) {
      ans += i - tmp ;
      tmp ++ ;
    }
  }
  return ans ;
}
