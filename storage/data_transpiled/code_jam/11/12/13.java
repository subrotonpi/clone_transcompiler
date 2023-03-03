@ VisibleForTesting static boolean test ( String [ ] words , char c , Set < String > denied ) {
  for ( String word : words ) {
    if ( word . contains ( c ) && ! new HashSet < > ( word ) . containsAll ( denied ) ) {
      return true ;
    }
  }
  return false ;
}
