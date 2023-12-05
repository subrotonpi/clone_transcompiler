public static void print ( String input ) {
  int r = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int x = Integer . parseInt ( input ) ;
  int y = Integer . parseInt ( input ) ;
  int ok = 0 ;
  int ng = 10 * 18 ;
  while ( Math . abs ( ok - ng ) > 1 ) {
    int mid = ( ok + ng ) / 2 ;
    if ( Math . min ( r , b ) < mid ) {
      ng = mid ;
    }
    else {
      int pr = r - mid ;
      int pb = b - mid ;
      if ( mid > pr / ( x - 1 ) + pb / ( y - 1 ) ) {
        ng = mid ;
      }
      else {
        ok = mid ;
      }
    }
  }
  System . out . println ( ok ) ;
}
