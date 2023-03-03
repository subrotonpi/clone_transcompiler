public static int x ( ) {
  int x = input . nextInt ( ) ;
  int ans = 0 ;
  while ( x > 0 ) {
    ans += x % 10 ;
    x /= 10 ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
