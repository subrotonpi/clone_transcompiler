static final int present ( int N , @ Nonnull List < ? extends Number > boxes ) {
  List < Number > sortedBoxes = new ArrayList < > ( Arrays . asList ( boxes ) ) ;
  Collections . sort ( sortedBoxes , new Comparator < Number > ( ) {
    @ Override public int compare ( Number o1 , Number o2 ) {
      return - o1 . intValue ( ) ;
    }
  }
  ) ;
  final int w = sortedBoxes . get ( 0 ) . intValue ( ) ;
  List < Integer > wrapping = new ArrayList < > ( ) ;
  wrapping . add ( w ) ;
  for ( final int i = 0 ;
  i < sortedBoxes . size ( ) ;
  i ++ ) {
    if ( wrapping . get ( i ) . intValue ( ) < w ) {
      wrapping . add ( i ) ;
    }
    else {
      wrapping . set ( Integer . valueOf ( i ) ) ;
    }
  }
  return wrapping . size ( ) ;
}
