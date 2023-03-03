public static void input ( Scanner in ) {
  int r = in . nextInt ( ) ;
  int b = in . nextInt ( ) ;
  int x = in . nextInt ( ) ;
  int y = in . nextInt ( ) ;
  int l = 10 * 18 + 1 ;
  int k = 0 ;
  while ( l - k > 1 ) {
    int s = ( l + k ) / 2 ;
    if ( r - s >= 0 && b - s >= 0 ) {
      if ( ( ( r - s ) / ( x - 1 ) ) + ( ( b - s ) / ( y - 1 ) ) >= s ) k = s ;
      else l = s ;
    }
    else l = s ;
  }
  System . out . println ( k ) ;
}
