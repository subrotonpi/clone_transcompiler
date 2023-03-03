public static int [ ] input ( String input ) {
  int N = Integer . parseInt ( input ) , K = Integer . parseInt ( input ) ;
  int [ ] data = new int [ N + 1 ] ;
  /* get the s */
  int s = 0 ;
  while ( k > 0 ) {
    s += data [ k ] ;
    k -= k & - k ;
  }
  /* add the k */
  while ( k <= N ) {
    data [ k ] += x ;
    k += k & - k ;
  }
  /* lower_bound */
  int i = 0 ;
  int s = 0 ;
  int k = 2 * ( N . length ( ) - 1 ) ;
  while ( k > 0 ) {
    if ( i + k <= N && data [ i + k ] < w ) {
      w -= data [ i + k ] ;
      i += k ;
    }
    k >>= 1 ;
  }
  int a = 1 ;
  int [ ] res = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int m = ( N - i ) * a / K ;
    res [ i ] = m ;
    a = ( ( N - i ) * a ) % K ;
  }
  return res ;
}
