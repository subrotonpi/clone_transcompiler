public static int agentTakaHashi ( @ Nonnegative int X ) {
  for ( int n = 0 ;
  n < 400 ;
  n ++ ) {
    if ( n * n * n * n * n == X ) {
      return n ;
    }
  }
  return - 1 ;
}
