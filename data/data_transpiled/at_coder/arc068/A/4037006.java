public static int x ( ) {
  int ans ;
  ans = x ;
  if ( ! x % 11 ) {
    ans = x / 11 * 2 ;
  }
  else if ( x % 11 <= 6 ) {
    ans = x / 11 * 2 + 1 ;
  }
  else {
    ans = x / 11 * 2 + 2 ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
