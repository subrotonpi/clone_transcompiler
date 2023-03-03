@ VisibleForTesting static int [ ] [ ] floydWarshall ( ) {
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  final int m = Integer . parseInt ( input . nextLine ( ) ) ;
  final int r = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < Integer > L = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    L . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  final double [ ] [ ] d = new double [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    d [ i ] [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    final int a = Integer . parseInt ( input . nextLine ( ) ) ;
    final int b = Integer . parseInt ( input . nextLine ( ) ) ;
    d [ a - 1 ] [ b - 1 ] = l ;
    d [ b - 1 ] [ a ] = l ;
  }
  d = floydWarshall ( d ) ;
  double ans = Double . MAX_VALUE ;
  return d ;
}
