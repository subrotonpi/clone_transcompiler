@ VisibleForTesting static void dijkstra ( ) {
  final int INF = 10 * 18 ;
  class edge {
    int to ;
    int cost ;
  }
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int L = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < List < Edge >> G = new ArrayList < > ( L + 1 ) ;
  final int [ ] d = new int [ L + 1 ] ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) {
    G . add ( new ArrayList < > ( ) ) ;
  }
  final int [ ] d = new int [ L + 1 ] ;
  for ( int i = 0 ;
  i < L + 1 ;
  i ++ ) {
    d [ i ] = INF ;
  }
  dijkstra ( s ) ;
  while ( que . size ( ) > 0 ) {
    final List < Edge > p = que . get ( ) ;
    final int v = p . get ( 1 ) ;
    if ( ( d [ v ] < d [ v ] ) || ( d [ v ] > d [ v ] ) ) {
      continue ;
    }
    for ( int i = 0 ;
    i < G . size ( ) ;
    i ++ ) {
      G . get ( i + 1 ) . add ( edge ( i , 0 ) ) ;
    }
  }
  dijkstra ( 0 ) ;
  System . out . println ( d [ L ] ) ;
}
