public static int N = Integer . parseInt ( input ) {
  String [ ] S = input . split ( " " ) ;
  if ( new HashSet < > ( Arrays . asList ( S ) ) . size ( ) == 3 ) {
    System . out . println ( "Three" ) ;
  }
  else {
    System . out . println ( "Four" ) ;
  }
  return N ;
}
