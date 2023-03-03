@ VisibleForTesting static List < List < Point >> grahamScan ( List < Point > vertices ) {
  Collections . sort ( vertices , new Comparator < Point > ( ) {
    @ Override public int compare ( Point o1 , Point o2 ) {
      int baseX = o1 . x ;
      int baseY = o2 . y ;
      vertices = new ArrayList < > ( vertices ) ;
      vertices . add ( o1 ) ;
      vertices . add ( o2 ) ;
      return Math . atan2 ( o2 . y - baseY , o1 . x - baseX ) ;
    }
  }
  ) ;
  List < List < Point >> convex = vertices . subList ( vertices . size ( ) - 1 , vertices . size ( ) ) ;
  final Consumer < List < Point >> pop = convex :: pop ;
  final Consumer < List < Point >> append = convex :: add ;
  int lastX = convex . get ( 0 ) . size ( ) ;
  int lastY = 0 ;
  for ( int i = 1 ;
  i < vertices . size ( ) ;
  i ++ ) {
    final List < Point > point = vertices . get ( i ) ;
    final int x = point . get ( 0 ) . x ;
    final int y = point . get ( 1 ) . y ;
    while ( ( ( x - lastX ) * ( convex . get ( convex . size ( ) - 2 ) . y - lastY ) ) - ( ( y - lastY ) * ( convex . get ( convex . size ( ) - 2 ) . x - lastX ) ) < 0 ) {
      pop . accept ( ) ;
      lastX = convex . get ( 0 ) . size ( ) ;
      lastY = convex . get ( 0 ) . size ( ) ;
    }
    append . accept ( point ) ;
    lastX = point . get ( 0 ) . size ( ) ;
    lastY = point . get ( 1 ) . size ( ) ;
  }
  return convex . subList ( 0 , convex . size ( ) - 1 ) ;
}
