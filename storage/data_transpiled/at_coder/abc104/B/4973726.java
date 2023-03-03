static final String getCharacter ( ) {
  StringBuilder S = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
    S . append ( input . charAt ( i ) ) ;
  }
  if ( S . charAt ( 0 ) != 'A' ) {
    System . out . println ( "WA" ) ;
    System . exit ( 0 ) ;
  }
  else {
    S . setCharAt ( 0 , 'a' ) ;
  }
  int ct = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( S . charAt ( i ) == 'A' ) {
    }
    else {
      System . out . println ( "WA" ) ;
      System . exit ( 0 ) ;
    }
  }
  return S . toString ( ) ;
}
