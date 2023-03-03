public static void print ( int n ) {
  int [ ] [ ] a = new int [ n ] [ n + 1 ] ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    for ( int j = i ;
    j <= n ;
    j ++ ) {
      if ( j != i != n - j + 1 - n % 2 ) {
        a [ i ] [ j ] = new Integer ( i ) ;
      }
    }
  }
  if ( n % 2 > 0 ) {
    Arrays . sort ( a ) ;
  }
  System . out . println ( a . length ) ;
  for ( int t : a ) {
    System . out . println ( ( Integer ) t ) ;
  }
}
