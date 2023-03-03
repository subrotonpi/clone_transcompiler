@ Nonnull public static < T > List < T > list ( @ Nonnull final T [ ] args ) {
  final int n = args . length ;
  final int i = args . length ;
  final int [ ] l = new int [ n ] ;
  int i = 0 ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) {
    l [ j ] = Integer . parseInt ( args [ j ] ) ;
  }
  final int s = ( n * ( n + 1 ) ) % mod ;
  for ( int j = 1 ;
  j < l . length ;
  j ++ ) {
    final int b = l [ j ] ;
    if ( j > 0 ) {
      res -= b * ( n / b + 1 ) * inv_2 ;
    }
    else {
      res += b * ( n / b + 1 ) * inv_2 ;
    }
  }
  final int inv_2 = 500000004 ;
  final int n = li ;
  final int k = l [ 0 ] ;
  int ans = 0 ;
  final List < Integer > l = new ArrayList < Integer > ( ) ;
  for ( i = 0 ;
  i < n ;
  i ++ ) l . add ( null ) ;
  for ( i = 0 ;
  i < n ;
  i ++ ) l . add ( i , i ) ;
  ans %= mod ;
  System . out . println ( ans ) ;
  return l ;
}
