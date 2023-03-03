public static int N ( int x ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = i ;
  }
  Arrays . sort ( A ) ;
  int ans = 0 ;
  for ( int a : A ) {
    if ( a <= x ) {
      ans ++ ;
      x -= a ;
    }
    else {
      x -= a ;
      break ;
    }
  }
  if ( x > 0 ) ans -- ;
  return ans ;
}
