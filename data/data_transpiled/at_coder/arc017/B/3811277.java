public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int cnt = 0 ;
  int ans = 0 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    cnt = ( A [ i - 1 ] < A [ i ] ) ? cnt : cnt + 1 ;
  }
  return ans ;
}
