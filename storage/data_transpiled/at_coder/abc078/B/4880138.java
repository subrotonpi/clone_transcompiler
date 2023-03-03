public static int x ( int x , int y , int z ) {
  int ans = 0 ;
  x = x - 2 * z ;
  while ( x - y >= 0 ) {
    x = x - y - z ;
    ans ++ ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
