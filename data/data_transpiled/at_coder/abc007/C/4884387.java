@ VisibleForTesting static LinkedHashMap < Space , Integer > filterSpaceList ( String [ ] strs ) {
  List < Space > spaceList = new ArrayList < > ( ) ;
  int h = 1 ;
  for ( String str : strs ) {
    int w = 1 ;
    for ( char c : str . toCharArray ( ) ) {
      if ( c == '.' ) {
        spaceList . add ( new Space ( h , w ) ) ;
      }
      w ++ ;
    }
    h ++ ;
  }
  return spaceList ;
}
