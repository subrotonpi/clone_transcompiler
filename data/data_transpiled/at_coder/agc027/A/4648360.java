public static int N ( int N , int x ) {
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) a [ i ] = i ;
  Arrays . sort ( a ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( i < N - 1 ) {
      if ( x >= a [ i ] ) {
        ans ++ ;
        x -= a [ i ] ;
      }
    }
    else {
      if ( a [ i ] == x ) ans ++ ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
