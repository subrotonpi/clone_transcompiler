@ VisibleForTesting static int [ ] [ ] floyd_warshall ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > uvl = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) uvl . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  final double INF = Double . POSITIVE_INFINITY ;
  int [ ] [ ] d = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) d [ i ] [ i ] = INF ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) d [ i ] [ i ] = 0 ;
  for ( int i = 0 ;
  i < uvl . size ( ) ;
  i ++ ) {
    int u = uvl . get ( i ) ;
    int v = uvl . get ( i ) ;
    int l = uvl . get ( i ) ;
    if ( u != 1 && v != 1 ) {
      d [ u - 1 ] [ v - 1 ] = l ;
      d [ v - 1 ] [ u - 1 ] = l ;
    }
  }
  d = wf ( d ) ;
  List < Integer > start = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    if ( uvl . get ( i ) . intValue ( ) == 1 ) start . add ( uvl . get ( i ) ) ;
  }
  double ans = INF ;
  for ( int j = 0 ;
  j < start . size ( ) ;
  j ++ ) {
    if ( start . get ( j ) != j && d [ i ] [ j ] - 1 ] != INF ) {
      double tmp = start . get ( j ) . doubleValue ( ) + j . doubleValue ( ) + d [ i ] . doubleValue ( ) ;
      ans = Math . min ( ans , tmp ) ;
    }
  }
  System . out . println ( ans != INF ? ( int ) ans : - 1 ) ;
  return d ;
}
