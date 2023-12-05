static final int N = Integer . parseInt ( input ) ;
int s = Integer . parseInt ( input ) ;
/* f = (b, n) + (n / b) + (n % b) */
/* abc = (N + 1) + (N / s) + (n % s) */
/* abc = (N + 1) + (N / s) + (n % s) */
int N = s ;
if ( N == S ) {
  return N + 1 ;
}
else {
  for ( int b = 2 ;
  b <= ( int ) Math . sqrt ( N ) ;
  b ++ ) {
    if ( N == S ) return b ;
  }
  int tmp = - 1 ;
  for ( int p = 1 ;
  p <= ( int ) Math . sqrt ( N ) ;
  p ++ ) {
    if ( ( N - S ) % p != 0 ) continue ;
    int b = ( N - S ) / p + 1 ;
    if ( b <= 1 ) continue ;
    if ( N == S ) tmp = b ;
  }
  return tmp ;
}
}
