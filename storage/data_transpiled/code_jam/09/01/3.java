static final String processCase ( String caseStr , Map < Integer , Map < String , Set < String >>> letterData , int wordlength ) throws IOException {
  int casePos = 0 ;
  Set < String > allowedWords = new HashSet < String > ( ) ;
  for ( ;
  letterPos < wordlength ;
  letterPos ++ ) {
    List < String > allowedLetters = new ArrayList < String > ( ) ;
    if ( caseStr . charAt ( casePos ) == '(' ) {
      casePos ++ ;
      while ( ( caseStr . charAt ( casePos ) != ')' ) {
        allowedLetters . add ( caseStr . charAt ( casePos ) ) ;
        casePos ++ ;
      }
      casePos ++ ;
    }
    else {
      allowedLetters . add ( caseStr . charAt ( casePos ) ) ;
      casePos ++ ;
    }
    Set < String > tempWords = new HashSet < String > ( ) ;
    for ( String l : allowedLetters ) {
      if ( letterData . get ( letterPos ) . containsKey ( l ) ) {
        tempWords . addAll ( letterData . get ( letterPos ) . get ( l ) ) ;
      }
    }
    if ( letterPos == 0 ) {
      allowedWords = tempWords ;
    }
    else {
      allowedWords . intersection_update ( tempWords ) ;
    }
  }
  return allowedWords . size ( ) ;
}
