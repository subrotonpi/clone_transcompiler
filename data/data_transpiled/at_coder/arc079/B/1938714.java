public static void print ( int k ) {
  int n = 50 ;
  int m = k % n ;
  int q = k / n ;
  int [ ] a = new int [ n ] ;
  a [ 0 ] = q + n - m - 1 ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    a [ n - 1 - i ] += n + 1 ;
  }
  System . out . println ( n ) ;
  System . out . println ( a ) ;
}
