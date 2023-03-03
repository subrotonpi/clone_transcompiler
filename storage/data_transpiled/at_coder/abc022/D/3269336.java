@ VisibleForTesting static void grahamScan ( @ Nonnull List < Integer > vertices ) {
  Collections . sort ( vertices , ( o1 , o2 ) -> {
    int baseX = o1 . intValue ( ) ;
    int baseY = o2 . intValue ( ) ;
    List < Integer > list = new ArrayList < > ( ) ;
    for ( int l = o1 . intValue ( ) ;
    l < o2 . intValue ( ) ;
    l ++ ) {
      list . add ( o1 . intValue ( ) ) ;
    }
    List < Integer > convexA = grahamScan ( A ) ;
    List < Integer > convExB = grahamScan ( B ) ;
    System . out . println ( rotatingCalipers ( convExB ) . get ( 2 ) / rotatingCalipers ( convexA ) . get ( 2 ) ) ;
    List < Integer > convex = list . subList ( list . size ( ) - 1 , list . size ( ) ) ;
    pop = convex . pop ( ) ;
    append = convex . append ( ) ;
    int lastX = convex . get ( 0 ) ;
    int lastY = convex . get ( 0 ) ;
    for ( int i = 1 ;
    i < vertices . size ( ) ;
    i ++ ) {
      int point = vertices . get ( i ) ;
      final int x = vertices . get ( i + 1 ) ;
      final int y = vertices . get ( j + 1 ) ;
      while ( ( ( x - lastX ) * ( convex . get ( convex . size ( ) - 2 ) . get ( 1 ) - lastY ) - ( y - lastY ) * ( convex . get ( convex . size ( ) - 2 ) . get ( 0 ) - lastX ) ) < 0 ) {
        pop . remove ( ) ;
        lastX = convex . get ( 0 ) ;
        lastY = convex . get ( 1 ) ;
      }
      append . add ( point ) ;
      lastX = point ;
      lastY = point ;
    }
    return convex . get ( 0 ) ;
  }
  ) ;
}
