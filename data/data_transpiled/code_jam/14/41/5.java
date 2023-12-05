public static int cases = Integer . parseInt ( Scanner in ) {
  for ( int tc : xrange ( cases ) ) {
    int n = in . nextInt ( ) ;
    int m = in . nextInt ( ) ;
    int [ ] size = new int [ n ] ;
    for ( int i = 0 ;
    i < size . length ;
    i ++ ) size [ i ] = in . nextInt ( ) ;
    Arrays . sort ( size ) ;
    int res = 0 ;
    while ( 2 <= size . length ) {
      if ( size [ 0 ] + size [ size . length - 1 ] <= m ) size = size . subList ( 1 , size . length - 1 ) ;
      else size = size . subList ( 0 , size . length - 1 ) ;
      res ++ ;
    }
    if ( size . length > 0 ) res ++ ;
    System . out . println ( "Case #" + ( tc + 1 ) + ": " + res ) ;
  }
  return cases ;
}
