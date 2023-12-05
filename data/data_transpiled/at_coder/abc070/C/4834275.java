public static int N = Integer . parseInt ( input ) {
  int [ ] R = new int [ N ] ;
  for ( int i = 0 ;
  i < R . length ;
  i ++ ) R [ i ] = Integer . parseInt ( input ) ;
  /* gcd */
  if ( a < b ) {
    int c = b ;
    b = a ;
    a = c ;
  }
  while ( b != 0 ) {
    c = a % b ;
    a = b ;
    b = c ;
  }
  /* lcm */
  int p = R [ 0 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) p = lcm ( p , R [ i ] ) ;
  return p ;
}
