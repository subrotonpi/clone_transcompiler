@ VisibleForTesting static LinkedHashMap < String , Integer > ddic = new LinkedHashMap < String , Integer > ( ) {
  private static final long serialVersionUID = 1000000007 ;
  {
    int [ ] dp21 = new int [ xrange ( R + 1 ) ] ;
    int [ ] dp23 = new int [ xrange ( R + 1 ) ] ;
    int [ ] dp24 = new int [ xrange ( R + 1 ) ] ;
    int [ ] dp26 = new int [ xrange ( R + 1 ) ] ;
    int [ ] dp212 = new int [ xrange ( R + 1 ) ] ;
    int [ ] dp31 = new int [ xrange ( R + 1 ) ] ;
    for ( int i = 0 ;
    i < xrange ( R + 1 ) ;
    i ++ ) {
      dp31 [ i ] = 0 ;
    }
    for ( int i = 0 ;
    i < xrange ( R + 1 ) ;
    i ++ ) {
      dp33 [ i ] = 0 ;
    }
    for ( int i = 0 ;
    i < xrange ( R + 1 ) ;
    i ++ ) {
      dp33 [ i ] = 0 ;
    }
    for ( int i = 0 ;
    i < xrange ( R + 1 ) ;
    i ++ ) {
      int tc = 0 ;
      if ( row + 2 <= R ) {
        dp26 [ row + 2 ] += 6 * dp31 [ row ] ;
        dp26 [ row + 2 ] %= PP ;
        dp33 [ row + 2 ] += 4 * dp33 [ row ] ;
        dp24 [ row + 3 ] += 4 * dp33 [ row ] ;
        dp24 [ row + 3 ] += 4 * dp33 [ row ] ;
        dp24 [ row + 3 ] += 4 * dp33 [ row + 3 ] ;
        dp24 [ row + 3 ] += 4 * dp33 [ row + 3 ] ;
        dp24 [ row + 3 ] += 4 * dp33 [ row + 3 ] ;
        dp24 [ row + 3 ] += 4 * dp33 [ row + 3 ] ;
        dp24 [ row + 3 ] += 4 * dp33 [ row + 3 ] ;
        dp24 [ row + 3 ] += 4 * dp33 [ row + 3 ] ;
        dp24 [ row + 3 ] += 4 * dp33 [ row + 3 ] ;
        dp24 [ row + 3 ] += 4 * dp33 [ row + 3 ] ;
        dp24 [ row + 3 ] += 4 * dp33 [ row + 3 ] ;
        dp24 [ row + 3 ] += 4 * dp312 [ row + 3 ] ;
      }
      