@ VisibleForTesting static int [ ] [ ] dijkstra ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  double [ ] [ ] d = new double [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) d [ i ] [ i ] = Double . MAX_VALUE ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    d [ a - 1 ] [ b ] = t ;
  }
  cost = dijkstra ( d ) ;
  int [ ] ans = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) ans [ i ] = Math . max ( cost [ i ] ) ;
  return ans ;
}
