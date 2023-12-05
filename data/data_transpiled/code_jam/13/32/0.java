@ Sys public static String print ( ) {
  int ntest = input . nextInt ( ) ;
  for ( int test : xrange ( ntest ) ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) , y = Integer . parseInt ( input . nextLine ( ) ) ;
    int l = Math . abs ( x ) + Math . abs ( y ) ;
    int n = ( int ) Math . sqrt ( 2 * l ) - 1 ;
    String result ;
    StringBuilder path = new StringBuilder ( ) ;
    int curx = x ;
    int cury = y ;
    for ( int i = xrange ( n , 0 , - 1 ) ;
    i >= 0 ;
    i -- ) {
      if ( Math . abs ( curx ) > Math . abs ( cury ) ) {
        if ( curx > 0 ) {
          path . append ( 'E' ) ;
          curx -= i ;
        }
        else {
          path . append ( 'W' ) ;
          curx += i ;
        }
      }
      else {
        if ( cury > 0 ) {
          path . append ( 'N' ) ;
          cury -= i ;
        }
        else {
          path . append ( 'S' ) ;
          cury += i ;
        }
      }
    }
    if ( curx == 0 && cury == 0 ) {
      result = path . toString ( ) ;
      break ;
    }
    n ++ ;
  }
  System . out . println ( "Case #" + ( test + 1 ) + ": " + result ) ;
  return result ;
}
