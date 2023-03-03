public static void print ( String s ) {
  s = String . valueOf ( input . nextLine ( ) ) ;
  if ( s . charAt ( 0 ) == s . charAt ( 1 ) == s . charAt ( 2 ) ) {
    System . out . println ( "Yes" ) ;
  }
  else if ( s . charAt ( 1 ) == s . charAt ( 2 ) == s . charAt ( 3 ) ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
