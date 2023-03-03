@ GwtIncompatible ( "java.util.concurrent.atomic.AtomicInteger" ) public static int from ( int input ) {
  int mod = 10 * 9 + 7 ;
  int n = Integer . parseInt ( input ) ;
  int [ ] A = Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int [ ] C = Arrays . stream ( A ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int l = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    if ( C [ i ] > 1 ) {
      l = i ;
      int [ ] p = new int [ n + 1 ] ;
      for ( int j = 0 ;
      j < n + 1 ;
      j ++ ) {
        if ( A [ j ] == l ) {
          p [ 0 ] = j ;
          if ( p . length > 1 ) break ;
        }
      }
      break ;
    }
    if ( l > 0 ) break ;
  }
  int t = 1 ;
  int d = 1 ;
  for ( int k = 0 ;
  k < n + 1 ;
  k ++ ) {
    t *= ( n + 1 - k ) % mod ;
    t %= mod ;
    t *= pow ( k + 1 , mod - 2 , mod ) ;
    t %= mod ;
    if ( k == 0 ) System . out . println ( n ) ;
    else if ( k <= n + p [ 0 ] - p [ 1 ] ) {
      d *= ( n + p [ 0 ] - p [ 1 ] - k + 1 ) % mod ;
      d %= mod ;
      d *= pow ( k , mod - 2 , mod ) ;
      d %= mod ;
      System . out . println ( ( t - d ) % mod ) ;
    }
    else System . out . println ( t % mod ) ;
  }
  return t ;
}
