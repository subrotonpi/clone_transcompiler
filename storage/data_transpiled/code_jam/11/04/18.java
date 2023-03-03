public static int T = Integer . parseInt ( Scanner in ) {
  for ( int repeat = 0 ;
  repeat < T ;
  repeat ++ ) {
    in . nextLine ( ) ;
    String [ ] line = in . nextLine ( ) . split ( " " ) ;
    int [ ] data = new int [ line . length ] ;
    int [ ] newd = new int [ line . length ] ;
    for ( int i = 0 ;
    i < line . length ;
    i ++ ) {
      data [ i ] = Integer . parseInt ( line [ i ] ) ;
      newd [ i ] = Integer . parseInt ( line [ i ] ) ;
    }
    Arrays . sort ( newd ) ;
    int count = 0 ;
    for ( int i = 0 ;
    i < data . length ;
    i ++ ) if ( data [ i ] != newd [ i ] ) count ++ ;
    System . out . println ( "Case #" + ( repeat + 1 ) + ": " + count + " " + ( repeat + 1 ) ) ;
  }
  return T ;
}
