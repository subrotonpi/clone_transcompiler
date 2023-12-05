public static void main ( String input ) {
  Scanner s = new Scanner ( System . in ) ;
  int n = s . nextInt ( ) ;
  if ( s . charAt ( 0 ) == s . charAt ( n - 1 ) ) {
    if ( n % 2 == 0 ) {
      System . out . println ( "First" ) ;
    }
    else {
      System . out . println ( "Second" ) ;
    }
  }
  else {
    if ( n % 2 == 0 ) {
      System . out . println ( "Second" ) ;
    }
    else {
      System . out . println ( "First" ) ;
    }
  }
}
