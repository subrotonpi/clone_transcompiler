public static int y ( ) {
  int ans = 0 ;
  if ( y % 4 == 0 ) {
    ans ++ ;
  }
  if ( y % 100 == 0 ) {
    ans -- ;
  }
  if ( y % 400 == 0 ) {
    ans ++ ;
  }
  if ( ans == 1 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return ans ;
}
