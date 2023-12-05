public static int N ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) A [ i ] = Integer . parseInt ( input ( ) ) ;
  int ans = 0 , r = 0 ;
  int XOR = 0 , SUM = 0 ;
  for ( int l = 0 ;
  l < N ;
  l ++ ) {
    while ( r < N && XOR ^ A [ r ] == SUM + A [ r ] ) {
      XOR ^= A [ r ] ;
      SUM += A [ r ] ;
      r ++ ;
    }
    ans += r - l ;
    XOR ^= A [ l ] ;
    SUM -= A [ l ] ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
