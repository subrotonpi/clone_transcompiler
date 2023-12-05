public static int W ( int a , int b ) {
  int ans = 0 ;
  if ( a + W < b ) {
    ans = b - a - W ;
  }
  else if ( b + W < a ) {
    ans = a - b - W ;
  }
  else {
    ans = 0 ;
  }
  return ans ;
}
