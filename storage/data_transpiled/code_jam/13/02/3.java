public static void input ( Scanner in ) {
  int re = in . nextInt ( ) ;
  for ( int ri : xrange ( re ) ) {
    int r = in . nextInt ( ) ;
    int c = in . nextInt ( ) ;
    int [ ] a = Arrays . stream ( in . nextInt ( ) , Integer . MAX_VALUE ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
    int [ ] [ ] x = Arrays . stream ( in . nextInt ( ) , Integer . MAX_VALUE ) . mapToInt ( Integer :: max ) . toArray ( ) ;
    int [ ] [ ] y = Arrays . stream ( in . nextInt ( ) , Integer . MAX_VALUE ) . mapToInt ( Integer :: max ) . toArray ( ) ;
    int [ ] [ ] b = Arrays . stream ( in . nextInt ( ) , Integer . MAX_VALUE ) . mapToInt ( Integer :: min ) . toArray ( ) ;
    for ( int j = 0 ;
    j < r ;
    j ++ ) {
      for ( int i = 0 ;
      i < x . length ;
      i ++ ) {
        b [ j ] [ i ] = Math . min ( x [ i ] , y [ j ] ) ;
      }
    }
    System . out . println ( "Case #" + ( ri + 1 ) + ": " + ( a == b ) ? "YES" : "NO" ) ;
  }
}
