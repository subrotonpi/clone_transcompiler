static final String [ ] [ ] solve ( int nV , int [ ] vert , int [ ] walls ) {
  if ( walls . length == 0 ) {
    return new String [ ] [ ] {
      vert }
      ;
    }
    int a = walls [ 0 ] ;
    int b = walls [ 1 ] ;
    String [ ] [ ] v1 = new String [ vert . length ] [ ] ;
    String [ ] [ ] v2 = new String [ vert . length ] [ ] ;
    String [ ] [ ] w1 = new String [ vert . length ] [ ] ;
    String [ ] [ ] w2 = new String [ vert . length ] [ ] ;
    for ( int i = 0 ;
    i < vert . length ;
    i ++ ) {
      int v = vert [ i ] ;
      if ( v >= a && v <= b ) {
        v1 [ i ] = v ;
      }
      if ( ! ( v > a && v < b ) ) {
        v2 [ i ] = v ;
      }
    }
    for ( int i = 1 ;
    i < walls . length ;
    i ++ ) {
      int test = Integer . parseInt ( walls [ i ] ) ;
      int nV = Integer . parseInt ( walls [ i ] ) ;
      int [ ] line1 = walls [ i ] ;
      int [ ] line2 = walls [ i ] ;
      int [ ] [ ] res = solve ( nV , line1 , line2 ) ;
      String [ ] [ ] col = new String [ col . length ] [ 2 ] ;
      for ( int j = 0 ;
      j < col . length ;
      j ++ ) {
        int x = Integer . parseInt ( walls [ i ] [ j ] ) ;
        int y = Integer . parseInt ( walls [ i ] [ j ] ) ;
        if ( x >= a && y <= b ) {
          w1 [ i ] = w ;
        }
        else {
          w2 [ i ] = w ;
        }
      }
    }
    return new String [ ] [ ] {
      doSplit ( nV , v1 , w1 ) , doSplit ( nV , v2 , w2 ) , a , b }
      ;
    }
    