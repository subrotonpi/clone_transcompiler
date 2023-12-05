public static long factorial ( int n ) {
  long ans = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ans *= i + 1 ;
    ans %= mod ;
  }
  return ans ;
}
