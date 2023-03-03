public static int tnum = Integer . parseInt ( readLine ( ) ) {
  for ( int tcou = 0 ;
  tcou < tnum ;
  tcou ++ ) {
    int b , n ;
    int [ ] m = new int [ tnum ] ;
    for ( int i = 0 ;
    i < tnum ;
    i ++ ) {
      b = Integer . parseInt ( readLine ( ) ) ;
      n = b ;
    }
    int [ ] m = new int [ tnum ] ;
    for ( int i = 0 ;
    i < tnum ;
    i ++ ) {
      m [ i ] = Integer . parseInt ( readLine ( ) ) ;
    }
    /* tot the sum of the numbers */
    int l = 0 ;
    int u = max ( m ) * n ;
    while ( l != u ) {
      int mid = ( l + u ) / 2 ;
      if ( tot ( mid ) < n ) {
        l = mid + 1 ;
      }
      else {
        u = mid ;
      }
    }
    for ( int i = 0 ;
    i < m . length ;
    i ++ ) {
      n -= ( l + m [ i ] - 1 ) / m [ i ] ;
    }
    int ans = 0 ;
    for ( int i = 0 ;
    i < m . length ;
    i ++ ) {
      if ( l % m [ i ] == 0 ) {
        if ( n == 1 ) {
          ans = i + 1 ;
          break ;
        }
        n -- ;
      }
    }
    System . out . println ( "Case #" + ( tcou + 1 ) + ": " + ans ) ;
  }
  return ans ;
}
