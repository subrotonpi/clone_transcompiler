public static void print ( String s ) {
  if ( ( s . length ( ) % 2 == 0 && s . charAt ( 0 ) == s . charAt ( s . length ( ) - 1 ) ) || ( s . length ( ) % 2 != 0 && s . charAt ( 0 ) != s . charAt ( s . length ( ) - 1 ) ) ) {
    System . out . println ( "First" ) ;
  }
  else {
    System . out . println ( "Second" ) ;
  }
}
