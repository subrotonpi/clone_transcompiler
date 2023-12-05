public static int cases = Integer . parseInt ( readLine ( ) ) {
  int cases = Integer . parseInt ( readLine ( ) ) ;
  {
    int a = 1 ;
    int c = 0 ;
    for ( int time : times ) {
      a += ( t + time - 1 ) / time ;
      if ( ( t % time ) == 0 ) {
        c ++ ;
      }
    }
    int b = a + Math . max ( c - 1 , 0 ) ;
    return a + b ;
  }
  for ( int case : xrange ( 1 , cases + 1 ) ) {
    int b = Integer . parseInt ( readLine ( ) ) , rank = Integer . parseInt ( readLine ( ) ) ;
    int [ ] times = new int [ b ] ;
    for ( int i = 0 ;
    i < b ;
    i ++ ) times [ i ] = Integer . parseInt ( readLine ( ) ) ;
    int lo = 0 ;
    int hi = 10 * 15 ;
    int ans = - 1 ;
    while ( lo <= hi ) {
      int mid = ( lo + hi ) / 2 ;
      int lb = solve ( mid , times , b ) ;
      int ub = solve ( mid , times , b ) ;
      if ( ( rank < lb ) && ( rank > ub ) ) {
        hi = mid - 1 ;
      }
      else if ( rank > ub ) {
        lo = mid + 1 ;
      }
      else {
        int [ ] ids = new int [ xrange ( b ) ] ;
        for ( int i : xrange ( b ) ) {
          if ( mid % times [ i ] == 0 ) {
            lo = mid + 1 ;
            continue ;
          }
          assert 0 <= rank - lb && rank - lb < ids . length ;
          ans = ids [ rank - lb ] ;
          break ;
        }
      }
    }
    System . out . println ( "Case #" + case + ": " + ans ) ;
  }
  return ans ;
}
