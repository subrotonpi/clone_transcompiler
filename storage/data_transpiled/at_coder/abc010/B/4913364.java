public static void print ( int n ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = i ;
  }
  int sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    while ( a [ i ] % 2 == 0 || a [ i ] % 3 == 2 ) {
      a [ i ] -- ;
      sum ++ ;
    }
  }
  System . out . println ( sum ) ;
}
