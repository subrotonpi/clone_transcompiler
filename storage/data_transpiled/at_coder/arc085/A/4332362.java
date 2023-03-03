public static int parseInt ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  double m = 2 * M ;
  double ans = 0 ;
  int i = 1 ;
  do {
    double k = ( ( 1 * ( ( 1 / m ) ) ) * ( ( ( ( m - 1 ) / m ) * ( i - 1 ) ) ) ) * ( 1900 * M * i + ( N - M ) * 100 * i ) ;
    ans += k ;
    i ++ ;
  }
  while ( true ) ;
  return ans ;
}
