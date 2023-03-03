public static int N ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] di = new int [ N ] ;
  for ( int n = 0 ;
  n < N ;
  n ++ ) di [ n ] = Integer . parseInt ( input ( ) ) ;
  Arrays . sort ( di ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( i < N - 1 && di [ i ] == di [ i + 1 ] ) {
      i = i + 1 ;
      continue ;
    }
    ans ++ ;
  }
  return ans ;
}
