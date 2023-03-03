public static void print ( int m , int n , int d ) {
  int ans = d ;
  while ( d >= m ) {
    ans += d / m * n ;
    d = n * ( d / m ) + d % m ;
  }
  System . out . println ( ans ) ;
}
