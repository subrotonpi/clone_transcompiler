public static int cal ( int [ ] m , int t ) {
  return cal ( m , t ) ;
  /* gao */
  final int b = Integer . parseInt ( input ( ) ) ;
  final int n = Integer . parseInt ( input ( ) ) ;
  final int [ ] m = new int [ b ] ;
  int l = 0 ;
  int r = Math . min ( m . length , n ) ;
  int ans = r ;
  while ( l <= r ) {
    final int mid = ( l + r ) / 2 ;
    final int s = cal ( m , mid ) ;
    if ( s >= n ) {
      ans = mid ;
      r = mid - 1 ;
    }
    else {
      l = mid + 1 ;
    }
  }
  ans = ans - 1 ;
  int cnt = n - cal ( m , ans ) ;
  for ( int i = 0 ;
  i < m . length ;
  i ++ ) {
    if ( ans % m [ i ] == 0 ) {
      cnt -- ;
      if ( cnt == 0 ) {
        return i + 1 ;
      }
    }
  }
  /* gao */
  t = Integer . parseInt ( input ( ) ) ;
  for ( int cas = 0 ;
  cas < t ;
  cas ++ ) {
    System . out . print ( "Case #" + ( cas + 1 ) + ":" ) ;
    System . out . println ( gao ( ) ) ;
  }
  return - 1 ;
}
