public static int N ( ) {
  int n = N ;
  int tmp = 0 ;
  while ( true ) {
    tmp += n % 10 ;
    n = ( int ) ( n / 10 ) ;
    if ( n == 0 ) break ;
  }
  return ( N % tmp == 0 ? "Yes" : "No" ) ;
}
