public static StringBuilder answer ( ) {
  StringBuilder answer = new StringBuilder ( ) ;
  for ( char letter : input . toCharArray ( ) ) {
    if ( letter == '1' ) {
      answer . append ( "1" ) ;
    }
    else if ( letter == '0' ) {
      answer . append ( "0" ) ;
    }
  }
  return answer ;
}
