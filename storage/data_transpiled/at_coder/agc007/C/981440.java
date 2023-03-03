public static double solve ( int n , double d , double x ) {
  double ans = 0 ;
  while ( n > 0 ) {
    ans += d + ( 2 * n - 1 ) * x / 2 ;
    d = ( ( n + 1 ) * d + 5 * x / 2 ) / n ;
  }
  return ans ;
}
