private static int dfs ( int [ ] [ ] links , int [ ] fixed , int s ) {
  PriorityQueue < Integer > q = new PriorityQueue < > ( ) ;
  q . add ( new Integer ( s ) ) ;
  int [ ] cnt = {
    0 , 0 }
    ;
    while ( q . size ( ) > 0 ) {
      int v = q . poll ( ) ;
      int c = links [ v ] [ s ] ;
      if ( fixed [ v ] > - 1 ) {
        if ( fixed [ v ] != c ) {
          return false ;
        }
        continue ;
      }
      fixed [ v ] = c ;
      cnt [ c ] ++ ;
      for ( int u : links [ v ] ) {
        q . add ( new Integer ( u ) ) ;
      }
    }
    return ( Math . max ( cnt , 0 ) ) ;
  }
  