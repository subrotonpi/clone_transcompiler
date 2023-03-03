@ VisibleForTesting static int [ ] [ ] floydWarshall ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  double [ ] [ ] d = new double [ n ] [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    d [ i ] [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    int l = Integer . parseInt ( input . nextLine ( ) ) ;
    d [ a - 1 ] [ b - 1 ] = l ;
    d [ b - 1 ] [ a - 1 ] = l ;
  }
  d = floydWarshall ( d ) ;
  double toomawari = Double . MAX_VALUE ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    double cur = Math . max ( d [ i ] ) ;
    if ( toomawari > cur ) toomawari = cur ;
  }
  System . out . println ( ( int ) toomawari ) ;
  return d ;
}
