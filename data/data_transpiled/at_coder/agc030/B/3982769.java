public static int L = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] X = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) X [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] s = new int [ N + 1 ] ;
  int [ ] t = new int [ N + 1 ] ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    s [ i ] = s [ i - 1 ] + X [ i ] ;
    t [ i ] = t [ i - 1 ] + ( L - X [ N - i + 1 ] ) ;
  }
  int [ ] Y = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Y [ i ] = 0 ;
  }
  /* get d */
  if ( i == N ) return X [ N ] ;
  int a = i + ( N - i ) / 2 ;
  return ( 2 * ( s [ a ] - s [ i - 1 ] + L * ( N - a ) - s [ N ] + s [ a ] ) - ( N - i ) % 2 == 0 ? x [ a ] : ( L - x [ a + 1 ] ) ) ;
}
