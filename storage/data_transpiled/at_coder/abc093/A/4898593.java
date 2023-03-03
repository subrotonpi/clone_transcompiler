private static Set < String > S = new HashSet < > ( Collections . list ( input . stream ( ) . filter ( s -> ! s . isEmpty ( ) ) . contains ( "a" ) ) ) {
  if ( S . equals ( new HashSet < > ( Arrays . asList ( "a" , "b" , "c" ) ) ) ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
