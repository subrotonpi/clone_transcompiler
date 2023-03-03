public static int tt = Integer . parseInt ( readLine ( ) ) {
  int ans ;
  for ( int t = xrange ( 1 , tt + 1 ) ;
  t <= xrange ( t + 1 ) ;
  t ++ ) {
    int n = Integer . parseInt ( readLine ( ) ) ;
    int [ ] d = new int [ n ] ;
    int [ ] m = new int [ n ] ;
    for ( int i = xrange ( n ) ;
    i < n ;
    i ++ ) {
      final int dd = Integer . parseInt ( readLine ( ) ) ;
      final int hh = Integer . parseInt ( readLine ( ) ) ;
      final int mm = Integer . parseInt ( readLine ( ) ) ;
      for ( int j = xrange ( hh ) ;
      j < n ;
      j ++ ) {
        d [ i ] = dd ;
        m [ i ] = mm + j ;
      }
    }
    if ( d . length < 2 ) ans = 0 ;
    else {
      int slower = ( m [ 0 ] > m [ 1 ] ) ? 0 : 1 ;
      int dslow = d [ slower ] ;
      int mslow = m [ slower ] ;
      int dfast = d [ 1 - slower ] ;
      int mfast = m [ 1 - slower ] ;
      ans = ( ( ( 360 - dslow ) * mslow ) >= ( 720 - dfast ) * mfast ) ? 1 : 0 ;
    }
    System . out . println ( "Case #" + t + ": " + ans ) ;
  }
  return ans ;
}
