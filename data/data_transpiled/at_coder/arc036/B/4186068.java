public static int bMountain ( int N , int H [ ] ) {
  int ans = 0 ;
  for ( int t = 0 ;
  t < N ;
  t ++ ) {
    if ( t == 0 || t == N - 1 || H [ t - 1 ] < H [ t ] > H [ t + 1 ] ) {
      int s = t , u = t ;
      for ( int i = t ;
      i >= 0 ;
      i -- ) {
        s = i ;
        if ( i >= 1 && H [ i - 1 ] > H [ i ] ) break ;
      }
      for ( int i = t ;
      i < N ;
      i ++ ) {
        u = i ;
        if ( i + 1 < N && H [ i ] < H [ i + 1 ] ) break ;
      }
      ans = Math . max ( ans , u - s + 1 ) ;
    }
  }
  return ans ;
}
