public static void print ( String input ) {
  int r = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int x = Integer . parseInt ( input ) ;
  int y = Integer . parseInt ( input ) ;
  int left = 0 ;
  int right = Math . min ( r , b ) + 1 ;
  while ( right - left > 1 ) {
    int m = ( right + left ) / 2 ;
    int cnt = ( r - m ) / ( x - 1 ) + ( b - m ) / ( y - 1 ) ;
    if ( cnt < m ) {
      right = m ;
    }
    else {
      left = m ;
    }
  }
  System . out . println ( left ) ;
}
