static private int [ ] [ ] readN ( String [ ] a ) {
  final int n = Integer . parseInt ( a [ 0 ] ) ;
  return new int [ ] [ ] {
    a [ 1 ] , a [ n + 1 ] }
    ;
    /* solve */
    String [ ] data = new String [ n ] ;
    int foo = readN ( data ) ;
    data [ 0 ] = a [ 0 ] ;
    data [ 1 ] = a [ 1 ] ;
    data [ 2 ] = a [ 2 ] ;
    data [ 3 ] = a [ 3 ] ;
    int X = Integer . parseInt ( data [ 0 ] ) ;
    int S = Integer . parseInt ( data [ 1 ] ) ;
    int R = Integer . parseInt ( data [ 2 ] ) ;
    int t = Integer . parseInt ( data [ 3 ] ) ;
    int N = Integer . parseInt ( data [ 4 ] ) ;
    int [ ] [ ] a = new int [ N ] [ ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int B = Integer . parseInt ( data [ i ] ) ;
      int E = Integer . parseInt ( data [ i ] ) ;
      int w = Integer . parseInt ( data [ i ] ) ;
      X -= E - B ;
      a [ i ] [ 0 ] = w ;
      a [ i ] [ 1 ] = E - B ;
    }
    a [ N ] = 0 ;
    a [ N ] = X ;
    Arrays . sort ( a ) ;
    float ret = 0.0f ;
    for ( int w = 0 ;
    w < N ;
    w ++ ) {
      int d = a [ w ] [ 0 ] ;
      float rt = ( float ) d / ( w + R ) ;
      if ( rt <= t ) {
        t -= rt ;
        ret += rt ;
      }
      else {
        double d = ( float ) d - t * ( w + R ) ;
        ret += t ;
        t = 0.0f ;
        double st = d / ( w + S ) ;
        ret += st ;
      }
    }
    return ret ;
  }
  