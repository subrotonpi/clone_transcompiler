@ VisibleForTesting static void debug ( ) {
  int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    int P = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int Q = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int [ ] H = new int [ N ] , G = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int h = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
      int g = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
      H [ i ] = h ;
      G [ i ] = g ;
    }
    H = array ( H ) ;
    G = array ( G ) ;
    int C = ( ( H - 1 ) % Q ) / P + 1 ;
    T = ( H - 1 ) / Q + 1 ;
    int MAX_TIME = T >> 1 ;
    int [ ] GLD = new int [ MAX_TIME + 1 ] ;
    if ( debug ) {
      System . out . println ( P ) ;
      System . out . println ( Q ) ;
      System . out . println ( N ) ;
      System . out . println ( H ) ;
      System . out . println ( G ) ;
      System . out . println ( C ) ;
      System . out . println ( T ) ;
    }
    for ( int i = N - 1 ;
    i >= 0 ;
    i -- ) {
      int [ ] GLD_new = new int [ GLD . length ] ;
      for ( int ta = 0 ;
      ta < MAX_TIME + 1 ;
      ta ++ ) {
        int ta_s = Math . min ( T - C - 1 + ta , MAX_TIME ) ;
        int ta_n = Math . min ( T + ta , MAX_TIME ) ;
        int g = GLD [ ta_n ] ;
        if ( ta_s >= 0 && G [ i ] + GLD [ ta_s ] > g ) {
          g = G [ i ] + GLD [ ta_s ] ;
        }
        GLD_new [ ta ] = g ;
      }
      GLD = GLD_new ;
      if ( debug ) {
        System . out . println ( GLD ) ;
      }
    }
    System . out . println ( "Case #" + t + ":" + GLD [ 1 ] ) ;
    System