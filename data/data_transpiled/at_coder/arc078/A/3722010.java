public static void print ( int n ) {
  int [ ] a = Integer . parseInt ( input ( ) ) ;
  int total = sum ( a ) ;
  int count = a [ 0 ] ;
  int ans = Math . abs ( total - 2 * count ) ;
  for ( int i = 1 ;
  i < n - 1 ;
  i ++ ) {
    count += a [ i ] ;
    if ( ans > Math . abs ( total - 2 * count ) ) ans = Math . abs ( total - 2 * count ) ;
  }
  System . out . println ( ans ) ;
}
