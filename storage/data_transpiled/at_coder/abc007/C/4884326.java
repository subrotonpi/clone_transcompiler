@ VisibleForTesting static LinkedHashMap < String , Integer > filterSpaceList ( String [ ] strs ) {
  List < String > spaceList = new ArrayList < String > ( ) ;
  int h = 1 ;
  for ( String str : strs ) {
    int w = 1 ;
    for ( char c : str . toCharArray ( ) ) {
      if ( c == '.' ) {
        spaceList . add ( new Integer ( h ) ) ;
      }
      w ++ ;
    }
    h ++ ;
  }
  return spaceList ;
}
