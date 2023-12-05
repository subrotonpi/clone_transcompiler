public static int int2base ( int [ ] x , int b ) {
  int at = 1 ;
  int ans = 0 ;
  for ( int dig : x ) {
    ans += at * dig ;
    at *= b ;
  }
  return ans ;
}
