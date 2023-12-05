public static void print ( String input ) {
  int n , m ;
  n = Integer . parseInt ( input ) ;
  m = n % 12 ;
  s = 30 * n + 0.5 * m ;
  l = 6 * m ;
  int ans = Math . abs ( l - s ) ;
  if ( ans > 180 ) {
    ans = 360 - ans ;
  }
  System . out . println ( ans ) ;
}
