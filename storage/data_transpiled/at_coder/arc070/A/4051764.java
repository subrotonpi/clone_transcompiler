public static int x ( ) {
  int ans = 0 ;
  for ( int i = 1 ;
  i < 10 * 9 ;
  i ++ ) {
    ans += i ;
    if ( ans >= x ) {
      System . out . println ( i ) ;
      exit ( ) ;
    }
  }
  return ans ;
}
