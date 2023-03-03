public static int [ ] [ ] DFS ( int [ ] [ ] L , int s , int t ) {
  ArrayList < int [ ] > S = new ArrayList < int [ ] > ( ) ;
  S . add ( new int [ ] {
    s , 0 }
    ) ;
    int [ ] [ ] P = new int [ T ] ;
    int [ ] D = new int [ L . length ] ;
    while ( S . size ( ) != 0 ) {
      int [ ] k = S . remove ( S . size ( ) - 1 ) ;
      P [ k [ 1 ] ] = k [ 0 ] ;
      if ( L [ k [ 0 ] ] [ T - 1 ] > 0 ) {
        P [ k [ 1 ] + 1 ] = T - 1 ;
        return P ;
      }
      for ( int i = 0 ;
      i < L . length ;
      i ++ ) {
        if ( D [ i ] == 0 && L [ k [ 0 ] ] [ i ] > 0 ) {
          S . add ( new int [ ] {
            i , k [ 1 ] + 1 }
            ) ;
            D [ i ] = 1 ;
          }
        }
        return false ;
      }
      @ SuppressWarnings ( "unused" ) int N = Integer . parseInt ( input ( ) ) ;
      int G = Integer . parseInt ( input ( ) ) ;
      int E = Integer . parseInt ( input ( ) ) ;
      int [ ] p = new int [ G ] ;
      int [ ] ab = new int [ E ] ;
      for ( int i = 0 ;
      i < E ;
      i ++ ) {
        ab [ i ] = Integer . parseInt ( input ( ) ) ;
      }
      int T = N + 1 ;
      int [ ] [ ] Data = new int [ T ] [ T ] ;
      int [ ] [ ] L = new int [ T ] [ T ] ;
      for ( int i = 0 ;
      i < T ;
      i ++ ) {
        for ( int j = 0 ;
        j < T ;
        j ++ ) {
          Data [ i ] [ j ] = 1 ;
          L [ i ] [ j ] = 1 ;
        }
      }
      Queue < Integer > Q = new ArrayDeque < Integer > ( ) ;
      int [ ] F = new int [ T ] ;
      while ( Q . size ( ) > 0 ) {
        t = Q . poll ( ) ;
        F [ t ] = 1 ;
        for ( int i = 0 ;
        i < T ;
        i ++ ) {
          if ( Data [ t ] [ i ] == 1 ) {
            L [ t ] [ i ] = 1 ;
            if