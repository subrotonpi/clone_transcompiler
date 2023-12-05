public static void print ( int x ) {
  int ans = 2 * ( x / 11 ) ;
  if ( 1 <= x % 11 && x % 11 <= 6 ) {
    ans += 1 ;
  }
  else if ( 7 <= x % 11 ) {
    ans += 2 ;
  }
  System . out . println ( ans ) ;
}
