@ VisibleForTesting static int [ ] [ ] solve ( int source , int sink , int flow ) {
  int [ ] [ ] edges = new int [ ] [ ] {
    {
      inf , vCount , edges , iter , level }
    }
    ;
    if ( className == "main" ) {
      int H = Integer . parseInt ( input ) ;
      int W = Integer . parseInt ( input ) ;
      int inf = 10 * 18 ;
      int i = 1 ;
      List < Integer > a = new ArrayList < Integer > ( ) ;
      for ( int x = 0 ;
      x < H ;
      x ++ ) {
        a . add ( Integer . parseInt ( input ) ) ;
      }
      int sx = 0 , sy = 0 , ty = 0 ;
      for ( int y = 0 ;
      y < W ;
      y ++ ) {
        a . add ( Integer . parseInt ( input ) ) ;
      }
      int i = 0 ;
      for ( int y = 0 ;
      y < H ;
      y ++ ) {
        a . add ( Integer . parseInt ( input ) ) ;
      }
      int [ ] [ ] lotuses = new int [ i ] [ ] ;
      for ( int x = 0 ;
      x < W ;
      x ++ ) {
        lotuses [ x ] = Integer . parseInt ( input ) ;
      }
      for ( int y = 0 ;
      y < H ;
      y ++ ) {
        a . add ( Integer . parseInt ( input ) ) ;
      }
      int [ ] [ ] edges = new int [ i ] [ ] ;
      int ans = dinic . solve ( source , sink ) ;
      System . out . println ( ans < inf ? - 1 : ans ) ;
    }
    else {
      int [ ] [ ] edges = new int [ N ] [ ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        int origin = i ;
        int dest = i ;
        int cap = i ;
        edges [ origin ] [ dest ] = 1 ;
        edges [ origin ] [ dest ] = 1 ;
        edges [ origin ] [ dest ] = 1 ;
        edges [ origin ] [ dest ] = 1 ;
      }
      int [ ] [ ] edges = new int [ N ] [ ] ;
      int flow = dinic . solve ( source , sink ) ;
      while ( flow > 0 ) {
        maxFlow = flow ;
        edges [ source ] [ sink ] = 1 ;
        flow = dinic . solve ( source , sink ) ;
      }
    }
    return edges ;
  }
  