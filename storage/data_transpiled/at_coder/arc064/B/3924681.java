public static void main ( String s ) {
  Scanner scanner = new Scanner ( System . in ) ;
  System . out . print ( s ) ;
  if ( s . charAt ( 0 ) == s . charAt ( s . length ( ) - 1 ) ) {
    if ( s . length ( ) % 2 == 1 ) {
      System . out . println ( "Second" ) ;
    }
    else {
      System . out . println ( "First" ) ;
    }
  }
  else {
    if ( s . length ( ) % 2 == 1 ) {
      System . out . println ( "First" ) ;
    }
    else {
      System . out . println ( "Second" ) ;
    }
  }
}
