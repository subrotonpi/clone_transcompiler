@ VisibleForTesting static int [ ] [ ] floydWarshall ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  double [ ] [ ] dis = new double [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    dis [ i ] [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    dis [ a - 1 ] [ b - 1 ] = t ;
  }
  cost = dijkstra ( dis ) ;
  int [ ] ans = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) ans [ i ] = Math . max ( cost [ i ] ) ;
  return ans ;
}
