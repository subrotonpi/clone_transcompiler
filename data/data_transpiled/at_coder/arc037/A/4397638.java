public static int N ( ) {
  int ans = 0 ;
  int [ ] m = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    m [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( m [ i ] < 80 ) {
      ans += ( 80 - m [ i ] ) ;
    }
  }
  return ans ;
}
