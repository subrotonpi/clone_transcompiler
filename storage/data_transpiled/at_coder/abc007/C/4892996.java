@ VisibleForTesting static Collection < Pair < Integer , Integer >> filterSpaceList ( String [ ] strs ) {
  List < Pair < Integer , Integer >> spaceList = new ArrayList < > ( ) ;
  int h = 1 ;
  for ( String str : strs ) {
    int w = 1 ;
    for ( char c : str . toCharArray ( ) ) {
      if ( c == '.' ) {
        spaceList . add ( new Pair < > ( h , w ) ) ;
      }
      w ++ ;
    }
    h ++ ;
  }
  return spaceList ;
}
