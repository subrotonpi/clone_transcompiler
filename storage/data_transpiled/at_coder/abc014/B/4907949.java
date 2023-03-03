public static int N ( String input ) {
  int X = Integer . parseInt ( input ) ;
  int a = Integer . parseInt ( input ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( ( ( X >> i ) & 1 ) == 1 ) {
      ans += a ;
    }
  }
  return ans ;
}
