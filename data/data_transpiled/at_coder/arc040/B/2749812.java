public static int parseInt ( String input ) {
  int N = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int R = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( S . charAt ( i ) == '.' ) {
      ans ++ ;
      i += R - 1 ;
    }
    i ++ ;
  }
  return ans ;
}
