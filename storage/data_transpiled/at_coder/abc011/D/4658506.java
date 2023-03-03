public static double [ ] [ ] getDoubleArray ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) , d = Integer . parseInt ( input . nextLine ( ) ) ;
  int x = Integer . parseInt ( input . nextLine ( ) ) , y = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] C = new int [ n + 1 ] [ n + 1 ] ;
  for ( int j = 0 ;
  j < n + 1 ;
  j ++ ) {
    C [ j ] [ 0 ] = 1 ;
  }
  C [ 0 ] [ 0 ] = 1 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    C [ i ] [ 0 ] = C [ i - 1 ] [ 0 ] / 2 ;
    for ( int j = 1 ;
    j <= i ;
    j ++ ) {
      C [ i ] [ j ] = ( C [ i - 1 ] [ j - 1 ] + C [ i - 1 ] [ j ] ) / 2 ;
    }
  }
  double ans = 0 ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < n + 1 ;
    j ++ ) {
      int k = ( i * d - x ) / d ;
      int l = ( j * d - y ) / d ;
      if ( 0 <= k && k <= n && 0 <= l && ( i - k ) * d == x && ( j - l ) * d == y && i + j + k + l == n ) ans += C [ n ] [ i + k ] * C [ i + k ] [ i ] * C [ j + l ] [ j ] ;
    }
  }
  System . out . println ( ans ) ;
  return C ;
}
