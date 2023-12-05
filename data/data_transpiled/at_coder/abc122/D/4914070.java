public static int n = Integer . parseInt ( input ) {
  int [ ] [ ] [ ] dp = new int [ 4 ] [ 4 ] [ 4 ] ;
  for ( int k = 0 ;
  k < dp . length ;
  k ++ ) for ( int j = 0 ;
  j < dp [ i ] . length ;
  j ++ ) dp [ i ] [ j ] [ k ] [ j ] = 1 ;
  dp [ 0 ] [ 3 ] [ 3 ] = 1 ;
  long mod = 1000000007 ;
  for ( int lens = 0 ;
  lens < n ;
  lens ++ ) {
    for ( int c1 = 0 ;
    c1 < dp [ lens ] [ 0 ] . length ;
    c1 ++ ) for ( int c2 = 0 ;
    c2 < dp [ lens ] [ 0 ] . length ;
    c2 ++ ) for ( int c3 = 0 ;
    c3 < dp [ lens ] [ 0 ] . length ;
    c3 ++ ) {
      if ( dp [ lens ] [ 0 ] [ c1 ] [ c2 ] [ c3 ] == 0 ) continue ;
      for ( int a = 0 ;
      a < dp [ lens ] [ 0 ] . length ;
      a ++ ) {
        if ( dp [ lens ] [ 0 ] [ a ] [ c1 ] [ c2 ] == 1 && dp [ lens ] [ 0 ] [ c2 ] == 1 ) continue ;
        if ( dp [ lens ] [ 0 ] [ a ] [ c1 ] [ c2 ] == 1 && dp [ lens ] [ 0 ] [ c3 ] == 0 ) continue ;
        dp [ lens ] [ 0 ] [ a ] [ c1 ] [ c2 ] += dp [ lens ] [ 0 ] [ 0 ] [ c3 ] ;
        dp [ lens ] [ 0 ] [ a ] [ c1 ] [ c2 ] %= mod ;
      }
    }
  }
  long ans = 0 ;
  for ( int c1 = 0 ;
  c1 < dp [ lens ] . length ;
  c1 ++ ) for ( int c2 = 0 ;
  c2 < dp [ lens ] . length ;
  c2 ++ ) for ( int c3 = 0 ;
  c3 < dp [ lens ] [ 0 ] . length ;
  c3 ++ ) {
    ans += dp [ lens ] [ 0 ] [ c1 ] [ c2 ] [ c3 ] ;
    ans %= mod ;
  }
  return ans ;
}
