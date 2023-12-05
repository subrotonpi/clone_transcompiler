public static void print ( String s ) {
  s = list ( input ) ;
  int n = s . length ( ) ;
  if ( ( s . charAt ( 0 ) == s . charAt ( n - 1 ) && n % 2 == 0 ) || ( s . charAt ( 0 ) != s . charAt ( n - 1 ) && n % 2 != 0 ) ) {
    System . out . println ( "First" ) ;
  }
  else {
    System . out . println ( "Second" ) ;
  }
}
