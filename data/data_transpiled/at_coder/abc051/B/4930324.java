public static int k ( ) {
  int s = Integer . parseInt ( input . nextLine ( ) ) ;
  int cnt = 0 ;
  for ( int x = 0 ;
  x <= k ;
  x ++ ) {
    for ( int y = 0 ;
    y <= k ;
    y ++ ) {
      if ( s - x - y >= 0 && s - x - y <= k ) {
        cnt ++ ;
      }
    }
  }
  return cnt ;
}
