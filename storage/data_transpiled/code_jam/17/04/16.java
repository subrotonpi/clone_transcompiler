private static boolean dfs ( int v , boolean [ ] vis , boolean [ ] back , boolean [ ] [ ] adj ) {
  if ( vis [ v ] ) return false ;
  vis [ v ] = true ;
  for ( int to : adj [ v ] ) {
    if ( has ) {
      if ( back [ to ] == - 1 || dfs ( back [ to ] , vis , back , adj ) ) {
        back [ to ] = v ;
        return true ;
      }
    }
  }
  /* prepare input */
  boolean [ ] [ ] res = new boolean [ nDiags ] [ ] ;
  for ( int i = 0 ;
  i < nDiags ;
  i ++ ) {
    int p1 = i ;
    int p2 = i ;
    if ( ! usedDiag1 [ p1 ] && ! usedDiag2 [ p2 ] ) {
      int r = fromDiag ( p1 , p2 , n ) ;
      int c = i ;
      if ( 0 <= r && 0 <= c && toDiag ( r , c , n ) == ( p1 , p2 ) ) {
        adj [ p1 ] [ p2 ] = true ;
      }
    }
    else {
      String filename = "../input.txt" ;
      int attempt = - 1 ;
      final int [ ] [ ] back = new int [ n ] ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        int r = i ;
        int c = i ;
        if ( attempt >= 0 && r < n && c < n ) {
          adj [ r ] [ c ] = false ;
        }
      }
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        int b = i ;
        if ( b >= 0 ) {
          res [ r ] [ c ] = ( b == 0 ) ? 1 : 0 ;
        }
      }
    }
  }
  /* to solve */
  int tests = Integer . parseInt ( input ( ) ) ;
  for ( int i = 1 ;
  i < tests + 1 ;
  i ++ ) {
    solve ( i , res [ i ] ) ;
  }
  /* from the solution */
  int [ ] [ ] res = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    res [ i ] [ 0 ] = i ;
  }
  int [ ] [ ] out = new int [ n ] [ n ] ;
  boolean [ ] usedRows = new boolean [ n ] ;
  boolean [ ] usedCols = new boolean [ n ] ;
  boolean [ ] [ ] usedDiag1 = new boolean [ n