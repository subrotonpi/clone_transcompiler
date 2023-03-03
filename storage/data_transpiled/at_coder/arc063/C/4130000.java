@ VisibleForTesting static void dfs ( int answer , int [ ] [ ] input ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  {
    int inpl = Integer . parseInt ( input [ 0 ] [ 0 ] ) ;
    int N = Integer . parseInt ( input [ 1 ] [ 0 ] ) ;
    int [ ] G = new int [ N + 1 ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      G [ i ] [ 0 ] = input [ i ] [ 0 ] ;
    }
    int [ ] X = new int [ N + 1 ] ;
    int [ ] U = new int [ N + 1 ] ;
    int [ ] L = new int [ N + 1 ] ;
    for ( int i = 0 ;
    i < N - 1 ;
    i ++ ) {
      int a = inpl ++ ;
      int b = inpl ++ ;
      G [ a ] [ 0 ] = b ;
      G [ b ] [ 0 ] = a ;
    }
    int K = Integer . parseInt ( input [ 1 ] [ 0 ] ) ;
    for ( int i = 0 ;
    i < K ;
    i ++ ) {
      int v = inpl ++ ;
      int p = inpl ++ ;
      U [ v ] = p ;
      L [ v ] = 1e7 ;
      X [ v ] = p ;
      for ( int j = 0 ;
      j < L . length ;
      j ++ ) {
        U [ i ] = U [ j ] ;
        L [ v ] = L [ j ] ;
        X [ v ] = p ;
      }
    }
    boolean [ ] searched = new boolean [ N + 1 ] ;
    {
      int u = 0 ;
      int l = 0 ;
      int x = 0 ;
      int i = 0 ;
      for ( int j = 0 ;
      j < G [ i ] . length ;
      j ++ ) {
        searched [ j ] = true ;
        if ( X [ i ] >= 0 && X [ i ] != x ) {
          X [ i ] = 2 ;
          return - 1e7 ;
        }
        U [ i ] = Math . min ( U [ i ] , u ) ;
        L [ i ] = Math . max ( L [ i ] , l ) ;
        X [ i ] = x ;
        for ( int j = 0 ;
        j < G [ i ] [ j ] ;
        j ++ ) {
          if ( searched [ j ] ) continue ;
          int nu = dfs ( U [ i ] + 1 , L [ i ] - 1 , ( X [ i ] + 1 ) % 2 , j ) ;
          U [ i ]