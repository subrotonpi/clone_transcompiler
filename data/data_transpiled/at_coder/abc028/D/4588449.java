public static void print ( int n , int k ) {
  int ans = 0 ;
  ans += ( 1 / n ) * ( 1 / n ) * ( 1 / n ) ;
  ans += 3 * ( 1 / n ) * ( 1 / n ) * ( ( n - 1 ) / n ) ;
  ans += 6 * ( 1 / n ) * ( ( k - 1 ) / n ) * ( ( n - k ) / n ) ;
  System . out . println ( ans ) ;
}
