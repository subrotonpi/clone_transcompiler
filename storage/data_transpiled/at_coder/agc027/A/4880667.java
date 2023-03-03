public static int N ( int N , int x ) {
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = i ;
  }
  Arrays . sort ( a ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( i == N - 1 ) {
      if ( x == a [ i ] ) ans ++ ;
      break ;
    }
    if ( x - a [ i ] >= 0 ) {
      ans ++ ;
    }
  }
  return ans ;
}
