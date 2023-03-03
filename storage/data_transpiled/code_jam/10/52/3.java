static final String solve ( Data d ) throws IOException {
  final int [ ] a = new int [ 100000 ] ;
  Arrays . fill ( a , - 1 ) ;
  final Scanner in = new Scanner ( System . in ) ;
  final PrintWriter out = new PrintWriter ( System . out ) ;
  in . nextLine ( ) ;
  out . println ( "Test " + name ) ;
  in . nextLine ( ) ;
  out . println ( "Test " + name ) ;
  in . nextLine ( ) ;
  out . println ( "Test " + name ) ;
  in . nextLine ( ) ;
  out . println ( "Test " + name ) ;
  in . nextLine ( ) ;
  out . println ( "Test " + name ) ;
  in . nextLine ( ) ;
  out . println ( "Test " + name ) ;
  in . nextLine ( ) ;
  out . println ( "Test " + name ) ;
  in . nextLine ( ) ;
  out . println ( "Test " + name ) ;
  in . nextLine ( ) ;
  out . println ( "Test " + name ) ;
  in . nextLine ( ) ;
  out . println ( "Test " + name ) ;
  in . nextLine ( ) ;
  out . println ( "Test " + name ) ;
  in . close ( ) ;
  out . println ( "Test " + name ) ;
  while ( in . hasNext ( ) ) {
    int b = in . nextInt ( ) ;
    for ( int i = 0 ;
    i < b ;
    i ++ ) {
      int c = ( b + d . b [ i ] ) % d . b [ en ] ;
      if ( a [ c ] == - 1 || ( a [ c ] [ 0 ] - a [ c ] [ 1 ] / d . b [ en ] > a [ b ] [ 0 ] + 1 - ( a [ b ] [ 1 ] + d . b [ i ] ) / d . b [ en ] ) ) {
        a [ c ] = new int [ b ] [ a [ b ] [ 0 ] + 1 ] ;
        in . nextLine ( ) ;
        out . println ( "Test " + name ) ;
      }
    }
    if ( ( a [ want ] != - 1 ) && ( a [ want ] [ 1 ] == - 1 ) ) {
      return ( d . l - a [ want ] [ 1 ] ) / d . b [ en ] + a [ want ] [ 0 ] ;
    }
  }
  return "IMPOSSIBLE" ;
}
