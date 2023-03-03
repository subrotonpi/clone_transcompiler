public static void print ( int n ) {
  int ans = 1 ;
  int m = 1 ;
  while ( m < n ) {
    ans ++ ;
    m += ans ;
  }
  System . out . println ( ans ) ;
}
