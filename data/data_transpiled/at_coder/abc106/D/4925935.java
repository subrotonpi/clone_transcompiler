public static int [ ] [ ] city ( ) {
  int n = ( Integer ) input . nextInt ( ) ;
  int m = ( Integer ) input . nextInt ( ) ;
  int q = ( Integer ) input . nextInt ( ) ;
  int [ ] [ ] city = new int [ n + 1 ] [ n + 1 ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int l = ( Integer ) input . nextInt ( ) ;
    int r = ( Integer ) input . nextInt ( ) ;
    city [ l ] [ r ] ++ ;
  }
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    for ( int j = 1 ;
    j <= n ;
    j ++ ) {
      city [ i ] [ j ] += city [ i ] [ j - 1 ] ;
    }
  }
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    for ( int j = 1 ;
    j <= n ;
    j ++ ) {
      city [ i ] [ j ] += city [ i - 1 ] [ j ] ;
    }
  }
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    int a = ( Integer ) input . nextInt ( ) ;
    int b = ( Integer ) input . nextInt ( ) ;
    System . out . println ( city [ b ] [ b ] - city [ a - 1 ] [ b ] - city [ b ] [ a - 1 ] + city [ a - 1 ] [ a - 1 ] ) ;
  }
  return city ;
}
