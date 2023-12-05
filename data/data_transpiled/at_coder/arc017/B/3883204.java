public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int cur = 0 ;
  int ans = 0 ;
  int val = 10 * 9 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( val < A [ i ] ) {
      cur ++ ;
    }
    else {
      cur = 1 ;
    }
    if ( cur >= K ) {
      ans ++ ;
    }
    val = A [ i ] ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
