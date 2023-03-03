public static void print ( int n ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = i ;
  }
  int cnt = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    if ( ( a [ i ] == a [ i + 1 ] ) && ( a [ i + 1 ] == 0 ) ) {
      cnt ++ ;
      a [ i + 1 ] = 0 ;
    }
  }
  System . out . println ( cnt ) ;
}
