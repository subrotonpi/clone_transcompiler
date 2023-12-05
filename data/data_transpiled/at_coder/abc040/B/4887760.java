public static void print ( int n ) {
  int ans = 100000 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    int a = n / i ;
    int b = Math . abs ( i - a ) + ( n - i * a ) ;
    if ( b < ans ) {
      ans = b ;
    }
  }
  System . out . println ( ans ) ;
}
