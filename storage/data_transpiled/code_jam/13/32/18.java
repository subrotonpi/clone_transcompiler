static final int T = Integer . parseInt ( Scanner in ) {
  int t = in . nextInt ( ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    List < String > line = Arrays . asList ( in . nextLine ( ) . split ( " " ) ) ;
    int x = Integer . parseInt ( line . get ( 0 ) ) ;
    int y = Integer . parseInt ( line . get ( 1 ) ) ;
    char [ ] path = new char [ ( Math . abs ( x ) + Math . abs ( y ) ) * 2 ] ;
    for ( int i = 0 ;
    i < Math . abs ( x ) ;
    i ++ ) {
      if ( x > 0 ) {
        path [ 2 * i ] = 'W' ;
        path [ 2 * i + 1 ] = 'E' ;
      }
      else {
        path [ 2 * i ] = 'E' ;
        path [ 2 * i + 1 ] = 'W' ;
      }
    }
    int m = 2 * Math . abs ( x ) ;
    for ( int i = 0 ;
    i < Math . abs ( y ) ;
    i ++ ) {
      if ( y > 0 ) {
        path [ m + 2 * i ] = 'S' ;
        path [ m + 2 * i + 1 ] = 'N' ;
      }
      else {
        path [ m + 2 * i ] = 'N' ;
        path [ m + 2 * i + 1 ] = 'S' ;
      }
    }
    System . out . println ( "Case #" + ( t + 1 ) + ": " + Arrays . toString ( path ) ) ;
  }
  return t ;
}
