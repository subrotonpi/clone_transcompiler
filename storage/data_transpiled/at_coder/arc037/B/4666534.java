private static int dfs ( ) {
  int ret = 1 ;
  while ( stack . size ( ) > 0 ) {
    int node = stack . pop ( ) ;
    int parent = node ;
    visited [ node ] = 1 ;
    for ( int e : edges [ node ] ) {
      if ( ( e != parent ) && ( visited [ e ] == 1 ) ) {
        ret = 0 ;
      }
      else if ( ( e != parent ) && ( visited [ e ] == 0 ) ) {
        stack . push ( new int [ ] {
          e , node }
          ) ;
        }
      }
      return ret ;
    }
    if ( ( getClass ( ) . getName ( ) . equals ( "java.util.Scanner" ) ) ) {
      int N = Integer . parseInt ( input . nextLine ( ) ) ;
      int M = Integer . parseInt ( input . nextLine ( ) ) ;
      int [ ] edges = new int [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        edges [ i ] = new HashSet < > ( ) ;
        for ( int e = 0 ;
        e < edges [ i ] ;
        e ++ ) {
          edges [ i ] . add ( new HashSet < > ( ) ) ;
        }
      }
      visited = new int [ N ] ;
      int res = 0 ;
      stack = new int [ N ] ;
      for ( int i = 0 ;
      i < M ;
      i ++ ) {
        int u = Integer . parseInt ( input . nextLine ( ) ) ;
        int v = Integer . parseInt ( input . nextLine ( ) ) ;
        u = u - 1 ;
        v = v - 1 ;
        edges [ u ] . add ( v ) ;
        edges [ v ] . add ( u ) ;
      }
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        if ( ( visited [ i ] == 0 ) && ( i < N ) ) {
          stack . push ( new int [ ] {
            i , - 1 }
            ) ;
            res += dfs ( ) ;
          }
        }
        System . out . println ( res ) ;
      }
      return 0 ;
    }
    