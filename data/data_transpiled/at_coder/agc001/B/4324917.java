public static int n ( ) {
  int x = Integer . parseInt ( input ) ;
  if ( ( x > n / 2 && n % 2 == 0 ) || ( x > ( n + 1 ) / 2 && n % 2 == 1 ) ) x = n - x ;
  int A = n - x ;
  int B = x ;
  int k = 0 ;
  int m = - 1 ;
  int ans = n ;
  while ( m != 0 ) {
    k = A / B ;
    m = A % B ;
    ans += B * k * 2 ;
    if ( m == 0 ) ans -= B ;
    A = B ;
    B = m ;
  }
  return ans ;
}
