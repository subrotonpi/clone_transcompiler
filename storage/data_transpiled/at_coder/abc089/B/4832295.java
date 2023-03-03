public static void print ( String s ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] s = input . split ( " " ) ;
  int ans = new HashSet < > ( Arrays . asList ( s ) ) . size ( ) ;
  if ( ans == 3 ) {
    System . out . println ( "Three" ) ;
  }
  else {
    System . out . println ( "Four" ) ;
  }
}
