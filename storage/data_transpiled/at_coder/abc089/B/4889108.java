public static int N = Integer . parseInt ( input ) {
  List = new LinkedList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    List . add ( input . nextLine ( ) ) ;
  }
  if ( List . stream ( ) . filter ( n -> n > 'Y' ) . count ( ) > 0 ) {
    System . out . println ( "Four" ) ;
  }
  else {
    System . out . println ( "Three" ) ;
  }
  return N ;
}
