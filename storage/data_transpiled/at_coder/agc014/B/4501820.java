private static String solve ( ) {
  int n = ( Integer ) input . nextInt ( ) ;
  int m = ( Integer ) input . nextInt ( ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a1 = ( Integer ) input . nextInt ( ) ;
    int b1 = ( Integer ) input . nextInt ( ) ;
    a [ a1 - 1 ] ++ ;
    a [ b1 - 1 ] ++ ;
  }
  String ans = "YES" ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] % 2 == 1 ) {
      ans = "NO" ;
    }
  }
  return ans ;
}
