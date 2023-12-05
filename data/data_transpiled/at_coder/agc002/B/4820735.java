public static int [ ] readIntLine ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] red = new int [ N ] ;
  red [ 0 ] = 1 ;
  int [ ] num = new int [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    num [ x - 1 ] -- ;
    num [ y - 1 ] ++ ;
    if ( red [ x - 1 ] == 1 ) {
      red [ y - 1 ] = 1 ;
      if ( num [ x - 1 ] == 0 ) {
        red [ x - 1 ] = 0 ;
      }
    }
  }
  return red ;
}
