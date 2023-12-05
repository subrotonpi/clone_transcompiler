public static int N ( int x ) {
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) a [ i ] = i ;
  int ans = 0 ;
  Arrays . sort ( a ) ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    x -= a [ i ] ;
    ans ++ ;
    if ( x < 0 ) ans -- ;
  }
  return ans <= 0 ? ans : ans - 1 ;
}
