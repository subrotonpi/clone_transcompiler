public static void print ( String s ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  Set < String > s = new HashSet < String > ( ) ;
  s . add ( input . nextLine ( ) ) ;
  if ( s . size ( ) == 3 ) {
    System . out . println ( "Three" ) ;
  }
  else {
    System . out . println ( "Four" ) ;
  }
}
