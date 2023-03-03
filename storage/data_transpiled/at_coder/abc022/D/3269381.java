@ VisibleForTesting static void grahamScan ( @ Nonnull List < Integer > vertices ) {
  Collections . sort ( vertices , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      int baseX = o1 . intValue ( ) ;
      int baseY = o2 . intValue ( ) ;
      List < Integer > list = new ArrayList < > ( ) ;
      for ( int l = 0 ;
      l < l ;
      l ++ ) list . add ( Integer . valueOf ( o1 . intValue ( ) ) ) ;
      List < Integer > convexA = grahamScan ( list ) ;
      List < Integer > convExB = grahamScan ( list ) ;
      System . out . println ( rotatingCalipers ( convExB ) . get ( 2 ) / rotatingCalipers ( convexA ) . get ( 2 ) ) ;
      List < Integer > convex = list . subList ( list . size ( ) - 1 , list . size ( ) + 1 ) ;
      ListIterator < Integer > pop = convex . listIterator ( ) ;
      ListIterator < Integer > append = convex . listIterator ( ) ;
      int lastX = 0 , lastY = 0 ;
      for ( int i = 0 ;
      i < vertices . size ( ) ;
      i ++ ) {
        int point = vertices . get ( i ) ;
        final int x = vertices . get ( i + 1 ) ;
        final int y = vertices . get ( j + 1 ) ;
        while ( ( ( x - lastX ) * ( convex . get ( convex . size ( ) - 2 ) . get ( 1 ) - lastY ) - ( y - lastY ) * ( convex . get ( convex . size ( ) - 2 ) . get ( 0 ) - lastX ) ) < 0 ) {
          pop . previous ( ) ;
          lastX = convex . get ( i + 1 ) ;
          lastY = convex . get ( j + 1 ) ;
        }
        append . previous ( point ) ;
        lastX = point ;
        lastY = point ;
      }
      return convex . listIterator ( ) ;
    }
  }
  ) ;
}
