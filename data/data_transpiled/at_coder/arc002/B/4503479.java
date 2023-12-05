@ Nullable public static Date toDate ( @ Nullable String input ) {
  int Y = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int D = Integer . parseInt ( input ) ;
  Calendar calendar = Calendar . getInstance ( ) ;
  calendar . set ( Calendar . YEAR , Y ) ;
  calendar . set ( Calendar . MONTH , M ) ;
  calendar . set ( Calendar . DATE , D ) ;
  Date ddt = new Date ( ) ;
  do {
    int y = calendar . get ( Calendar . YEAR ) ;
    int m = calendar . get ( Calendar . MONTH ) ;
    int d = calendar . get ( Calendar . DATE ) ;
    if ( y % ( m * d ) == 0 ) {
      System . out . println ( calendar . getTime ( ) ) ;
      break ;
    }
    calendar . setTime ( ddt ) ;
  }
  while ( true ) ;
  return ddt ;
}
