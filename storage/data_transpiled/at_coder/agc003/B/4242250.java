public static int N ( ) {
  int ans = 0 ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans += A [ i ] / 2 ;
    if ( i != N - 1 ) {
      if ( A [ i ] >= 2 ) {
        A [ i + 1 ] += A [ i ] % 2 ;
      }
    }
  }
  return ans ;
}
