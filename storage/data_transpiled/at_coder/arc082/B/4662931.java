public static void print ( int n ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = i + 1 ;
  }
  int cnt = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] == i + 1 ) {
      a [ i ] = a [ i ] ;
      cnt ++ ;
    }
  }
  if ( a [ n - 1 ] == n ) {
    cnt ++ ;
  }
  System . out . println ( cnt ) ;
}
