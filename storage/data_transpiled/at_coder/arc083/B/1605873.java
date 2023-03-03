public static int N = Integer . parseInt ( input ) {
  int [ ] [ ] A = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Lists . newArrayList ( ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] [ i ] = INF ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int [ ] Ai = A [ i ] ;
    for ( int j = 0 ;
    j < i ;
    j ++ ) {
      int d = Math . min ( Ints . checkedCast ( Ai [ j ] ) , Integer . MAX_VALUE ) ;
      if ( A [ i ] [ j ] > d ) {
        System . out . println ( "-1" ) ;
        exit ( ) ;
      }
      else if ( A [ i ] [ j ] < d ) {
        ans += A [ i ] [ j ] ;
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
