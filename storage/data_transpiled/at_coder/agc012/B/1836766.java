static final int [ ] getLevels ( ) {
  final int [ ] [ ] levels = new int [ 3 ] [ 3 ] ;
  final double INF = Double . POSITIVE_INFINITY ;
  System . arraycopy ( levels , 0 , levels , 0 , levels . length ) ;
  final double [ ] dy = {
    0 , - 1 , 0 , 1 }
    ;
    final double [ ] dx = {
      1 , 0 , - 1 , 0 }
      ;
      /* inside the y and x */
      final int y = levels [ 0 ] ;
      final int x = levels [ 1 ] ;
      final int H = levels [ 2 ] ;
      final int W = levels [ 3 ] ;
      System . arraycopy ( levels [ 0 ] , 0 , dy , 0 , levels . length ) ;
      final int [ ] color = new int [ N ] , depth = new int [ N ] , graph = new int [ N ] ;
      /* draw the colors */
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        color [ i ] = 0 ;
      }
      for ( int i = 0 ;
      i < H ;
      i ++ ) {
        color [ i ] = 0 ;
      }
      for ( int i = 0 ;
      i < W ;
      i ++ ) {
        color [ i ] = 0 ;
      }
      for ( int i = 0 ;
      i < H ;
      i ++ ) {
        int v = levels [ i ] [ 0 ] ;
        int M = levels [ i ] [ 1 ] ;
        graph [ i ] = new int [ M ] ;
        for ( int j = 0 ;
        j < M ;
        j ++ ) {
          int a = levels [ i ] [ 0 ] ;
          int b = levels [ i ] [ 1 ] ;
          a -- ;
          b -- ;
          graph [ i ] [ 0 ] = b ;
          graph [ i ] [ 1 ] = a ;
        }
      }
      final int Q = levels [ 0 ] [ 0 ] ;
      final int [ ] q = new int [ Q ] ;
      for ( int i = 0 ;
      i < Q ;
      i ++ ) {
        int v = levels [ i ] [ 0 ] ;
        int d = levels [ i ] [ 1 ] ;
        int c = levels [ i ] [ 2 ] ;
        q [ i ] = new int [ N ] ;
        for ( int j = 0 ;
        j < N ;
        j ++ ) {
          color [ j ] = 0 ;
        }
      }
      System . arraycopy ( color , 0 , q , 0 , color . length ) ;
      return color ;
    }
    