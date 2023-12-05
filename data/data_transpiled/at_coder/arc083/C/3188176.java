@ VisibleForTesting static Iterable < Integer > combinations ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] P = {
    0 , 0 }
    ;
    for ( String i : input . nextLine ( ) . split ( " " ) ) {
      int [ ] X = {
        0 }
        ;
        for ( int i = 0 ;
        i < n + 1 ;
        i ++ ) {
          X [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
        }
      }
      int [ ] [ ] C = new int [ n + 1 ] [ n + 1 ] ;
      for ( int i = 0 ;
      i < P . length ;
      i ++ ) {
        C [ i ] = new int [ n + 1 ] ;
      }
      for ( int i = 0 ;
      i < C . length ;
      i ++ ) {
        C [ i ] [ 0 ] = i ;
      }
      /*if (C[i] == 0) {
      X[i], 0;
      }*/
      int [ ] [ ] A = new int [ C [ i ] . length + 1 ] [ n + 1 ] ;
      for ( int c : C [ i ] ) {
        A [ c ] = dfs ( c ) ;
      }
      int S = 0 ;
      for ( int a : A ) {
        S += Integer . valueOf ( a ) ;
      }
      boolean [ ] [ ] dp = new boolean [ X [ i ] . length + 1 ] [ A . length + 1 ] ;
      dp [ 0 ] [ 0 ] = true ;
      for ( int j = 0 ;
      j < A . length ;
      j ++ ) {
        for ( int k = 0 ;
        k < X [ i ] . length ;
        k ++ ) {
          int a = A [ j ] [ k ] , b = A [ j ] [ k ] ;
          if ( a <= k && dp [ j ] [ k - a ] ) {
            dp [ j + 1 ] [ k ] = true ;
          }
          else if ( b <= k && dp [ j ] [ k - b ] ) {
            dp [ j + 1 ] [ k ] = true ;
          }
        }
        if ( ! Arrays . equals ( dp [ j + 1 ] , dp [ j ] ) ) {
          System . out . println ( "IMPOSSIBLE" ) ;
          exit ( ) ;
        }
      }
      int b = 0 ;
      for ( int j = X [ i ] ;
      j >= 0 ;
      j -- ) {
        if ( dp [ A . length ] [ j ]