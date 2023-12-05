public static int H = Integer . parseInt ( input ) {
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int P = 10 * 9 + 7 ;
  int N = H + W ;
  /* fact */
  int [ ] ret = new int [ N + 1 ] ;
  for ( int n = 2 ;
  n <= N ;
  n ++ ) {
    ret [ n ] = ( ret [ n - 1 ] * n ) % P ;
  }
  /* pow */
  int a = ( a * a ) % P ;
  int b = ( b * b ) % P ;
  if ( b == 0 ) {
    return 1 ;
  }
  if ( b % 2 == 0 ) {
    return pow_r ( ( a * a ) % P , b / 2 , P ) ;
  }
  else {
    return ( a * pow_r ( ( a * a ) % P , ( b - 1 ) / 2 , P ) ) % P ;
  }
  /* inv */
  int [ ] ret = new int [ N + 1 ] ;
  ret [ N ] = 1 ;
  int [ ] fac = fact ( N , P ) ;
  ret [ N ] = pow_r ( fac [ N ] , P - 2 , P ) ;
  for ( int n = 2 ;
  n <= N ;
  n ++ ) {
    ret [ n ] = ( ret [ n + 1 ] * ( n + 1 ) ) % P ;
  }
  return ret [ N ] ;
}
