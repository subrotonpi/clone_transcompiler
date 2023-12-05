public static void print ( int n ) {
  int [ ] l = new int [ 100 ] ;
  l [ 0 ] = 2 ;
  l [ 1 ] = 1 ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    l [ i ] = l [ i - 1 ] + l [ i - 2 ] ;
  }
  System . out . println ( l [ n ] ) ;
}
