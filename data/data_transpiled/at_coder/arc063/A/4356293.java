public static int input ( ) {
  int ans = 0 ;
  int now = S [ 0 ] ;
  for ( int i = 1 ;
  i < S . length ;
  i ++ ) {
    int s = S [ i ] ;
    if ( s != now ) {
      now = s ;
      ans ++ ;
    }
  }
  return ans ;
}
