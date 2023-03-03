public static int N = Integer . parseInt ( input ) {
  String [ ] A = input . split ( " " ) ;
  int [ ] array = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    array [ i ] = Integer . parseInt ( A [ Integer . parseInt ( i ) ] ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    if ( array [ i ] != Integer . parseInt ( A [ i ] ) ) {
      array [ i ] = Integer . parseInt ( A [ i ] ) ;
      ans ++ ;
    }
  }
  return ans ;
}
