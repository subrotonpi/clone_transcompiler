public static int input ( ) {
  int n , x ;
  int p = n ;
  if ( x * 2 > n ) x = n - x ;
  int ans = 0 ;
  while ( ( x > 0 ) && ( n == p ) ) {
    ans += 3 * x * ( n / x - 1 ) ;
  }
  else {
    ans += 3 * x * ( n / x ) ;
  }
  n = x ;
  x = n % x ;
  return ans ;
}
