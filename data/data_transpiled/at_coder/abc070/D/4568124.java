static private int [ ] [ ] dijkstraHeap ( int s ) {
  final double [ ] [ ] d = new double [ n ] [ n ] ;
  final boolean [ ] used = new boolean [ n ] ;
  Arrays . fill ( d , true ) ;
  d [ s ] = 0 ;
  used [ s ] = false ;
  final List < List < Integer >> edgelist = new ArrayList < List < Integer >> ( ) ;
  for ( int e : edge [ s ] ) {
    heapifyEdgeList ( edgelist , e ) ;
  }
  while ( edgelist . size ( ) > 0 ) {
    final List < Integer > minedge = heapifyEdgeList ( edgelist ) ;
    if ( ! used [ minedge . get ( 1 ) ] ) continue ;
    final int v = minedge . get ( 1 ) ;
    d [ v ] = minedge . get ( 0 ) ;
    used [ v ] = false ;
    for ( int e : edge [ v ] ) {
      if ( used [ e ] . get ( ) ) heapifyEdgeList ( edgelist , e + d [ v ] , e + 1 ) ;
    }
  }
  return d ;
}
