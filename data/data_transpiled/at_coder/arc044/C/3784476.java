static final int [ ] getStdIn ( ) {
  int W = Integer . parseInt ( input . readLine ( ) ) ;
  int H = Integer . parseInt ( input . readLine ( ) ) ;
  int Q = Integer . parseInt ( input . readLine ( ) ) ;
  Map < Integer , Integer > vBeam = new HashMap < > ( ) , hBeam = new HashMap < > ( ) ;
  float inf = Float . POSITIVE_INFINITY ;
  for ( int t = 0 , d = Integer . parseInt ( input . readLine ( ) ) ;
  t < W ;
  t ++ ) {
    int d = Integer . parseInt ( input . readLine ( ) ) ;
    int x = Integer . parseInt ( input . readLine ( ) ) ;
    if ( d == 0 ) {
      vBeam . put ( t , x ) ;
    }
    else {
      hBeam . put ( t , x ) ;
    }
  }
  int [ ] dpx = new int [ W + 2 ] , dpy = new int [ H + 2 ] ;
  for ( int [ ] dp : ( ( dpx [ 0 ] ) , ( vBeam [ 0 ] ) , ( dpy [ 0 ] ) , ( hBeam [ 0 ] ) ) ) {
    Map < Integer , Integer > beam = new HashMap < > ( ) ;
    beam . put ( 0 , dp ) ;
    for ( final Map . Entry < Integer , Integer > a : new TreeMap < > ( beam ) . entrySet ( ) ) {
      a . getValue ( ) ;
      a . getValue ( ) ;
      int prev = a . getKey ( ) - 1 ;
      float prev_v = inf ;
      for ( int i = 1 , j = a . getValue ( ) ;
      i < j ;
      i ++ ) {
        if ( prev_v > dp [ i ] + i - prev ) {
          prev_v = dp [ i ] + i - prev ;
        }
        if ( dp [ i + 1 ] > dp [ i ] + 1 ) {
          dp [ i + 1 ] = dp [ i ] + 1 ;
        }
        dp [ i ] = inf ;
        if ( i + 1 != j ) {
          if ( dp [ prev ] > prev_v ) {
            dp [ prev ] = prev_v ;
          }
          prev = j - 1 ;
          prev_v = inf ;
        }
      }
    }
  }
  int ans = Math . min ( dpx , 1 , W - 1 ) + Math . min ( dpy , 1 , Q - 1 ) ;
  System . out . println ( ans < inf ? ans : - 1 ) ;
  return null ;
}
