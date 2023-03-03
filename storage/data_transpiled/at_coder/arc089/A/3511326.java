public static void print ( int N ) {
  int t0 = 0 , x0 = 0 , y0 = 0 ;
  String judge = "Yes" ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int t = Integer . parseInt ( input . nextLine ( ) ) ;
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( Math . abs ( x - x0 ) + Math . abs ( y - y0 ) <= t - t0 && ( Math . abs ( x - x0 ) + Math . abs ( y - y0 ) - ( t - t0 ) ) % 2 == 0 ) {
      x0 = x ;
      y0 = y ;
      t0 = t ;
    }
    else {
      judge = "No" ;
      break ;
    }
  }
  System . out . println ( judge ) ;
}
