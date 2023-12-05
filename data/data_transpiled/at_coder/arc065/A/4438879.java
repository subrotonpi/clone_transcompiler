@ Nonnull public static String solve ( String s ) {
  Stack < String > stack = new Stack < > ( ) ;
  stack . push ( s ) ;
  while ( stack . size ( ) > 0 ) {
    String top = stack . pop ( ) ;
    if ( top . isEmpty ( ) ) {
      return "YES" ;
    }
    if ( top . length ( ) > 5 ) {
      if ( top . startsWith ( "dream" ) ) {
        if ( top . length ( ) > 5 && top . charAt ( 5 ) == 'er' ) {
          stack . push ( top . substring ( 7 ) ) ;
        }
        stack . push ( top . substring ( 5 ) ) ;
      }
    }
    else {
      stack . push ( top ) ;
    }
  }
  return "NO" ;
}
