public static void print ( String s ) {
  int n = s . length ( ) ;
  if ( n % 2 == 0 && s . charAt ( 0 ) != s . charAt ( n - 1 ) ) {
    System . out . println ( "Second" ) ;
  }
  else if ( n % 2 == 1 && s . charAt ( 0 ) == s . charAt ( n - 1 ) ) {
    System . out . println ( "Second" ) ;
  }
  else {
    System . out . println ( "First" ) ;
  }
}
