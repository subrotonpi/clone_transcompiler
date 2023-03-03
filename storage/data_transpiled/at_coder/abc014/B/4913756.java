public static int n ( int x , int y ) {
  int a [ ] = new int [ y ] ;
  for ( int i = 0 ;
  i < y ;
  i ++ ) {
    a [ i ] = x ;
  }
  int i = 0 ;
  int ans = 0 ;
  while ( x > 0 ) {
    if ( x % 2 == 1 ) {
      ans += a [ i ] ;
    }
    i ++ ;
    x = x / 2 ;
  }
  return ans ;
}
