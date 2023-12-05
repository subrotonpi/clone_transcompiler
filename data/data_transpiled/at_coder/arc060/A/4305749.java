public static int inpl ( ) {
  return Lists . newArrayList ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int N = inpl ( ) ;
  int A = inpl ( ) ;
  int [ ] X = inpl ( ) ;
  int maxX = max ( X ) ;
  int [ ] [ ] [ ] dp = new int [ N * maxX + 1 ] [ 51 ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < i + 1 ;
    j ++ ) {
      for ( int k = 0 ;
      k < N * maxX + 1 ;
      k ++ ) {
        if ( dp [ i ] [ j ] [ k ] == 0 ) {
          continue ;
        }
        dp [ i + 1 ] [ j ] [ k ] += dp [ i ] [ j ] [ k ] ;
        dp [ i + 1 ] [ j + 1 ] [ k + x ] += dp [ i ] [ j ] [ k ] ;
      }
    }
  }
  int ans = 0 ;
  for ( int j = 1 ;
  j <= N ;
  j ++ ) {
    if ( j * A > N * maxX ) {
      continue ;
    }
    ans += dp [ N ] [ j ] [ j * A ] ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
