public static int T = Integer . parseInt ( Scanner in ) {
  for ( int x = xrange ( 1 , T + 1 ) ;
  x <= xrange ( 1 , T + 1 ) ;
  x ++ ) {
    int N = Integer . parseInt ( in . nextLine ( ) ) ;
    List < Integer > trees = new ArrayList < > ( ) ;
    for ( int j = xrange ( N ) ;
    j < N ;
    j ++ ) trees . add ( Integer . parseInt ( in . nextLine ( ) ) + j ) ;
    Collections . sort ( trees ) ;
    /*boundary */
    boolean [ ] res = new boolean [ N ] ;
    if ( trees . size ( ) <= 3 ) {
      for ( int t = 0 ;
      t < trees . size ( ) ;
      t ++ ) res [ t ] = true ;
      return res ;
    }
    int a = trees . get ( 0 ) ;
    do {
      int b = trees . get ( 0 ) ;
      for ( int j = 1 ;
      j < trees . size ( ) ;
      j ++ ) {
        if ( b == a ) b = trees . get ( j ) ;
        else {
          int xab = trees . get ( b ) . x - trees . get ( a ) . x ;
          int yab = trees . get ( b ) . y - trees . get ( a ) . y ;
          int xaj = trees . get ( j ) . x - trees . get ( a ) . x ;
          int yaj = trees . get ( j ) . y - trees . get ( a ) . y ;
          int v = xab * yaj - xaj * yab ;
          if ( v > 0 || v == 0 && xaj * xaj + yaj * yaj > xab * xab + yab * yab ) b = trees . get ( j ) ;
        }
      }
      for ( int j = 1 ;
      j < trees . size ( ) ;
      j ++ ) {
        int xab = trees . get ( b ) . x - trees . get ( a ) . x ;
        int yab = trees . get ( b ) . y - trees . get ( a ) . y ;
        int xaj = trees . get ( j ) . x - trees . get ( a ) . x ;
        int yaj = trees . get ( j ) . y - trees . get ( a ) . y ;
        if ( xab * yaj - xaj * yab == 0 ) res [ j ] = true ;
      }
      a = b ;
      if ( a