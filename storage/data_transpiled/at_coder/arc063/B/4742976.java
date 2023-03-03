public static int N ( String input ) {
  int T = Integer . parseInt ( input ) ;
  int [ ] A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ) ;
  }
  long min_A = 1000000001 ;
  long max_Diff = 0 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    min_A = Math . min ( min_A , A [ i ] ) ;
    if ( A [ i ] - min_A == max_Diff ) ans ++ ;
    if ( A [ i ] - min_A > max_Diff ) {
      max_Diff = A [ i ] - min_A ;
      ans = 1 ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
