public static int N ( String input ) {
  double E = 0 ;
  int i = 1 ;
  double a = ( 1900 * ( M ) + 100 * ( N - M ) ) * ( 0.5 ) * ( M ) ;
  while ( a > 10e-10 ) {
    a = ( 1900 * ( M * i ) + 100 * ( N - M ) * i ) * ( ( ( 2 * M - 1 ) * ( 0.5 ) ) * ( M ) * ( i - 1 ) ) ;
    E += a ;
    i ++ ;
  }
  return ( int ) E + 1 ;
}
