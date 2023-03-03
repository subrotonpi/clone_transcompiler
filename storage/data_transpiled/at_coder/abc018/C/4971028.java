@ Produces @ ApplicationScoped public static void accumulateTenants ( @ New int ac ) {
  int r = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] d = new int [ r ] [ c + 1 ] ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    String g = input . nextLine ( ) ;
    for ( int j = 0 ;
    j < c ;
    j ++ ) {
      if ( g . charAt ( j ) == 'x' ) {
        for ( int t = 0 ;
        t < k ;
        t ++ ) {
          if ( i - k >= 0 ) {
            d [ i - t ] [ Math . max ( 0 , j - k + t + 1 ) ] ++ ;
            d [ i - t ] [ Math . min ( c , j + k - t ) ] -- ;
          }
          if ( i + k < r ) {
            d [ i + k ] [ j ] ++ ;
          }
        }
      }
    }
  }
  Arrays . sort ( d ) ;
  int t = 0 ;
  for ( int x = k - 1 ;
  x <= r - k ;
  x ++ ) {
    for ( int y = k - 1 ;
    y <= c - k ;
    y ++ ) {
      if ( d [ x ] [ y ] == 0 ) {
        t ++ ;
      }
    }
  }
  System . out . println ( t ) ;
}
