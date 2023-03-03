public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( args [ 0 ] ) ;
  int T = Integer . parseInt ( args [ 1 ] ) ;
  int minCost = 0 ;
  int minCostTime = 0 ;
  for ( int i = 0 ;
  i <= N ;
  i ++ ) {
    int c = Integer . parseInt ( args [ 2 ] ) ;
    int t = Integer . parseInt ( args [ 3 ] ) ;
    if ( t <= T ) {
      if ( minCost == 0 ) {
        minCost = c ;
        minCostTime = t ;
      }
      else {
        if ( c < minCost ) {
          minCost = c ;
          minCostTime = t ;
        }
      }
    }
  }
  if ( minCost == 0 ) {
    System . out . println ( "TLE" ) ;
  }
  else {
    System . out . println ( minCost ) ;
  }
}
