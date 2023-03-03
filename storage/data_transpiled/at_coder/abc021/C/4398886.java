@ VisibleForTesting static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  a -- ;
  b -- ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  boolean [ ] [ ] adjMat = new boolean [ n ] [ n ] ;
  for ( int j = 0 ;
  j < m ;
  j ++ ) {
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int x = Integer . parseInt ( input . nextLine ( ) ) ;
      int y = Integer . parseInt ( input . nextLine ( ) ) ;
      adjMat [ x - 1 ] [ y - 1 ] = true ;
      adjMat [ y - 1 ] [ x - 1 ] = true ;
    }
  }
  boolean [ ] queued = new boolean [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) queued [ i ] = false ;
  int [ ] shortestPaths = new int [ n ] ;
  int [ ] shortestDist = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      int st = Integer . parseInt ( input . nextLine ( ) ) ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        if ( adjMat [ st ] [ i ] ) {
          if ( ! queued [ i ] ) {
            q . add ( i ) ;
            queued [ i ] = true ;
          }
          shortestDist [ i ] = Math . min ( shortestDist [ i ] , shortestDist [ st ] + 1 ) ;
          if ( shortestDist [ i ] == shortestDist [ st ] + 1 ) {
            shortestPaths [ i ] += shortestPaths [ st ] ;
            shortestPaths [ i ] %= 10 * 9 + 7 ;
          }
        }
      }
    }
  }
  System . out . println ( shortestPaths [ b ] ) ;
}
