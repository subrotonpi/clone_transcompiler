public static int islandAndBridge ( @ Nonnegative int N , @ Nonnegative int [ ] A ) {
  if ( Integer . parseInt ( A [ 0 ] ) % N > 0 ) return - 1 ;
  int s = 0 ;
  int goal = Integer . parseInt ( A [ 0 ] ) / N ;
  int bridges = 0 ;
  for ( int a : A ) {
    s += a - goal ;
    if ( s != 0 ) {
      bridges ++ ;
    }
  }
  return bridges ;
}
