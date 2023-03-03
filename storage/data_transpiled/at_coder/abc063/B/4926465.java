public static void print ( String s ) {
  if ( s . length ( ) == new HashSet < String > ( Collections . singleton ( s ) ) . size ( ) ) {
    System . out . println ( "yes" ) ;
  }
  else {
    System . out . println ( "no" ) ;
  }
}
