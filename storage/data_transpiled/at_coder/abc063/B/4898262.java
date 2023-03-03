public static void print ( String s ) {
  Set < String > t = new HashSet < String > ( ) ;
  t . add ( s ) ;
  if ( s . length ( ) == t . size ( ) ) {
    System . out . println ( "yes" ) ;
  }
  else {
    System . out . println ( "no" ) ;
  }
}
