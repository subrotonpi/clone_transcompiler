public static void print ( int n ) {
  int [ ] asArray = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    asArray [ i ] = i ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    while ( asArray [ i ] % 2 == 0 || asArray [ i ] % 3 == 2 ) {
      ans ++ ;
      asArray [ i ] -- ;
    }
  }
  System . out . println ( ans ) ;
}
