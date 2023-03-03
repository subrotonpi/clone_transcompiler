@ GwtIncompatible ( "java.util.Scanner" ) public static double atan ( double x , double y ) {
  int testcases = input . nextInt ( ) ;
  for ( int testCase : xrange ( 1 , testcases + 1 ) ) {
    int numTrees = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] [ ] trees = new int [ numTrees ] [ numTrees ] ;
    for ( int n = 0 ;
    n < numTrees ;
    n ++ ) trees [ n ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
    System . out . println ( "Case #" + ( testCase ) + ":" ) ;
    for ( int i = 0 ;
    i < numTrees ;
    i ++ ) {
      double [ ] rAngles = new double [ numTrees ] , lAngles = new double [ numTrees ] ;
      for ( int j = 0 ;
      j < numTrees ;
      j ++ ) {
        if ( j == i ) continue ;
        int dX = trees [ j ] [ 0 ] - trees [ i ] [ 0 ] ;
        int dY = trees [ j ] [ 1 ] - trees [ i ] [ 1 ] ;
        double nextVal ;
        if ( dX > 0 ) rAngles [ j ] = Math . atan ( ( double ) dY / ( double ) dX ) ;
        else if ( dX < 0 ) lAngles [ j ] = Math . atan ( ( double ) dY / ( double ) dX ) ;
        else if ( dY < 0 ) lAngles [ j ] = Math . atan ( ( double ) dY / ( double ) dX ) ;
        else if ( dY < 0 ) lAngles [ j ] = Math . atan ( ( double ) dY / ( double ) dX ) ;
        else rAngles [ j ] = Math . PI ;
      }
      Arrays . sort ( rAngles ) ;
      Arrays . sort ( lAngles ) ;
      int nR = rAngles . length , nL = lAngles . length ;
      int minR = nR , minL = nL ;
      while ( rAngles . length > 0 || lAngles . length > 0 ) {
        int nextVal ;
        if ( rAngles . length > 0 && lAngles . length > 0 ) nextVal = Math . min ( rAngles [ 0 ] , lAngles [ 0 ] ) ;
        else nextVal = rAngles [ 0 ] ;
        else nextVal = lAngles [ 0 ] ;
        int from = 0 ;
        while ( r @ @