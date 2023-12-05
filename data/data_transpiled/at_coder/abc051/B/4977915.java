public static int k ( ) {
  int s = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = 0 ;
  for ( int x = 0 ;
  x < k + 1 ;
  x ++ ) {
    for ( int y = 0 ;
    y < k + 1 ;
    y ++ ) {
      if ( ( ( s - x - y ) <= k ) & ( ( s - x - y ) >= 0 ) ) {
        c ++ ;
      }
    }
  }
  return c ;
}
