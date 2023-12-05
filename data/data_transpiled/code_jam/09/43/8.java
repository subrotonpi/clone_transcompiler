private static void stockCharts ( ) {
  n = Integer . parseInt ( readLine ( ) ) ;
  k = Integer . parseInt ( readLine ( ) ) ;
  int [ ] [ ] prices = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) prices [ i ] = Integer . parseInt ( readLine ( ) ) ;
  M = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < n ;
    j ++ ) {
      int d1 = prices [ i ] [ 0 ] - prices [ j ] [ 0 ] ;
      for ( int t = 1 ;
      t < k ;
      t ++ ) {
        int d2 = prices [ i ] [ t ] - prices [ j ] [ t ] ;
        if ( d1 * d2 <= 0 ) {
          M [ i ] |= 1 << j ;
          M [ j ] |= 1 << i ;
          break ;
        }
      }
    }
  }
  C = new int [ n ] ;
  best = n ;
  go ( 0 , 0 ) ;
  System . out . println ( best ) ;
}
