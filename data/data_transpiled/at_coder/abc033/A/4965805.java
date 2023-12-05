public static String s ( ) {
  String s = input . nextLine ( ) ;
  if ( s . charAt ( 0 ) == s . charAt ( 1 ) == s . charAt ( 2 ) == s . charAt ( 3 ) ) {
    System . out . println ( "SAME" ) ;
  }
  else {
    System . out . println ( "DIFFERENT" ) ;
  }
  return s ;
}
