public static int N ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int right = 0 ;
  int res = 0 ;
  for ( int left = 0 ;
  left <= N ;
  left ++ ) {
    while ( ( right < N ) && ( ( a [ right - 1 ] < a [ right ] ) || ( left >= right ) ) ) {
      right ++ ;
    }
    res += right - left ;
    if ( ( right == left ) && ( a [ right ] < a [ left ] ) ) {
      res ++ ;
    }
  }
  return res ;
}
