public static void print ( String s ) {
  if ( ( ( s . length ( ) % 2 ) + ( s . charAt ( 0 ) == s . charAt ( s . length ( ) - 1 ) ) ) % 2 ) {
    System . out . println ( "First" ) ;
  }
  else {
    System . out . println ( "Second" ) ;
  }
}
