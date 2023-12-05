public static void main ( String s ) {
  String s = input . nextLine ( ) ;
  if ( s . charAt ( 0 ) == s . charAt ( s . length ( ) - 1 ) && s . length ( ) % 2 == 0 ) {
    System . out . println ( "First" ) ;
  }
  else if ( s . charAt ( 0 ) != s . charAt ( s . length ( ) - 1 ) && s . length ( ) % 2 == 1 ) {
    System . out . println ( "First" ) ;
  }
  else {
    System . out . println ( "Second" ) ;
  }
}
