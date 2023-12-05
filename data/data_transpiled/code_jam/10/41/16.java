private static void solveCase ( int caseIndex , BufferedReader in , PrintStream out ) throws IOException {
  int k = Integer . parseInt ( in . readLine ( ) ) ;
  int size = 2 * k - 1 ;
  int center = k - 1 ;
  char buffer [ ] = size * " " ;
  char [ ] [ ] diamond = new char [ size ] [ ] ;
  for ( int i = 0 ;
  i < size ;
  i ++ ) {
    String line = ( in . readLine ( ) ) . toCharArray ( ) ;
    int numCases = Integer . parseInt ( line ) . substring ( 0 , i ) ;
    solveCase ( caseIndex , in , out ) ;
    out . flush ( ) ;
  }
  if ( className . equals ( "__main__" ) ) {
    solve ( "A-small-attempt3.in.in" ) ;
  }
  /* if (x < 0 || x > size) return null; if (y < 0 || y > size) return null; */
  int x_max = Math . min ( x , ( 2 * k - 2 ) - x ) + 1 ;
  int y_max = Math . min ( y , ( 2 * k - 2 ) - y ) + 1 ;
  for ( int x_offset : xrange ( size ) ) {
    for ( int y_offset : xrange ( size ) ) {
      char [ ] item = getDiamond ( x_offset , y_offset ) ;
      char [ ] next = getDiamond ( x_offset , y_offset ) ;
      if ( next != null ) {
        if ( item != null && item != next ) return false ;
        item = next ;
      }
      next = getDiamond ( x_offset , y_offset ) ;
      if ( next != null ) {
        if ( item != null && item != next ) return false ;
        item = next ;
      }
      next = getDiamond ( x_offset , y_offset ) ;
      if ( next != null ) {
        if ( item != null && item != next ) return false ;
        item = next ;
      }
    }
  }
  if ( ! found ) System . out . println ( "No match, defaulting to " + ( 2 * k ) * k + " - " + k * k ) ;
  String message = "Case #" + caseIndex + ": " + cost + "\n" ;
  out . println ( message ) ;
}
