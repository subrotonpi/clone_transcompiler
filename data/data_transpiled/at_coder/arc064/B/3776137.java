public static String S = input ( ) {
  if ( S . charAt ( 0 ) == S . charAt ( S . length ( ) - 1 ) ) {
    if ( S . length ( ) % 2 == 0 ) {
      System . out . println ( "First" ) ;
    }
    else {
      System . out . println ( "Second" ) ;
    }
  }
  else {
    if ( S . length ( ) % 2 == 1 ) {
      System . out . println ( "First" ) ;
    }
    else {
      System . out . println ( "Second" ) ;
    }
  }
  return S ;
}
